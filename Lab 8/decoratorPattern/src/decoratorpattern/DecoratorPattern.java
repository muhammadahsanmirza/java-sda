package decoratorpattern;

/**
 *
 * @author Ahsan
 */
interface Ishape{
    void draw();
}
class rectangle implements Ishape{
    @Override
    public void draw(){
        System.out.println("Shape : rectangle");
    }
}
class circle implements Ishape{
    @Override
    public void draw(){
        System.out.println("Shape : circle");
    }
}
abstract class shapeDecorator implements Ishape{
    protected Ishape decoratedShape;
    public shapeDecorator(){
    this.decoratedShape=null;
    }
    public shapeDecorator(Ishape decoratedShape){
    this.decoratedShape=decoratedShape;
    }
    @Override
    public void draw(){
    }
}
class redShapeDecorator extends shapeDecorator{
    public redShapeDecorator(Ishape decoratedShape){
        super(decoratedShape);
    }
    @Override
    public void draw(){
        this.decoratedShape.draw();
        setRedBorder();
    }
    private void setRedBorder(){
        System.out.println("Border Color: Red");

    }
}

public class DecoratorPattern {
    public static void main(String[] args) {
        // TODO code application logic here
       System.out.println("Muhammad Ahsan");
       System.out.println("21-ARID-737");
       Ishape circle = new circle();
       Ishape redCircle = new redShapeDecorator(new circle());
       Ishape redRectangle = new redShapeDecorator(new rectangle());

       System.out.println("Circle with normal Border");
       circle.draw();
       System.out.println("Circle with red Border");
       redCircle.draw();
       System.out.println("Rectangle with red Border");
       redRectangle.draw();
       
    }
}
