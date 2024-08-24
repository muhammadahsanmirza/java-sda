package factorypattern;

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
        System.out.println("Inside rectangle :: draw method");
    }
}
class square implements Ishape{
    @Override
    public void draw(){
        System.out.println("Inside square :: draw method");
    }
}
class circle implements Ishape{
    @Override
    public void draw(){
        System.out.println("Inside circle :: draw method");
    }
}

class shapeFactory{
    public Ishape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new circle();
        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new rectangle();
        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new square();
        }
        return null;
    }
}
public class FactoryPattern {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Muhammad Ahsan");
        System.out.println("21-ARID-737");

        shapeFactory shapeFactory = new shapeFactory();
        
        Ishape shapeOne = shapeFactory.getShape("CIRCLE");
        shapeOne.draw();
        
        Ishape shapeTwo = shapeFactory.getShape("SQUARE");
        shapeTwo.draw();
        
        Ishape shapeThree = shapeFactory.getShape("RECTANGLE");
        shapeThree.draw();
    }
}
