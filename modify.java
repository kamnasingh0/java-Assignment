class mydata{
   private int id;
   private  String name;
   public String getName(){
    return name;
    
   }
   public void setName(String n){
    name=n;
   }
   public void setId(int i){
id=i;
   }
   public int getId(){
    return id;
   }
}


public class modify {
    public static void main(String[] args) {
        mydata kamna=new mydata();
       // kamna.id=1;
        //kamna.name="kamnasingh";
        kamna.setName("\n hye i am kamna");
        System.out.println(kamna.getName());
        kamna.setId(1);
        System.out.println(kamna.getId());
    }
}
