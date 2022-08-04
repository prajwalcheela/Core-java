import java.util.*;
import java.util.stream.Collectors;
public class uniqueappend {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> list1 = new LinkedList<Integer>();
        System.out.println("Enter the size of List 1");
        int size = sc.nextInt();
        System.out.println("Enter the list1 Item");
        for(int i = 0; i < size; i++) {
            list1.add(sc.nextInt());
        }
        List list2 =list1.stream().distinct().collect(Collectors.toList());  
        System.out.println(list2);

    }

}