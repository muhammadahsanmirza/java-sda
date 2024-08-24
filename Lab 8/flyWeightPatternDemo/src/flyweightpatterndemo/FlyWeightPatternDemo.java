
package flyweightpatterndemo;
import java.util.HashMap;

/**
 *
 * @author Ahsan, Huzaifa, Muneeb
 */
interface Ishape {
   void draw();
}

class circle implements Ishape {
   private String color;
   private int x;
   private int y;
   private int radius;

   public circle(String color){
      this.color = color;		
   }

   public void setX(int x) {
      this.x = x;
   }
   public int getX() {
      return this.x;
   }

   public void setY(int y) {
      this.y = y;
   }
   public int getY() {
      return this.y;
   }

   public void setRadius(int radius) {
      this.radius = radius;
   }
   public int getRadius() {
      return this.radius;
   }

   @Override
   public void draw() {
      System.out.println("Circle: Draw() [Color : " + color + ", x : " + x + ", y :" + y + ", radius :" + radius);
   }
}
class shapeFactory {
    
   private static HashMap circleMap = new HashMap();

   public static Ishape getCircle(String color) {
       /*
        * circle checkAndCreateCircle: This declares a variable named circles of type circle to store the retrieved object.
        * (circle): This is a type cast operator that explicitly converts the returned object from Object to the circle type.
            * It informs the compiler that we expect the object to be of type circle.
        * circleMap.get(color): This retrieves the value associated with the color key from the circleMap. 
            * Since the checkAndCreateCircle is declared as HashMap<String, circle>, the returned value will be of type circle.
            * However, it is returned as a generic Object type, so we need to cast it to the circle type.        
        */
      circle checkAndCreateCircle = (circle)circleMap.get(color);

      if(checkAndCreateCircle == null) {
          checkAndCreateCircle = new circle(color);
         circleMap.put(color, checkAndCreateCircle);
         System.out.println("Creating circle of color : " + color);
      }
      return checkAndCreateCircle;
   }
}
public class FlyWeightPatternDemo {
    private static String colors[] = { "Black", "Grey", "White", "Skin", "Yellow" };
    public static void main(String[] args) {
         System.out.println("Project Title: Flyweight Pattern");
         System.out.println("Groupt Members:");
         System.out.println("\tMuhammad Ahsan      21-ARID-737 ");
         System.out.println("\tMuneeb Ahmad        21-ARID-764 ");
         System.out.println("\tHuzaifa Bin Shahzad 21-ARID-719 ");
         System.out.println("Submitted to: Ma'am Aiman Khan\n");
        

        // TODO code application logic here
         for(int i=0; i < 20; i++) {
            /*
              * getRandomColor(): This is a method call to the getRandomColor method,
              *     which returns a randomly selected color from the colors array.
              * shapeFactory.getCircle(...): This calls the getCircle method of the shapeFactory class, 
                 * passing the randomly generated color as an argument. 
                  * The getCircle method returns an Ishape object, which is assigned to the variable circle.
              * (circle): This is a type cast operator that explicitly converts the returned Ishape object to the circle type. 
                 * It assumes that the returned object is actually an instance of the circle class.
              * circle circle: This declares a variable named circle of type circle to store the returned object.
            */
         circle newCircle = (circle)shapeFactory.getCircle(getRandomColor());
         newCircle.setX(getRandomX());
         newCircle.setY(getRandomY());
         newCircle.setRadius(100);
         newCircle.draw();
      }
    }
     private static String getRandomColor() {
      return colors[(int)(Math.random()*colors.length)];
   }
   private static int getRandomX() {
      return (int)(Math.random()*100 );
   }
   private static int getRandomY() {
      return (int)(Math.random()*100);
   }
}
