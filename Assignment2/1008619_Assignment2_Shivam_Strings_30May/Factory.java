import java.util.Comparator;
import java.util.List;
public class Factory implements Comparator<Employee>
{
    List <Employee> emp;

    public List<Employee> getEmp() {
        return emp;
    }

    public void setEmp(List<Employee> emp) {
        this.emp = emp;
    }

    public Factory() {
    }

    public Factory(List<Employee> emp) {
        this.emp = emp;
    }

    @Override
    public int compare(Employee e1,Employee e2)
    {
     return e1.getName().compareTo(e2.getName());
    }
    @Override
    public String toString() {
        return "Factory{" +
                emp +
                '}';
    }
}
