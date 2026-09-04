package month03.advanced.generics;

import java.util.*;

public class GenericsAndPECSPrinciple {
    // Producer Extends: Reading numbers from producer (Covariance)
    public static double sumOfList(List<? extends Number> list) {
        double s = 0.0;
        for (Number n : list) {
            s += n.doubleValue();
        }
        return s;
    }

    // Consumer Super: Adding numbers to consumer list (Contravariance)
    public static void addIntegers(List<? super Integer> list) {
        for (int i = 1; i <= 3; i++) {
            list.add(i);
        }
    }

    public static void main(String[] args) {
        List<Double> doubleList = Arrays.asList(1.5, 2.5, 3.5);
        System.out.println("Sum of list using ? extends Number: " + sumOfList(doubleList));

        List<Number> numList = new ArrayList<>();
        addIntegers(numList);
        System.out.println("List populated using ? super Integer: " + numList);
    }
}
