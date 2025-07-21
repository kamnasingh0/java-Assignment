public class array {
    public static void main(String[] args) {
        int[] marks=new int[10];
        marks[0]=79;
        marks[1]=98;
        marks[2]=75;
        marks[3]=68;
        marks[4]=99;
        marks[5]=48;
        marks[6]=79;
        marks[7]=87;

marks[8]=79;
        marks[9]=90;
        //System.out.println(marks[7]);
        System.out.println("\n Here Are Marks Of Ten Students In Maths");
        for(int i=0;i<10;i++){
            System.out.println("student "+(i+1)+" "+marks[i]);
        //  System.out.println("marks");
        }

    }
    
}
