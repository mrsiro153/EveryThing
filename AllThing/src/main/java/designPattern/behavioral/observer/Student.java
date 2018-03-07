package designPattern.behavioral.observer;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class Student implements HumanObserver {
    private final Logger logger = LogManager.getLogger(this.getClass());

    @Override
    public void update(TeacherStatus teacherStatus) {
        switch (teacherStatus) {
            case HAPPY:
                logger.info("teacher is happy, student say cheer!!");
                break;
            case ANGRY:
                logger.info("teacher is angry, please keep quite");
                break;
            case TIRED:
                logger.info("teacher is tired, give her some aspirins");
                break;
            case SAD:
                logger.info("teacher is sad, find the way to make her smile");
                break;
            default:
                logger.error("unknown status of teacher");

        }
    }
}
