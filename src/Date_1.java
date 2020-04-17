import java.time.DateTimeException;
import java.time.LocalDate;

public class Date_1 {
    public int day;
    public int month;
    public int year;

    public Date_1(){
        day = 0;
        month = 0;
        year = 0;
    }

    public Date_1(int day, int month, int year) throws DateTimeException {
        if (month < 1 || month > 12) throw new DateTimeException("Incorrect month");
        if (day < 1 || day > daysCount(month, year)) throw new DateTimeException("Incorrect day");
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public boolean isLeapYear(int year) {

        if ((year % 400 == 0) || ((year % 4 == 0) && (year % 100 != 0))) {
            return true;
        } else {
            return false;
        }
    }

    private int daysCount(int month, int year) {
        if (month == 2) {
            return isLeapYear(year) ? 29 : 28;
        }
        return 30 + (month > 7 ? month + 1 : month) % 2;
    }
    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void Method_1() {
        year += 1;
    }

    public void  Method_2() {
        LocalDate localDate = LocalDate.of(year, month, day).minusDays(2);
        year = localDate.getYear();
        month = localDate.getMonthValue();
        day = localDate.getDayOfMonth();
    }
}
