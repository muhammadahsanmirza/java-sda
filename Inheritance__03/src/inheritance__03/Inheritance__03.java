package inheritance__03;

/**
 *
 * @author Ahsan
 */
class parent
{
    protected String varOne;
    parent()
    {
        this.varOne="Parent";
     System.out.println("Parent Constructor Called");
    }
    
    String getValue()
    {
     return this.varOne;
    }
    void Func() 
    {
        System.out.println("Function from parent class.");
    }

}
class child extends parent
{
    child()
    {
        this.varOne="Child";
     System.out.println("Child Constructor Called");
    }
    @Override
    void Func() 
    {
        System.out.println("Function from child class.");
    }
}

class grandChild extends  child
{
    grandChild()
    {
        this.varOne="Grand Child";
     System.out.println("grandChild Constructor Called");
    }
    @Override
    void Func() 
    {
        System.out.println("Function from grand child class.");
        
    }
}

public class Inheritance__03 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Name: Muhammad Ahsan");
        System.out.println("Arid No.: 21-ARID-737");
        
        System.out.println("<---Object of parent class created--->");
        parent parentOne= new parent();
                parentOne.Func();
                System.out.println(parentOne.getValue());
        System.out.println("<---Object of child class created--->");
        child childOne= new child();
                childOne.Func();
                System.out.println(childOne.getValue());
        System.out.println("<---Object of grand child class created--->");
        grandChild grandChildOne= new grandChild();
                 grandChildOne.Func();
                 System.out.println(grandChildOne.getValue());

        
        

    }
}
