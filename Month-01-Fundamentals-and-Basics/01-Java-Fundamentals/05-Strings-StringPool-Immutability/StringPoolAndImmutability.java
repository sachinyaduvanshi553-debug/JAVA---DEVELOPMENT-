package month01.fundamentals.strings;

public class StringPoolAndImmutability {
    public static void main(String[] args) {
        // String Literals -> Stored in String Constant Pool (Heap)
        String s1 = "Java";
        String s2 = "Java";
        
        // New Keyword -> Forces new Object allocation on Heap outside pool
        String s3 = new String("Java");
        String s4 = s3.intern(); // Reuses reference from String Constant Pool

        System.out.println("s1 == s2 (Literal Pool Match): " + (s1 == s2));      // true
        System.out.println("s1 == s3 (Heap vs Pool Object): " + (s1 == s3));     // false
        System.out.println("s1.equals(s3) (Content Equality): " + s1.equals(s3)); // true
        System.out.println("s1 == s4 (Interned String): " + (s1 == s4));         // true

        // StringBuilder vs Immutability performance
        StringBuilder sb = new StringBuilder();
        sb.append("High").append(" ").append("Performance").append(" ").append("Strings");
        System.out.println("StringBuilder output: " + sb.toString());
    }
}
