package designPattern.behavioral.strategy;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class SpellHero implements ActorStrategy {
    private final Logger logger  = LogManager.getLogger(this.getClass());

    @Override
    public void attack() {
        logger.debug("i'm range hero, i use spell to attack!");
    }
}
