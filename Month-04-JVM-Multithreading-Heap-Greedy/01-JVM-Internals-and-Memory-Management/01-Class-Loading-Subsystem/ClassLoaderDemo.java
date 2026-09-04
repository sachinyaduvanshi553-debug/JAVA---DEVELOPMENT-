package month04.jvm.classloading;

public class ClassLoaderDemo {
    public static void main(String[] args) {
        // Application (System) ClassLoader loads classes from classpath
        ClassLoader appClassLoader = ClassLoaderDemo.class.getClassLoader();
        System.out.println("ClassLoader for this class: " + appClassLoader);

        // Platform / Extension ClassLoader (Parent of Application ClassLoader)
        ClassLoader platformClassLoader = appClassLoader.getParent();
        System.out.println("Parent ClassLoader (Platform): " + platformClassLoader);

        // Bootstrap ClassLoader (Parent of Platform, written in C/C++, represented as null)
        ClassLoader bootstrapClassLoader = platformClassLoader.getParent();
        System.out.println("Bootstrap ClassLoader (Core Java Classes like String): " + bootstrapClassLoader);

        ClassLoader stringClassLoader = String.class.getClassLoader();
        System.out.println("ClassLoader for java.lang.String: " + stringClassLoader); // null
    }
}
