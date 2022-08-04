import java.util.*;
class recurssion {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of arrar");
        int l=sc.nextInt();
        int[] array  =new int[l];
        System.out.println("Enter array elements");
        for (int i=0;i<l;i++){
            array[i]=sc.nextInt();
        }
        System.out.println("The largest is "+max(array,l));
    }
    public static int max(int array[],int l){
        if(l==1)return array[0];
        return Math.max(array[l-1],max(array,l-1));

    }
}
