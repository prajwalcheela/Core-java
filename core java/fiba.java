import java.util.*;
public class fiba {
    static int fab(int n)
    {
       if (n <= 1)
          return n;
       return fab(n-1) + fab(n-2);
    }
    public static void main (String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        System.out.println(fab(n));
    }
}
