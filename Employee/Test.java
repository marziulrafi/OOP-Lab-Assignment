package Employee;
import java.util.*;

public class Test {
    public static ArrayList<Employee> employees= new ArrayList<>();

    public static boolean AlreadyExist(int id){
        boolean flag = false;
        for(Employee x:employees){
            if(x.getId() == id){
                flag = true;
                break;
            }
        }
        return flag;
    }

    public static void AllInfo(){
        for(Employee x:employees){
            if(x instanceof FullTimeEmployee){
                FullTimeEmployee f = (FullTimeEmployee)x;
                System.out.println("Full-Time");
                System.out.println(f.toString());
            }
            else{
                PartTimeEmployee p = (PartTimeEmployee)x;
                System.out.println("Part-Time");
                System.out.println(p.toString());
            }
        }
    }

    public static void printByYear(int year){
        for(Employee x:employees){
            if(x.getDateOfBirth().get(Calendar.YEAR)==year){
               if(x instanceof FullTimeEmployee){
                    FullTimeEmployee f = (FullTimeEmployee)x;
                    System.out.println(f.toString());
                }  else {
                     PartTimeEmployee p = (PartTimeEmployee)x;
                     System.out.println(p.toString());
                }
            }
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("For Full-Time Employees : ");
        for(int i=0; i<3; i++){
            System.out.print("Name : ");
            String name= input.nextLine();

            System.out.print("ID : ");
            int id= input.nextInt();

            System.out.print("Date of Birth (DD MM YYYY) : ");
            int day= input.nextInt();
            int month= input.nextInt()-1;
            int year= input.nextInt();

            System.out.print("Monthly Salary: ");
            int salary= input.nextInt();        

            Calendar c= Calendar.getInstance();
            c.set(year, month, day);
            input.nextLine();
            
           
            if(AlreadyExist(id)==true){
                System.out.println("ALREADY EXISTS!");
                i--;
            } else {
                FullTimeEmployee ob = new FullTimeEmployee(name, id, c, salary);
                employees.add(ob);
            }
        }

        System.out.println("For Part-Time Employees : ");
        for(int i=0; i<3; i++){

            System.out.print("Name : ");
            String name= input.nextLine();

            System.out.print("ID : ");
            int id= input.nextInt();

            System.out.print("Date of Birth (DD MM YYYY) : ");
            int day = input.nextInt();
            int month = input.nextInt()-1;
            int year = input.nextInt();

            Calendar c = Calendar.getInstance();
            c.set(year, month, day);

            System.out.print("Hour : ");
            int hour= input.nextInt(); 
            
            System.out.print("Hourly Rate : ");
            double rate= input.nextDouble();
            input.nextLine();

            if(AlreadyExist(id)==true){
                System.out.println("ALREADY EXISTS!");
                i--;
            } else {
                PartTimeEmployee p = new PartTimeEmployee(name, id, c, hour, rate);
                employees.add(p);
            }
        }

        System.out.println();
        AllInfo();

        System.out.println();
        System.out.println("Enter a year : ");
        int year = input.nextInt();
        printByYear(year);

        Collections.sort(employees);

        System.out.println("After Sort : ");
        for(Employee x:employees){
            System.out.println(x.toString());
        }
        input.close();
    }
}