package array1;
import java.util.*;
public class Array1 {
    String name,weapon,planet,power;
    int age;
    int [] arr=new int[5];
    Scanner sc=new Scanner(System.in);
    public void getDetails(){
        System.out.println("Enter the name");
        name=sc.next();
        System.out.println("Enter the age");
        age=sc.nextInt();
        System.out.println("Enter the weapon");
        weapon=sc.next();
        System.out.println("Enter the planet");
        planet=sc.next();
        System.out.println("Enter the power");
        power=sc.next();
    }
    public void displayDetails(){
        System.out.println("Name:"+name);
        System.out.println("Age:"+age);
        System.out.println("Weapon:"+weapon);
        System.out.println("Planet:"+planet);
        System.out.println("Power:"+power);
    }
    public static void main(String[] args) {
       Array1[] ar=new Array1[5];
       for(int i=0;i<5;i++){
           ar[i]=new Array1();
           ar[i].getDetails();
       }
       for(int i=0;i<5;i++){
           ar[i].displayDetails();
       }
    }
    
}
