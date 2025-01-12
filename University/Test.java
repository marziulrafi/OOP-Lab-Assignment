package University;
import java.util.*;

public class Test {
    public static ArrayList<University> universities = new ArrayList<>();
    public static void UgcApproved(){
        for(University x:universities){
           if(x instanceof PrivateUniversity){
                PrivateUniversity obj = (PrivateUniversity)x;
                if(obj.isUgcApproved()==true){
                System.out.println(obj.getName());
                }
           }
        }
    }

    public static void UniversityNoPolitics(){
        for(University x:universities){
            if(x instanceof PublicUniversity){
                PublicUniversity obj = (PublicUniversity)x;
                if(obj.isPoliticsAllowed()==false){
                System.out.println(obj.getName());
                }
            }
        }
    }

    public static void UniversityAddress(String s){
        for(University x: universities){
            if(x.getAddress().equals(s)){
                if(x instanceof PublicUniversity){
                    PublicUniversity p= (PublicUniversity)x;
                    System.out.println(p.getName());
                }
                  else {
                    PrivateUniversity p2= (PrivateUniversity)x;
                    System.out.println(p2.getName());
                }
            }
            
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("For Public University: ");
        for(int i=0; i<3; i++){
            System.out.print("Name : ");
            String name = input.nextLine();

            System.out.print("Address : ");
            String address= input.nextLine();

            System.out.print("Established Date (DD MM YYYY) : ");
            int day = input.nextInt();
            int month = input.nextInt()-1;
            int year = input.nextInt();

            System.out.print("Number of Departments : ");
            int depts = input.nextInt();

            System.out.print("Number of Halls : ");
            int halls = input.nextInt();

            System.out.println("Politics (True/False) : ");
            boolean politics= input.nextBoolean();
            
            Calendar c = Calendar.getInstance();
            c.set(year,month,day);
            input.nextLine();
            
            PublicUniversity ob = new PublicUniversity(halls,politics,name,address,c,depts);
            universities.add(ob);
        
        }

        System.out.println("For Private University : ");
           for (int i=0; i<3; i++) {
              System.out.println();
              System.out.print("Name : ");
              String name = input.nextLine();

            System.out.print("Address : ");
            String address= input.nextLine();

            System.out.print("Established Date (DD MM YYYY) : ");
            int day= input.nextInt();
            int month= input.nextInt()-1;
            int year= input.nextInt();

            System.out.print("Number of Departments: ");
            int dept= input.nextInt();

            System.out.println("UGC Approved : ");
            boolean ugc = input.nextBoolean();

            System.out.print("Number of Trustee Members : ");
            int members = input.nextInt();

            Calendar c = Calendar.getInstance();
            c.set(year, month, day);
            input.nextLine();

            PrivateUniversity ob = new PrivateUniversity(ugc, members, name, address, c, dept);
            universities.add(ob);

        }

        Collections.sort(universities);

        System.out.println();
        System.out.println("UGC Approved");
        UgcApproved();

        System.out.println();
        System.out.println("These universities are not allowed politics : ");
        UniversityNoPolitics();

        System.out.println();
        System.out.print("Enter an address for an university : ");
        String ads= input.nextLine();
        UniversityAddress(ads);

        for(University z:universities){
            if(z instanceof PublicUniversity) {
                PublicUniversity p = (PublicUniversity)z;
                System.out.println();
                p.AllInfo();
            }
               else {
                   PrivateUniversity p2 = (PrivateUniversity)z;
                       System.out.println();
                        p2.AllInfo();
            }
        }  
        input.close();
    }
}