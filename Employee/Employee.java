package Employee;
import java.util.*;

abstract class Employee implements Comparable<Employee> {
    private String name;
    private int id;
    private Calendar dateOfBirth;
    private double salary;

    public Employee() {

    }

    public Employee (String name, int id, Calendar dateOfBirth) {
        this.name = name;
        this.id = id;
        this.dateOfBirth = dateOfBirth;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setSalary(double s){
        this.salary=s;
    }
    public void setDateOfBirth(Calendar dateOfBirth) {
        this.dateOfBirth = dateOfBirth;   
    }

    
    public String getName() {
        return name;
    }
    public int getId() {
        return id;
    }
    public Calendar getDateOfBirth() {
        return dateOfBirth;
    }
    public double getSalary()
    {
        return this.salary;
    }

   
    public String toString() {
        return "Name : " + name + ", ID : " + id + ", Date of Birth : " + dateOfBirth.get(Calendar.DAY_OF_MONTH)+" "+(dateOfBirth.get(Calendar.MONTH)+1)+" "+dateOfBirth.get(Calendar.YEAR);
    }

    @Override
    public int compareTo(Employee o) {
        return (int) (this.getSalary()-o.getSalary());
    }
    
}
