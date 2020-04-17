import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Worker {
    public String name;
    public double salary;
    public int year;

    public Worker() {
        name = "";
        salary = 0;
        year = 0;
    }

    public Worker(String name, int salary, int year) {
        this.name = name;
        this.salary = salary;
        this.year = year;
    }

    public String getSurname() {
        return name;
    }

    public void setSurname(String surname) {
        this.name = surname;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }


    public int getexperience(){
        LocalDate now = LocalDate.now();
        return now.getYear() - year;
    }

    public long days_since_employment(){
        LocalDate now = LocalDate.now();
        LocalDate date = LocalDate.parse(year + "-" + "01-01");
        return ChronoUnit.DAYS.between(date, now);
    }
}