package Composite;

public class Employee extends OrganizationComponent {
    public Employee(String name) {
        super(name);
    }
    @Override
    public void display(int depth) {
        System.out.println(" ".repeat(depth) + "- Employee: " + name);
    }
    @Override
    public int getEmployeeCount() {
        return 1;
    }
}
