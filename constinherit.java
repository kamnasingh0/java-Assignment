class student{
    student(){
        System.out.println("All Student Are In Class Room");
    }
    public int x;
  public int getx(){
        return x;
    }
    public void setx(int x){
        this.x=x;    }
}
class teacher extends student{
    teacher(){
        System.out.println("All Teachers Are In Staff Room");
    }
    public int y;
    public int gety(){
        return y;

    }
    public void sety(int y){
        this.y=y;
    }
}

public class constinherit {
    public static void main(String[] args) {
        student s=new student();
        teacher t=new teacher();

    }
    
}
