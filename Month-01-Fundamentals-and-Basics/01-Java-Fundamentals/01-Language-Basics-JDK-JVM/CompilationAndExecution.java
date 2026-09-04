package month01.fundamentals.basics;

/**
 * Demonstrates the compilation and execution architecture of Java:
 * 1. Source Code (.java) -> javac (Java Compiler) -> Bytecode (.class)
 * 2. ClassLoader loads bytecode into JVM memory.
 * 3. Execution Engine: Interpreter + JIT (Just-In-Time) Compiler for hotspot execution.
 */
public class CompilationAndExecution {
    public static void main(String[] args) {
        System.out.println("=== JVM Execution Lifecycle Demonstration ===");
        
        // Inspecting Runtime properties provided by JVM
        String javaVersion = System.getProperty("java.version");
        String jvmName = System.getProperty("java.vm.name");
        String osName = System.getProperty("os.name");
        long maxMemoryMB = Runtime.getRuntime().maxMemory() / (1024 * 1024);

        System.out.println("Java Version: " + javaVersion);
        System.out.println("JVM Engine  : " + jvmName);
        System.out.println("OS Name     : " + osName);
        System.out.println("Max Heap MB : " + maxMemoryMB + " MB");
    }
}
