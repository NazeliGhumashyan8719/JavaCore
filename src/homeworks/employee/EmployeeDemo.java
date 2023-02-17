package homeworks.employee;

import homeworks.employee.model.Employee;
import homeworks.employee.storage.EmployeeStorage;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;
import java.util.Date;

public class EmployeeDemo {
    private static Scanner scanner = new Scanner(System.in);
    private static EmployeeStorage employeeStorage = new EmployeeStorage();

    public static void main(String[] args) {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        String dateStr = sdf.format(date);
        System.out.println(dateStr);

        boolean isRun = true;
        employeeStorage.add(new Employee("Ara", "Amyan", "a001", 1000, "company 1", "QA"));
        employeeStorage.add(new Employee("Gor", "Papyan", "a002", 2000, "company 1", "jr. manager"));
        employeeStorage.add(new Employee("Arno", "Amyan", "a003", 3000, "company 1", "sr. manager"));
        while (isRun) {
            printCommands();
            String command = scanner.nextLine();
            switch (command) {
                case "0":
                    isRun = false;
                    break;
                case "1":
                    addEmployee();
                    break;
                case "2":
                    employeeStorage.print();
                    break;
                case "3":
                    getEmployeeById();
                    break;
                case "4":
                    System.out.println("Please input company name");
                    String companyName = scanner.nextLine();
                    employeeStorage.searchEmployeeByCompanyName(companyName);
                    break;
                case "5":
                    searchEmployeeBySalaryRange();
                    break;
                case "6":
                    changePositionByEmployeeId();
                    break;
                case "7":
                    employeeStorage.printByStatus(true);
                    break;
                case "8":
                    inactiveEmployee();
                    break;
                case "9":
                    activateEmployee();
                    break;
                default:
                    System.out.println("Wrong command.Please try again!");
            }
        }
    }

    private static void activateEmployee() {
        employeeStorage.printByStatus(false);
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null || employee.isActive()) {
            System.out.println("Wrong employee ID, or employee is active. Please try again!");
        } else {
            employee.setActive(true);
            System.out.println("Status changed!");
        }
    }

    private static void inactiveEmployee() {
        employeeStorage.printByStatus(true);
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null || !employee.isActive()) {
            System.out.println("Wrong employee ID, or employee is inactive. Please try again!");
        } else {
            employee.setActive(false);
            System.out.println("Status changed!");
        }
    }

    private static void changePositionByEmployeeId() {
        employeeStorage.printByStatus(true);
        System.out.println("please choose employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("Wrong employee ID, please try again!");
        } else {
            System.out.println("please input new position name");
            String position = scanner.nextLine();
            employee.setPosition(position);
            System.out.println("Position changed!");

        }
    }

    private static void searchEmployeeBySalaryRange() {
        System.out.println("Pleas input minPrice,maxPrice");
        String salaryRangeStr = scanner.nextLine();
        String[] salaryRange = salaryRangeStr.split(",");
        double minPrice = Double.parseDouble(salaryRange[0]);
        double maxPrice = Double.parseDouble(salaryRange[1]);
        if (maxPrice < minPrice) {
            System.out.println("minaPrice should be less then maxPrice");
            return;
        }
        employeeStorage.searchBySalaryRange(minPrice, maxPrice);

    }

    private static void printCommands() {
        System.out.println("Please input 0 for exit");
        System.out.println("Please input 1 for add employee");
        System.out.println("Please input 2 for print employees");
        System.out.println("Please input 3 for search employee by id");
        System.out.println("Please input 4 for search employee by company name");
        System.out.println("Please input 5 for search employee by salary range");
        System.out.println("Please input 6 for change position");
        System.out.println("Please input 7 for print only active employee");
        System.out.println("Please input 8 for inactive employee by id");
        System.out.println("Please input 9 for activate employee by id");
    }

    private static void addEmployee() {
        System.out.println("Please input name,surname,employeeId,salary,companyName,position");
        String employeeDataStr = scanner.nextLine();
        String[] employeeData = employeeDataStr.split(",");
        String employeeId = employeeData[2];
        Employee employeeById = employeeStorage.getEmployeeById(employeeId);
        if (employeeById == null) {
            Employee employee = new Employee(employeeData[0], employeeData[1], employeeData[2],
                    Double.parseDouble(employeeData[3]), employeeData[4], employeeData[5]);
            employeeStorage.add(employee);
            System.out.println("Employee was added");
        } else {
            System.out.println("Employee with " + employeeId + " id already exist");
        }

    }

    private static void getEmployeeById() {
        System.out.println("Please input employee id");
        String employeeId = scanner.nextLine();
        Employee employee = employeeStorage.getEmployeeById(employeeId);
        if (employee == null) {
            System.out.println("employee with " + employeeId + " id does not exist");
        } else {
            System.out.println(employeeId);
        }
    }
}

