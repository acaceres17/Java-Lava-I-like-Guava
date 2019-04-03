package CH9Inheritance;

public class MarketerV2 extends EmployeeV1{
    public double getSalary() {
        //I want to add 10000.0 to the base employee class
        return super.getSalary() + 10000.0; //$50,000 / year
    }
    public void advertise() {
        System.out.println("I'll convince you to hire our law firm");
    }
}
