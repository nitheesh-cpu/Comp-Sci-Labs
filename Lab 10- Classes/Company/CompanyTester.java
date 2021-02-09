import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class CompanyTester {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner input = new Scanner(new File("CompanyTester.txt"));
        ArrayList<Employee> Company = new ArrayList<>();
        System.out.println("List of company employees");
        while(input.hasNextLine()){
            Employee e = new Employee(input.nextLine(), input.nextLine(), input.nextLine(), input.nextLine(), input.nextInt());
            Company.add(e);
            System.out.println(e+"\n");
            input.nextLine();
        }
        System.out.println("List of company employees after hiring");
        Company.add(new Employee("Bob Cratchett","777 Christmas St, London, UK 1-4587","8-2-(238)433-8871","2501",25000.0));
        for (Employee employee : Company)
            System.out.println(employee+"\n");
        System.out.println("Salary after raise");
        for (Employee employee : Company) {
            if (employee.getSalary() > 100000) employee.raiseSalary(5);
            else if (employee.getSalary() > 50000) employee.raiseSalary(4);
            else employee.raiseSalary(3);
            System.out.println(employee+"\n");
        }
        Company.removeIf(employee -> employee.getEmpID().equals("2900"));
        System.out.println("List of employees after firings");
        for (Employee employee : Company)
            System.out.println(employee+"\n");
    }
}
