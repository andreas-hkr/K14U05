public class Main {
    public static void main(String[] args) {
        // Lägg till en metod isLeapYear i Date klassen
        //  - År jämnt delbara med 4
        //  - INTE om jämnt delbara med 100
        //  - MEN skottår om jämnt delbart med 400

    }
}

class Date {
    int year;
    int month;
    int day;

    boolean isLeapYear() {
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0) {
            return true;
        }
        return false;
    }

    @Override
    public String toString() {
        return String.format("%4d-%02d-%02d", year, month, day);
    }
}