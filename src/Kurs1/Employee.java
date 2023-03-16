package Kurs1;
public class Employee {
    private static int idGenerator = 0;

    private int id;
    private String firstName;
    private String middleName;
    private String lastName;
    private int department;
    private int salary;

    public Employee(String firstName, String middleName, String lastName, int department, int salary) {
        this.id = idGenerator++;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.department = department;
        this.salary = salary;
    }



    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "Employee{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", department=" + department +
                ", salary=" + salary +
                '}' ;
    }
}

