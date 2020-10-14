package array3;
import java.util.*;
public class Array3 {
    public static void main(String[] args) {
        int [] arr=new int[5];
        int sum=0;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter the number");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            sum=sum+arr[i];
        }
        System.out.println("The sum is:"+sum);
    }
    
}
