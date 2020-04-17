public class Main {
    public static void main(String[] args) {

        System.out.println("-------------< Class Date 1> -------------");
        Date_1 date = new Date_1(13, 03, 1995);
        date.Method_1();
        date.Method_2();
        Date_1 date2 = new Date_1(2, 1, 2000);
        date2.Method_2();
        System.out.println("Date 1 " + "day = " + date.day + ", month = " + date.month + ", year = " + date.year);
        System.out.println("Date 2 " + "day = " + date2.day + ", month = " + date2.month + ", year = " + date2.year);

        System.out.println("-------------< Class Date 2 >-------------");
        Date_2 date3 = new Date_2(12, 12, 1996);
        date3.Method_1();
        System.out.println("Date 3 " + "day = " + date3.day + ", month = " + date3.month + ", year = " + date3.year);
        Date_2 date4 = new Date_2(12, 12, 1996);
        System.out.println("Date 4 "+ "day = " + date4.day + ", month = " + date4.month + ", year = " + date4.year);
        if (date4.Method_2() == true){
            System.out.println("Date 4 has equals day and month");
        }

        System.out.println("-------------< Class Time >-------------");
        Time time = new Time(59, 59, 1);
        System.out.println("Seconds in time " + time.Method_1());
        time.Method_2();
        System.out.println("Time "+ "day = " + time.seconds + ", month = " + time.minutes + ", year = " + time.hours);
        System.out.println("Seconds in time " + time.Method_1());

        System.out.println("-------------< Class Rectangle >-------------");
        Rectangle rectangle = new Rectangle(1, 1, 4, 4);
        System.out.println("Rectangle x1=" + rectangle.x1 + ", y1=" + rectangle.y1 + ", x2=" + rectangle.x2 + ", y2=" + rectangle.y2);
        if (rectangle.isSquare() == true){
            System.out.println("rectangle is square");
        } else {
            System.out.println("rectangle is not square");
        }
        rectangle.setX1(2);
        if (rectangle.isSquare() == true){
            System.out.println("rectangle is square");
        } else {
            System.out.println("rectangle is not square");
        }
        System.out.println("Rectangle area=" + rectangle.getArea());
        System.out.println("Rectangle x1=" + rectangle.x1 + ", y1=" + rectangle.y1 + ", x2=" + rectangle.x2 + ", y2=" + rectangle.y2);

        System.out.println("-------------< Class Book >-------------");
        Book book = new Book("The green mile", 420, 500, 1996);
        System.out.println("Page price " + book.get_page_price());
        System.out.println("Days after publishing" + book.daysAfterPublishing());
        System.out.println("Book: name=" + book.name + ", numberOfPages=" + book.numberOfPages + ", price=" + book.price + ", year=" + book.year);

        System.out.println("-------------< Class Worker >-------------");
        Worker worker = new Worker("Vlad", 500, 2004);
        System.out.println("Worker experience " + worker.getexperience());
        System.out.println("Days passed since worker employment " + worker.days_since_employment());
        System.out.println(worker.name + " earns " + worker.salary + " and works since " + worker.year);
    }
}
