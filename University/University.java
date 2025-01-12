package University;
import java.util.*;

public class University implements Comparable<University>{
    private String name;
    private String address;
    private Calendar dateEstblished;
    private int numberOfDepartments;

    public University() {

    }
    public University (String name, String address, Calendar dateEstblished, int numberOfDepartments) {
        this.name = name;
        this.address = address;
        this.dateEstblished = dateEstblished;
        this.numberOfDepartments = numberOfDepartments;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public void setDateEstblished(Calendar dateEstblished) {
        this.dateEstblished = dateEstblished;
    }
    public void setNumberOfDepartments(int numberOfDepartments) {
        this.numberOfDepartments = numberOfDepartments;
    }

    
    public String getName() {
        return name;
    }
    public String getAddress() {
        return address;
    }
    public Calendar getDateEstblished() {
        return dateEstblished;
    }
    public int getNumberOfDepartments() {
        return numberOfDepartments;
    }

    @Override
    public String toString() {
        return "University [Name : " + name + ", Address : " + address + ", Date of Estblished : " + dateEstblished.getTime() + ", Number of Departments : " + numberOfDepartments + "]";
    }

    @Override
    public int compareTo(University o) {
        return -(this.getDateEstblished().get(Calendar.YEAR)-o.getDateEstblished().get(Calendar.YEAR));
    }
    
}