
class Animal{
    String dog;
    Animal(){
        System.out.println("Dog Is A  Fiendly Animal");
    }
}

class Animal2 extends Animal{

    int cat;
    Animal2(){
        cat=5;
        System.out.println("Cat Is A Cub Family");
    }

}
public class inherit extends Animal2 { 
    public static void main(String[] args) {

        inherit obj=new inherit();
            System.out.println(obj.dog);
            System.out.println(obj.cat);

        }

        
    
}
    

