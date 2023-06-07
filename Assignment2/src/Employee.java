import java.util.Comparator;

public class Employee
{
    private String name;
    private int age;
    private String location;
    private String department;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Employee() {
    }

    public Employee(String name, int age, String location, String department) {
        this.name = name;
        this.age = age;
        this.location = location;
        this.department = department;
    }

    @Override
    public String toString()
    {
        return "Employee[name = "+name+", age = "+age+", location = "+location+", department = "+department+"]";
    }
}
