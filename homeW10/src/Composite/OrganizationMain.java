package Composite;

public class OrganizationMain {
    public static void main(String[] args) {
        Department headOffice = new Department("Head Office");
        Department itDepartment = new Department("IT Department");
        Department hrDepartment = new Department("HR Department");

        itDepartment.add(new Employee("Alice"));
        itDepartment.add(new Employee("Bob"));
        hrDepartment.add(new Employee("Charlie"));

        headOffice.add(itDepartment);
        headOffice.add(hrDepartment);

        headOffice.display(1);
        System.out.println("Total Employees: " + headOffice.getEmployeeCount());
    }
}

