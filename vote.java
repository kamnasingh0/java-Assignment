import java.util.Scanner;
public class vote {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter your age");
        int age=scan.nextInt();
        if(age>=18){
            System.out.println("\n You are Eligible For Vote");
        }
        else{
System.out.println("\n You are Not Eligible For Vote");

            }
        
    }
    
}
