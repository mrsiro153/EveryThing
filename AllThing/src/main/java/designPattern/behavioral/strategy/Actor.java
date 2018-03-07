package designPattern.behavioral.strategy;

public class Actor {
    private ActorStrategy actorStrategy;

    public Actor(ActorStrategy actorStrategy) {
        this.actorStrategy = actorStrategy;//give me how the actor attack!!
    }

    public void goToKillSomeone(){
        actorStrategy.attack();
    }

    public void changeWayToAttack(ActorStrategy actorStrategy){
        this.actorStrategy = actorStrategy;
    }
}
