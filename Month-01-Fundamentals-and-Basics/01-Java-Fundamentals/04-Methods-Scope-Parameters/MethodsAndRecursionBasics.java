package month01.fundamentals.methods;

public class MethodsAndRecursionBasics {
    public static void main(String[] args) {
        // Java is STRICTLY pass-by-value
        int original = 50;
        modifyPrimitive(original);
        System.out.println("Primitive after method call: " + original); // Still 50

        int[] arr = {10, 20, 30};
        modifyReferenceValue(arr);
        System.out.println("Array[0] after method call: " + arr[0]); // 999 (copied reference pointed to same heap object)

        // Recursion demonstration
        System.out.println("Factorial of 5: " + factorial(5));
    }

    static void modifyPrimitive(int val) {
        val = 100;
    }

    static void modifyReferenceValue(int[] arrayRef) {
        arrayRef[0] = 999;
    }

    static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
}
