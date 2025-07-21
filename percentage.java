import java.util.Scanner;
public class percentage {
    public static void main(String[] args) {
        System.out.println("percentage");
        Scanner sc=new Scanner(System.in);
        System.out.println("\n Enter Maths Marks");
        int math=sc.nextInt();
        System.out.println("\n Enter Science Marks");
        int science=sc.nextInt();
        System.out.println("\n Enter SST Marks");
        int sst=sc.nextInt();
        System.out.println("\n Enter English Marks");
        int english=sc.nextInt();
        System.out.println("\n Enter Hindi Marks");
        int hindi=sc.nextInt();
        int totalmarks=math+science+sst+english+hindi;
        int maxmarks=500;
        double percentage= (totalmarks *100)/maxmarks;
        System.out.println("The percentage of Student Sakshi"+totalmarks+"/500");
        System.out.println(percentage);



    }
    
}
