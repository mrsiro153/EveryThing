package datePicker;

public enum DayInWeek {
    SUNDAY(1),
    MONDAY(2),
    TUESDAY(3),
    WEDNESDAY(4),
    THURSDAY(5),
    FRIDAY(6),
    SATURDAY(0);
    //
    Integer value;

    DayInWeek(Integer value) {
        this.value = value;
    }
    //

    public Integer getValue() {
        return value;
    }
    public static DayInWeek getDayInWeek(Integer value) throws Exception {
        for(DayInWeek d: DayInWeek.values()){
            if(d.getValue()==value){
                return d;
            }
        }
        throw new Exception("can not find Date In week Exception");
    }
}
