package templatedesignpattern;
/**
 *
 * @author Ahsan
 */
abstract class game{
    abstract void initialize();
    abstract void startPlay();
    abstract void endPlay();
    final void play(){
        this.initialize();
        this.startPlay();
        this.endPlay();

    }
}
class cricket extends game{
    @Override
    void initialize(){
        System.out.println("Cricket game initialized ! Start Playing");
    }
    @Override
    void startPlay(){
        System.out.println("Cricket game started ! enjoy the game");
    }
    @Override
    void endPlay(){
        System.out.println("Cricket game finished");
    }
}
class footBall extends game{
    @Override
    void initialize(){
        System.out.println("Football game initialized ! Start Playing");
    }
    @Override
    void startPlay(){
        System.out.println("Football game started ! enjoy the game");
    }
    @Override
    void endPlay(){
        System.out.println("Football game finished");
    }
}
public class TemplateDesignPattern {
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Name : Muhammad Ahsan");
        System.out.println("Arid No : 21-arid-737");
                
        System.out.println("Cricket");
        game g = new cricket();
        g.play();        
        
        System.out.println("Football");
       g = new footBall();
        g.play();
    }
}
