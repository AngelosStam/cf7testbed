package gr.aueb.cf.ch2;

public class PrintApp {

    public static void main(String[] args) {
        int day = 1;
        int month = 7;
        int year = 2024;

        System.out.println("Η ημερομηνία είναι: " + day + "/" + month + "/" + year);
        System.out.printf("Η ημερομηνία είναι: %02d/%02d/%04d", day, month, year);
    }
}
