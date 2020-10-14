package array2;
import java.util.*;
public class Array2 {
    public static void main(String[] args) {
        int [] arr=new int[5];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<5;i++){
            System.out.println("Enter the number");
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<5;i++){
            if(arr[i]%2!=0){
                System.out.println("The odd values are:"+arr[i]);
            }
        }
    }
    
}
