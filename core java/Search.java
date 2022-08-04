import java.util.*;

public class Search{
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the First Name");
        String firstname = sc.next();
        System.out.println("Enter the Last Name");
        String lastname = sc.next();
        students.add("Prajwal Cheela");
        students.add("Srinivas Cheela");
        students.add("Rachana CHeela");
        students.add("praneeth cheela");
        int c=1;

        for(String str:students) {
            String name[] = str.split(" ");
           // System.out.println(name);
            if(firstname.equals(name[0])   && lastname.equals(name[name.length-1])){
                System.out.print("Found "+name[0]+" "+name[name.length-1]);
                c=0;
                break;

            }
        }
        if(c==1)
        System.out.println("No result");

    }

    
}