package dio.gof.strategy;

public class UsualBehavior implements Behavior {
    public void move() {
        System.out.println("Moving as usual...");
    }
}
