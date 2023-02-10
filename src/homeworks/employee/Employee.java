package homeworks.employee;

public class Employee {
    private String name;
    private String surname;
    private String ID;
    private int salary;
    private String company;
    private String position;

    @Override
    public String toString() {
        return ("name " + name + " surname " + surname + " ID " + ID + " salary " + salary + " company " + company + " position " + position);
    }

    public Employee() {
    }

    public Employee(String name, String surname, String employeeID, int salary, String company, String position) {
        this.name = name;
        this.surname = surname;
        this.ID = ID;

        this.salary = salary;
        this.company = company;
        this.position = position;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {

        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getEmployeeID() {
        return ID;
    }

    public void setEmployeeID(String employeeID) {
        this.ID = employeeID;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {

    }

}





