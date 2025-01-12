package Patient;
import java.util.*;

public class Test {
    public static ArrayList<Patient> patients = new ArrayList<>();
    public static void BloodPressurePatient(){
        for(Patient x:patients){
            if(x instanceof OutdoorPatient){
                OutdoorPatient out= (OutdoorPatient)x;
                if(out.getSystolic()>120 || out.getDiastolic()<80){
                    System.out.println(out.toString());
                }
            }
              else {
                  IndoorPatient in=(IndoorPatient)x;
                      if(in.getSystolic()>120 || in.getDiastolic()<80) {
                               System.out.println(in.toString());
                }
            }
        }
    }

    public static void AllInfo() {
        for(Patient x:patients) {
            if(x instanceof OutdoorPatient){
                OutdoorPatient out = (OutdoorPatient)x;
                System.out.println("Outdoor");
                System.out.println(out.toString());
                System.out.println("Bill : "+out.getInvoice());
            }
              if(x instanceof IndoorPatient){
                  IndoorPatient in = (IndoorPatient)x;
                  System.out.println("Indoor");
                  System.out.println(in.toString());
                  System.out.println("Bill : "+in.getInvoice());
            }
        }
    }

    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        System.out.println("Outdoor Patient");
        for(int i = 0 ;i<1 ;i++){
            System.out.print("Patient name : ");
            String name = input.nextLine();

            System.out.print("Patient age : ");
            int age = input.nextInt();

            System.out.print("Systolic : ");
            double systolic = input.nextDouble();

            System.out.print("Diastolic : ");
            double diastolic = input.nextDouble();

            System.out.print("Diabetes Point : ");
            double diabetesPoint = input.nextDouble();
            input.nextLine();

            System.out.print("Doctor's Speciality : ");
            String specialty = input.nextLine();

            System.out.print("Doctor's consultation fee : ");
            double fee = input.nextDouble();

            OutdoorPatient  out = new OutdoorPatient(name,age,systolic,diastolic,diabetesPoint,specialty,fee);
            patients.add(out);
            input.nextLine();
            
        }

        System.out.println();
        System.out.println("Indoor Patient");

        for(int i = 0 ;i<1 ;i++){
            System.out.print("Patient name : ");
            String name = input.nextLine();

            System.out.print("Patient age : ");
            int age = input.nextInt();

            System.out.print("Systolic : ");
            double systolic = input.nextDouble();

            System.out.print("Diastolic : ");
            double diastolic = input.nextDouble();

            System.out.print("Diabetes Point : ");
            double diabetesPoint = input.nextDouble();

            System.out.print("Admission date (DD MM YYYY) :  ");
            int day = input.nextInt();
            int month = input.nextInt()-1;
            int year = input.nextInt();

            Calendar c = Calendar.getInstance();
            c.set(year,month, day);

            System.out.print("Bed No: ");
            int bedNo= input.nextInt();

            System.out.print("Daily fee: ");
            double fee= input.nextDouble();

            IndoorPatient in = new IndoorPatient(name, age, systolic, diastolic, diabetesPoint, c, bedNo, fee);
            patients.add(in);
            input.nextLine();
        }

        Collections.sort(patients);

        System.out.println();
        BloodPressurePatient();

        System.out.println();
        System.out.println("Info of all patients : ");
        AllInfo();
        input.close();
    }
}