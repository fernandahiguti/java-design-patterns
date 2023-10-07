package dio.gof.strategy;

public class AggressiveBehavior implements Behavior {
    public void move() {
        System.out.println("Moving aggressively...");
    }
}
