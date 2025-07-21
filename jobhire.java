import java.util.Scanner;
public class jobhire {
    public static void main(String[] args){
        int age;
        System.out.println("\n enter your age");
       Scanner sc=new Scanner(System.in);
        age=sc.nextInt();
        if(age>60){
            System.out.println("\n you are senior");

        }
        else if(age>40){
            System.out.println("\n you are junior");

        }
        else if(age>30){
            System.out.println("\n you are fresher");
        }
    }

    
}
