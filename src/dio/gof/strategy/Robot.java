package dio.gof.strategy;

public class Robot {

    private Behavior strategy;

    public void setBehavior(Behavior strategy) {
        this.strategy = strategy;
    }

    public void move(){
        strategy.move();
    }
}
