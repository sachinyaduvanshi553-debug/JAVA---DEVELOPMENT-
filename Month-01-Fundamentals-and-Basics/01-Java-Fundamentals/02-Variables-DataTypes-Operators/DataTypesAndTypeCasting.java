package month01.fundamentals.datatypes;

public class DataTypesAndTypeCasting {
    public static void main(String[] args) {
        // 8 Primitive Data Types:
        byte b = 127;           // 1 byte (-128 to 127)
        short s = 32767;        // 2 bytes
        int i = 2_147_483_647;  // 4 bytes
        long l = 9_223_372_036_854_775_807L; // 8 bytes
        float f = 3.14159f;     // 4 bytes IEEE 754
        double d = 2.718281828; // 8 bytes IEEE 754
        char c = 'J';           // 2 bytes Unicode
        boolean bool = true;    // 1 bit logical representation

        // Widening Casting (Implicit - smaller to larger type)
        double widened = i;
        System.out.println("Widened int to double: " + widened);

        // Narrowing Casting (Explicit - larger to smaller type, potential overflow)
        int narrowed = (int) d;
        System.out.println("Narrowed double to int: " + narrowed);
        
        byte overflow = (byte) (b + 1); // Overflow wraps around to -128
        System.out.println("Byte overflow demonstration (127 + 1): " + overflow);
    }
}
