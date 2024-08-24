package tasktwo;

/**
 *
 * @author Ahsan
 */
abstract class shape
{
     abstract void display();
}
class square extends shape
{
    @Override
    void display()
    {
    System.out.println("Square");
    }
}
class circle extends shape
{
    @Override
    void display()
    {
    System.out.println("Circle");
    }
}

public class TaskTwo {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Name: Muhammad Ahsan");
        System.out.println("Arid No: 21-ARID-737");
        shape shapeOne= new circle();
        shapeOne.display();
        shapeOne=new square();
        shapeOne.display();

    }
}
