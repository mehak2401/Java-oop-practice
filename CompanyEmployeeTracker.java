class Employee {
    private String empName;
    private double salary;

    public static String companyName = "Bright Horizon Technologies";
    public static int employeeCount = 0;

    public Employee(String empName, double salary) {
        this.empName = empName;
        this.salary = salary;
        employeeCount++;
    }

    public static void printCompanyInfo() {
        System.out.println(companyName);
        System.out.println("Employees on record: " + employeeCount);
    }
}

public class CompanyEmployeeTracker {

    public static void main(String[] args) {
        Employee e1 = new Employee("Aisha", 50000.0);
        Employee e2 = new Employee("Rohan", 60000.0);
        Employee e3 = new Employee("Karan", 55000.0);

        // Call static method through class name
        Employee.printCompanyInfo();
    }
}