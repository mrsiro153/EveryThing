package datePicker;

public class DatePickerFormula {
    /*
    zeller formula!!
     */

    public DayInWeek getDateInWeek(Integer dayInMonth,Month month,Integer year){
        try {
            //
            if(month==Month.February || month==Month.January){
                year-=1;
            }
            Integer yearInCentury = year%100;
            Integer century = year/100;
            return zellerFormula(dayInMonth,month,yearInCentury,century);
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("can not get Day In week");
        }
    }
    public DayInWeek getDateInWeek(Integer dayInMonth,Integer month,Integer year){
        try {
            //
            if(month==1){
                month=13;
            }
            if(month==2){
                month=14;
            }
            Month m = Month.getMonthPicker(month);
            if(m==Month.February || m==Month.January){
                year-=1;
            }
            //
            Integer yearInCentury = year%100;
            Integer century = year/100;
            return zellerFormula(dayInMonth,m,yearInCentury,century);
        }catch (Exception e){
            throw new RuntimeException("can not get Day In week");
        }
    }
    //
    public DayInWeek zellerFormula(Integer dayInMonth,Month month,Integer yearInCentury,Integer Century){
        try {
            Integer weekday = dayInMonth + 13 * (month.getValue() + 1) / 5 + yearInCentury + yearInCentury / 4 + Century / 4 + 5 * Century;
            Integer x = weekday % 7;
            System.out.println(weekday);
            return DayInWeek.getDayInWeek(x);
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
    //

    public boolean isLeapYear(Integer year){//check 'nam nhuan'
        if(year%4==0) return true;
        else return false;
    }
    //
    public Integer calculateDateInMonth(Integer month,Integer year){
        //return (month === 2) ? (28 + isLeap(year)) : 31 - (month - 1) % 7 % 2;
        if(month==2){
            if(isLeapYear(year)){
                return 28+1;
            }else
                return 28;
        }else {
            return 31 - (month-1)%7%2;
        }

    }


}
