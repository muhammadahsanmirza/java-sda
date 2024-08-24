/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package helloworld;

class box{
    private double length;
    private double width;
    private double height;
    public box()
    {
        this.length=0;
        this.width=0;
        this.height=0;
    }
    public box(double length, double width, double height)
    {
        this.length=length;
        this.width=width;
        this.height=height;
    }
    public double volume()
    {
        return this.length*this.width*this.height;
    }
}
public class HelloWorld {

    /**
      @param args the command line arguments
     */
    public static void main(String[] args) {
//         TODO code application logic here
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");
        box b1=new box(1, 2, 3);
        System.out.println("The Volume of container is "+ b1.volume());
    }
}
