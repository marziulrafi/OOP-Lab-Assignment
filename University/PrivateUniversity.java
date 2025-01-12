package University;
import java.util.*;

public class PrivateUniversity extends University {
    private boolean ugcApproved;
    private int NumberOfTrusteeMembers;

    public PrivateUniversity() {

    }
    public PrivateUniversity (boolean ugcApproved, int numberOfTrusteeMembers, String name, String address, Calendar dateEstblished, int numberOfDepartments) {
        super (name, address, dateEstblished, numberOfDepartments);
        this.ugcApproved = ugcApproved;
        NumberOfTrusteeMembers = numberOfTrusteeMembers;
    }

    public boolean isUgcApproved() {
        return ugcApproved;
    }

    public void setUgcApproved(boolean ugcApproved) {
        this.ugcApproved = ugcApproved;
    }
    public void setNumberOfTrusteeMembers(int numberOfTrusteeMembers) {
        NumberOfTrusteeMembers = numberOfTrusteeMembers;
    }

    public int getNumberOfTrusteeMembers() {
        return NumberOfTrusteeMembers;
    }
   
    @Override
    public String toString() {
        return "Private University \n"+ "UGC Approved : " + ugcApproved + ", Number of Trustee Members : " + NumberOfTrusteeMembers;
    }

    public void AllInfo(){
        System.out.println("PRIVATE");
        System.out.println("Name : "+this.getName());
        System.out.println("Address : "+this.getAddress());
        System.out.println("Date Of Estblished : "+this.getDateEstblished().get(Calendar.DAY_OF_MONTH)+" "+(this.getDateEstblished().get(Calendar.MONTH)+1)+
        " "+this.getDateEstblished().get(Calendar.YEAR));

        System.out.println("Number Of Departments : "+this.getNumberOfDepartments());
        System.out.println("UGC Approved : "+this.isUgcApproved());
        System.out.println("Number of Trustee Members : "+this.getNumberOfTrusteeMembers());
    }
}