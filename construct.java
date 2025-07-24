class MyEmployee{
    private int id;
    private String name;
    public MyEmployee(){
        id=1;
        name="kamnasingh";
    }    
    public String getName()
    { 
        return name;
    }
    public void setName(String n)
    {
        this.name=n;
    }
    public void setId(int i)
    {
        this.id=i;
    }
    public int getId()
    {
        return id ; 

        }
}
public class construct {
    public static void main(String[] args) {
       MyEmployee kamna=new MyEmployee();
        //kamna.setname("kamnasingh");
     //   kamna.setid(1);
        System.out.println(kamna.getId());
        System.out.println(kamna.getName());

        
    }
    
}
