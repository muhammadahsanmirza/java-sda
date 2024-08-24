/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package constructors_0;
/**
 *
 * @author Ahsan
 */
class box{
    private double length;
    private double width;
    private double height;
    
    public box()
    {
        System.out.println("Default Constructor Called");
        this.length=this.width=this.height=10.0;
    }
    public box(double length, double width, double height)
    {
        System.out.println("Parametrized Constructor Called");
        this.length=length;
        this.width=width;
        this.height=height;
    }
    public void display()
    {
        System.out.println("Length = " + this.length);
        System.out.println("Width = " + this.width);
        System.out.println("Height = " + this.height);
    }
}
public class Constructors_0 {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Name: Muhammad Ahsan");
        System.out.println("Arid No.: 21-ARID-737");
        
        box box1= new box();
        box1.display();
        
        box box2= new box(6.5,2.9,8.6);
        box2.display();
    }
}
