public class Employee extends Person{
    private double salary;
    private String empID;

    public Employee(String name, String address, String phone, String employee, double sal){
        super(name,address,phone);
        salary = sal;
        empID = employee;
    }

    public void raiseSalary(int r){
        double percent = r/100.0;
        double amount = percent * this.getSalary();
        this.salary += amount;
    }

    public double getSalary() {
        return salary;
    }

    public String getEmpID() {
        return empID;
    }

    public String toString() {
        return "Name:"+this.getName()+"\nAddress:"+this.getAddress()+"\nPhone:"+this.getPhone()+"\nEmployee:"+this.empID+"\nSalary:"+this.salary;
    }
}
