import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Book {
    public String name;
    public int numberOfPages;
    public double price;
    public int year;

    public Book(String name, int numberOfPages, int price, int year) {
        this.name = name;
        this.numberOfPages = numberOfPages;
        this.price = price;
        this.year = year;
    }

    public Book() {
        name = "Noname";
        numberOfPages = 0;
        price = 0;
        year = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public void setNumberOfPages(int numberOfPages) {
        this.numberOfPages = numberOfPages;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public double get_page_price() {
        return price / numberOfPages;
    }

    public long daysAfterPublishing() {
        LocalDate now = LocalDate.now();
        LocalDate date = LocalDate.parse(year + "-" + "01-01");
        return ChronoUnit.DAYS.between(date, now);
    }
}