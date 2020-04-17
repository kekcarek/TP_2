public class Time {
    public int seconds;
    public int minutes;
    public int hours;

    public Time(int seconds, int minutes, int hours) {
        this.seconds = seconds;
        this.minutes = minutes;
        this.hours = hours;
    }

    public Time() {
        seconds = 0;
        minutes = 0;
        hours = 0;
    }

    public int getSeconds() {
        return seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int Method_1() {
        return seconds + minutes * 60 + hours * 3600;
    }

    public void Method_2() {
        int newSeconds = seconds + 5;
        seconds = newSeconds % 60;
        int newMinutes = minutes + newSeconds / 60;
        minutes = newMinutes % 60;
        hours += newMinutes / 60;
    }
}