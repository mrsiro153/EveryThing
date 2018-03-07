package designPattern.behavioral.strategy;

public class MainClass {
    public static void main(String[] args) {
        Actor actor = new Actor(new SpellHero());
        actor.goToKillSomeone();
    }
}
