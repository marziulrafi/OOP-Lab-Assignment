package Employee;
import java.util.*;

public class FullTimeEmployee extends Employee {
    private double monthlySalary;

    public FullTimeEmployee (String name,int id,Calendar c, double monthlySalary) {
        super (name, id, c);
        super.setSalary(monthlySalary);
        this.monthlySalary = monthlySalary;
    }

     public void setSalary(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    public double getSalary() {
        return monthlySalary;
    }
   
    @Override
    public String toString() {
        return super.toString()+ ", Monthly Salary : " + this.monthlySalary;
    } 
    
    
}