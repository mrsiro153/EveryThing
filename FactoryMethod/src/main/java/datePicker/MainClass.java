package datePicker;

public class MainClass {
   //
    public static void main(String[] args) {
        DatePickerFormula datePickerFormula = new DatePickerFormula();
        DayInWeek dayInWeek = datePickerFormula.getDateInWeek(29,2,2000);
        System.out.println(dayInWeek);
        //
        System.out.println(datePickerFormula.calculateDateInMonth(2,2017));
    }
}
