package month02.oop.modifiers;

public class StaticAndFinalModifiers {
    // Constant - initialized at class loading, cannot be reassigned
    public static final String PLATFORM_NAME = "Enterprise Java Engine";
    
    // Class-level variable shared across all instances
    private static int instanceCount = 0;

    // Instance-level immutable property
    private final int instanceId;

    public StaticAndFinalModifiers() {
        this.instanceId = ++instanceCount;
    }

    public static int getTotalInstances() {
        return instanceCount;
    }

    public int getInstanceId() {
        return this.instanceId;
    }

    public static void main(String[] args) {
        StaticAndFinalModifiers obj1 = new StaticAndFinalModifiers();
        StaticAndFinalModifiers obj2 = new StaticAndFinalModifiers();
        System.out.println("Platform: " + PLATFORM_NAME);
        System.out.println("Object 1 ID: " + obj1.getInstanceId());
        System.out.println("Object 2 ID: " + obj2.getInstanceId());
        System.out.println("Total Instances created: " + StaticAndFinalModifiers.getTotalInstances());
    }
}
