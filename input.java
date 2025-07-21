import java.util.Scanner;
public class input {

    public static void main(String[] args) {
        System.out.println("it works");
        Scanner sc=new Scanner(System.in);
        System.out.println("\n enter num1");
        
        int a=sc.nextInt();
System.out.println("num2");
int b=sc.nextInt();
int sum=a+b;
int multiply=a*b;
int divide=a%b;
System.out.println("the sum of no is");
System.out.println(sum);
System.out.println("the multiply is");
System.out.println(multiply);
System.out.println("the division is");
System.out.println(divide);
        
    }
    
}
