package month02.oop.abstraction;

interface Auditable {
    // Implicitly public static final
    String AUDIT_SYSTEM = "SEC-LOG-V2";

    void auditEvent(String message);

    // Default method (Java 8+) allows interface evolution without breaking implementers
    default void logSystem() {
        System.out.println("Auditing under framework: " + AUDIT_SYSTEM);
    }
}

interface Encryptable {
    byte[] encrypt(String data);
}

class TransactionLogger implements Auditable, Encryptable {
    @Override
    public void auditEvent(String message) {
        System.out.println("[AUDIT LOG]: " + message);
    }

    @Override
    public byte[] encrypt(String data) {
        return data.getBytes(); // Simplified encryption stub
    }
}

public class InterfacesAndAbstractClasses {
    public static void main(String[] args) {
        TransactionLogger logger = new TransactionLogger();
        logger.logSystem();
        logger.auditEvent("User 102 transferred $500.");
    }
}
