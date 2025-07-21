class employee{
    int id;
    String name;
    int age;
    long salary;
    char blood;
    String address;
  //  String mobile;
}
public class first {
    public static void main(String[] args) {
        System.out.println("Full Details of Employee Kamna");
        employee kamna=new employee();
        
        kamna.id=1;
    
        kamna.name= "KamnaSingh";
         
        kamna.age=21;
        
        kamna.salary=30000;
        
        kamna.blood='A';
        
        kamna.address="Noida";

        System.out.println("\n  Employee ID");
        System.out.println(kamna.id);
        System.out.println("\n Employee Name");
        System.out.println(kamna.name);
        System.out.println("\n  Employee Age"); 
        System.out.println(kamna.age);
        System.out.println("\nEmployee Salary"); 
        System.out.println(kamna.salary);
        System.out.println("\n Employee Blood Group"); 
        System.out.println(kamna.blood);
System.out.println("\n Employee Address");
System.out.println(kamna.address);
        
    }
    
}
