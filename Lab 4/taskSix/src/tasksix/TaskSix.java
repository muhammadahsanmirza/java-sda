package tasksix;

/**
 *
 * @author Ahsan
 */
interface Iprintable{  
    void print();  
}  
interface Ishowable{  
 void show();  
}  
class multipleInheritance implements Iprintable,Ishowable
{  
    @Override
      public void print(){System.out.println("Hello");}  
    @Override
      public void show(){System.out.println("Welcome");}  
}

public class TaskSix {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Name: Muhammad Ahsan");
        System.out.println("Arid No: 21-ARID-737");
        multipleInheritance obj = new multipleInheritance();  
        obj.print();  
        obj.show();  

    }
}
