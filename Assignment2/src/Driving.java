import java.util.ArrayList;

import java.util.Collections;
public class Driving
{
    public static void main(String args[])
    {
        Factory factory = new Factory();
        ArrayList<Employee> emplist = new ArrayList<>();
        Employee employee1 = new Employee("Shivam",23,"Bengaluru","Maveric");
        Employee employee2 = new Employee("Shivasankar",22,"Bengaluru","Maveric");
        Employee employee3 = new Employee("Ashutosh",24,"Bengaluru","Maveric");
        emplist.add(employee1);
        emplist.add(employee2);
        emplist.add(employee3);

        Collections.sort(emplist, factory);
        factory.setEmp(emplist);
        System.out.println(factory);

    }
}
