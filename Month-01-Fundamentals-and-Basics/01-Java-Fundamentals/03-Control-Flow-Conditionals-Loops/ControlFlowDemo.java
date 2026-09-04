package month01.fundamentals.controlflow;

public class ControlFlowDemo {
    public static void main(String[] args) {
        int day = 3;
        
        // Modern Java Switch Expression (Java 14+)
        String dayType = switch (day) {
            case 1, 2, 3, 4, 5 -> "Weekday";
            case 6, 7 -> "Weekend";
            default -> throw new IllegalArgumentException("Invalid day: " + day);
        };
        System.out.println("Day " + day + " is a: " + dayType);

        // Labeled break and continue in nested loops
        outerLoop:
        for (int row = 1; row <= 3; row++) {
            for (int col = 1; col <= 3; col++) {
                if (row == 2 && col == 2) {
                    System.out.println("Breaking outer loop at row 2, col 2");
                    break outerLoop;
                }
                System.out.printf("Cell [%d, %d] ", row, col);
            }
            System.out.println();
        }
    }
}
