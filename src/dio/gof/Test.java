package dio.gof;

import dio.gof.facade.Facade;
import dio.gof.singleton.*;
import dio.gof.strategy.*;


public class Test {
    public static void main(String[] args) {

        //Singleton
        SingletonLazy lazy = SingletonLazy.getInstance();
        System.out.println(lazy);
        lazy = SingletonLazy.getInstance();
        System.out.println(lazy);

        SingletonEager eager = SingletonEager.getInstance();
        System.out.println(eager);
        eager= SingletonEager.getInstance();
        System.out.println(eager);

        SingletonLazyHolder lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);
        lazyHolder = SingletonLazyHolder.getInstance();
        System.out.println(lazyHolder);

        // Strategy
        Behavior usual = new UsualBehavior();
        Behavior defensive = new DefensiveBehavior();
        Behavior aggressive = new AggressiveBehavior();

        Robot robot = new Robot();
        robot.setBehavior(usual);
        robot.move();
        robot.move();
        robot.setBehavior(defensive);
        robot.move();
        robot.move();
        robot.move();
        robot.setBehavior(aggressive);
        robot.move();

        // Facade
        Facade facade = new Facade();
        facade.migrateClient("Fernanda", "0005");

    }
}