package month03.advanced.streams;

import java.util.*;
import java.util.stream.Collectors;

record Employee(String name, String department, double salary) {}

public class StreamPipelinesAndCollectors {
    public static void main(String[] args) {
        List<Employee> employees = List.of(
            new Employee("Sachin", "Engineering", 120_000),
            new Employee("Rahul", "Engineering", 110_000),
            new Employee("Aman", "Product", 95_000),
            new Employee("Sneha", "HR", 85_000),
            new Employee("Pooja", "Engineering", 130_000)
        );

        // Grouping employees by department
        Map<String, List<Employee>> byDept = employees.stream()
            .collect(Collectors.groupingBy(Employee::department));
        System.out.println("Employees by Dept: " + byDept.keySet());

        // Average salary per department
        Map<String, Double> avgSalaryByDept = employees.stream()
            .collect(Collectors.groupingBy(
                Employee::department,
                Collectors.averagingDouble(Employee::salary)
            ));
        System.out.println("Average Salary: " + avgSalaryByDept);

        // Top earner in Engineering
        Optional<Employee> topEngineer = employees.stream()
            .filter(e -> "Engineering".equals(e.department()))
            .max(Comparator.comparingDouble(Employee::salary));
        topEngineer.ifPresent(e -> System.out.println("Top Engineer: " + e.name() + " ($" + e.salary() + ")"));
    }
}
