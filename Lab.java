import java.util.Scanner;
class Lab {
    private String name;
    private double baseSalary;
    private double bonus;

    // Constructor
    public Lab(String name, double baseSalary, double bonus) {
        this.name = name;
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }

    // Method to calculate total salary
    public double calculateSalary() {
        return baseSalary + bonus;
    }

    // Method to display employee information
    public void displayInfo() {
        System.out.printf("Employee Name: %s%n", name);
        System.out.printf("Base Salary: %.2f%n", baseSalary);
        System.out.printf("Bonus: %.2f%n", bonus);
        System.out.printf("Total Salary: %.2f%n%n", calculateSalary());
    }
}
public class EmployeeSalaryCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of employees: ");
        int n = scanner.nextInt();
        scanner.nextLine(); // Consume the newline

        Lab[] employees = new Lab[n];

        for (int i = 0; i < n; i++) {
            System.out.print("Enter employee name: ");
            String name = scanner.nextLine();
            System.out.print("Enter base salary: ");
            double baseSalary = scanner.nextDouble();
            System.out.print("Enter bonus (default is 0): ");
            double bonus = scanner.nextDouble();
            scanner.nextLine(); // Consume the newline

            employees[i] = new Lab(name, baseSalary, bonus);
        }

        System.out.println("\nEmployee Salary Information:\n");
        for (Lab emp : employees) {
            emp.displayInfo();
        }

        scanner.close();
    }
}
