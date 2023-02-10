package homeworks.employee;

public class EmployeeStorage {

    private Employee[] array = new Employee[10];

    private int size = 0;


    public void add(Employee value) {
        if (size == array.length - 1) {
            extend();
        }
        array[size++] = value;
    }

    private void extend() {
        Employee[] newArray = new Employee[array.length + 10];
        for (int i = 0; i < array.length; i++) {
            newArray[i] = array[i];
        }
        array = newArray;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(array[i] + " ");
        }
    }

    public void searchByName(String keyword) {
        boolean found = false;
        for (int i = 0; i < size; i++) {
            Employee employee = array[i];
            if (employee.getName().contains(keyword)) {
                found = true;
                System.out.println(employee);

            }
        }
        if (!found) {
            System.out.println("employee with " + keyword + "does not exists");
        }

    }
}





