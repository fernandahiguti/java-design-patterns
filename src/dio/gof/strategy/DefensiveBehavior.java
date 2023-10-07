package dio.gof.strategy;

public class DefensiveBehavior implements Behavior {
    public void move() {
        System.out.println("Moving defensively...");
    }
}
