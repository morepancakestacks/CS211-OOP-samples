import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get user inputs
        System.out.print("Enter employee ID: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.print("Enter employee name: ");
        String name = scanner.nextLine();

        System.out.print("Enter employee role: ");
        String role = scanner.nextLine();

        System.out.print("Enter year employed: ");
        int yearEmployed = Integer.parseInt(scanner.nextLine());

        // Create an Employee object
        Employee employee = new Employee(id, name, role, yearEmployed);

        // Use setters to set the values
        employee.setId(id);
        employee.setName(name);
        employee.setRole(role);
        employee.setYearEmployed(yearEmployed);

        // Get and display the properties
        System.out.println("Employee ID: " + employee.getId());
        System.out.println("Employee Name: " + employee.getName());
        System.out.println("Employee Role: " + employee.getRole());
        System.out.println("Year Employed: " + employee.getYearEmployed());
    }
}