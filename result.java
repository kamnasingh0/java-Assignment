import java.util.Scanner;
public class result {
    public static void main(String[] args) {
        float total=0;
        System.out.println("write down marks to make percentage");
        Scanner input=new Scanner(System.in);
        System.out.println("enter total marks ");
        int total_marks=input.nextInt();
        System.out.println("enter english");
        float english=input.nextfloat();
        total=total+english;
        
        System.out.println("enter hindi");
        float hindi=input.nextfloat();
        total=total+hindi;


        System.out.println("enter math");
        float math=input.nextfloat();
        total=total+math;

        System.out.println("enter science");
        float science=input.nextfloat();
        total=total+science;
        
        System.out.println("enter sst");
        float sst=input.nextfloat();
        total=total+sst;
        float grandtotal=total+100/(total_marks*5);
        System.out.println("ypur percentage="+grandtotal+"percent");

    }
    
}
