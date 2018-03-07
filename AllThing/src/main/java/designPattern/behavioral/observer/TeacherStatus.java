package designPattern.behavioral.observer;

public enum TeacherStatus {
    HAPPY(1),
    SAD(2),
    ANGRY(3),
    TIRED(4),
    UNKNOWN(5);
    private Integer status;
    TeacherStatus(Integer status) {
        this.status = status;
    }

    public Integer getStatus() {
        return status;
    }
}
