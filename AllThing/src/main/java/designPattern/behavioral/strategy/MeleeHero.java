package designPattern.behavioral.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MeleeHero implements ActorStrategy {
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    public void attack() {
        logger.debug("I'm melee hero, i use sword to attack");
    }
}
