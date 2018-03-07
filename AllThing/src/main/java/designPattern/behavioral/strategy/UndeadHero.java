package designPattern.behavioral.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class UndeadHero implements ActorStrategy {
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    public void attack() {
        logger.debug("i'm undead hero. i use stick to attack!");
    }
}
