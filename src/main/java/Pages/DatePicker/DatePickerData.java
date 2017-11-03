package Pages.DatePicker;


public class DatePickerData {

    private String month;
    private int day;
    private int year;


    public DatePickerData() {

    }

    public DatePickerData(String month, int day, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    public String getDate() {
        String wholeData = month + " " + day + ", " + year;
        return wholeData;
    }

    public String getMonth() {
        return month;
    }

    public int getYear() {
        return year;
    }

    public int getDay() {
        return day;
    }


}
