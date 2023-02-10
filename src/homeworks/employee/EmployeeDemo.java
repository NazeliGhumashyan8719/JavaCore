package homeworks.employee;

import java.sql.SQLOutput;
import java.util.Scanner;

public class EmployeeDemo {

    public static void main(String[] args) {
        Employee myEmployee = new Employee();
        System.out.println(myEmployee.toString());
        Scanner scanner = new Scanner(System.in);
        EmployeeStorage employeeStorage = new EmployeeStorage();

        boolean isRun = true;

        while (isRun) {
            System.out.println("Please input 0 for exit");
            System.out.println("Please input 1 for add employee");
            System.out.println("Please input 2 for print all employees");
            System.out.println("Please input 3 for search employee by name");
            System.out.println("Please input 4 for search employee by company name");
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    System.out.println("Please input employee name");
                    String name = scanner.nextLine();
                    System.out.println("Please input employee's surname");
                    String surname = scanner.nextLine();
                    System.out.println("Please input employee's ID");
                    String ID = scanner.nextLine();
                    System.out.println("Please input employee's salary");
                    int salary = Integer.parseInt(scanner.nextLine());
                    System.out.println("Please input employee;s company");
                    String company = scanner.nextLine();
                    System.out.println("Please input employee;s position");
                    String position = scanner.nextLine();
                    Employee employee = new Employee(name, surname, ID, salary, company, position);
                    employeeStorage.add(employee);
                    System.out.println("Employee is created");


                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    System.out.println("Please input keyword");
                    String keyword = scanner.nextLine();
                    employeeStorage.searchByName(keyword);
                    break;
                default:
                    System.out.println("Wrong command. Please try again");
            }
        }
    }
}




