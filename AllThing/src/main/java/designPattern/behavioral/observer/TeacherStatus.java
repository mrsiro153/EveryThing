package designPattern.behavioral.observer;

public enum TeacherStatus {
    HAPPY(1){
        @Override
        public void doAction() {

        }
    },
    SAD(2){
        @Override
        public void doAction() {

        }
    },
    ANGRY(3){
        @Override
        public void doAction() {

        }
    },
    TIRED(4){
        @Override
        public void doAction() {

        }
    },
    UNKNOWN(5){
        @Override
        public void doAction() {
            //do something here
        }
    };
    private Integer status;
    TeacherStatus(Integer status) {
        this.status = status;
    }
    public abstract void doAction();
    public Integer getStatus() {
        return status;
    }
}
