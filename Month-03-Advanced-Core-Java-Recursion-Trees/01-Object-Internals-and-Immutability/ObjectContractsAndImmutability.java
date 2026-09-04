package month03.advanced.objectinternals;

import java.util.*;

// Immutable Class Design with defensive copying
public final class ObjectContractsAndImmutability {
    private final String id;
    private final Date createdDate; // Mutable object requires defensive copy
    private final List<String> permissions; // Collection requires unmodifiable copy

    public ObjectContractsAndImmutability(String id, Date createdDate, List<String> permissions) {
        this.id = id;
        this.createdDate = new Date(createdDate.getTime()); // Defensive Copy
        this.permissions = Collections.unmodifiableList(new ArrayList<>(permissions)); // Defensive Copy
    }

    public String getId() { return id; }
    public Date getCreatedDate() { return new Date(createdDate.getTime()); } // Defensive Getter
    public List<String> getPermissions() { return permissions; }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ObjectContractsAndImmutability that = (ObjectContractsAndImmutability) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return "UserSession{id='" + id + "', date=" + createdDate + ", permissions=" + permissions + "}";
    }

    public static void main(String[] args) {
        Date now = new Date();
        List<String> perms = new ArrayList<>(Arrays.asList("READ", "WRITE"));
        ObjectContractsAndImmutability session = new ObjectContractsAndImmutability("USR-01", now, perms);
        System.out.println("Session created: " + session);
    }
}
