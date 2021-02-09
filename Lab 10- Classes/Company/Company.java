import java.util.ArrayList;

public class Company {

    private ArrayList<Employee> Employees;

    public Company(){
        this.Employees = new ArrayList<>();
    }

    public ArrayList<Employee> getEmployees(){
        return this.Employees;
    }

    public boolean addToList(Employee e){
        Employees.add(e);
        return true;
    }

    public boolean removeFromList(Employee e){
        int pos = -1;
        for(int i = 0; i < Employees.size();i++)
            if(Employees.get(i) == e)
                Employees.remove(i);
            return true;
    }

    public void printList(){
        for(int i = 0; i < Employees.size();i++)
            System.out.println(Employees.get(i).toString());
    }
}
