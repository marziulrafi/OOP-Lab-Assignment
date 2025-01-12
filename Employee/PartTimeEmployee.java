package Employee;
import java.util.*;

public class PartTimeEmployee extends Employee {
    private int hour;
    private double hourlyRate;

    public PartTimeEmployee(String name, int id, Calendar c, int hour, double hourlyRate) {
        super (name, id, c);
        super.setSalary(this.getSalary());
        this.hour = hour;
        this.hourlyRate = hourlyRate;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public void setHourlyRate(double hourlyRate) {
        this.hourlyRate = hourlyRate;
    }

    public int getHour() {
        return hour;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    @Override
    public double getSalary() {
        if (this.getHourlyRate()<=200) {
            return (this.getHour()*200);
        } else {
            return (this.getHour() * this.getHourlyRate());
        }
    }

    @Override
    public String toString() {
        return super.toString() + ", Hour : " + hour + ", Hourly Rate : " + hourlyRate + " Salary : " + this.getSalary();
    }

}
