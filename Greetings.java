
import java.text.DateFormat;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.Scanner;

class Greetings {

    String name;
    LocalDate dob;

    void greetPerson() {
        LocalTime t1, t2, t3, t4, t5, t6, now;
        now = LocalTime.now();
        t1 = LocalTime.of(05, 00, 00);
        t2 = LocalTime.of(11, 59, 00);
        t3 = LocalTime.of(12, 00, 00);
        t4 = LocalTime.of(15, 59, 00);
        t5 = LocalTime.of(16, 00, 00);
        t6 = LocalTime.of(18, 59, 00);
        if (now.compareTo(t1) >= 0 && now.compareTo(t2) <= 0) {
            System.out.println("Good Morning " + this.name);
        } else if (now.compareTo(t3) >= 0 && now.compareTo(t4) <= 0) {
            System.out.println("Good Afternoon " + this.name);
        } else if (now.compareTo(t5) >= 0 && now.compareTo(t6) <= 0) {
            System.out.println("Good Evening " + this.name);
        } else {
            System.out.println("Good Night " + this.name);
        }

    }

    void getName() {
        System.out.println("Please enter your name.");
        Scanner sc = new Scanner(System.in);
        String a = sc.nextLine();
        this.name = a;
    }

    void getDob() {
        System.out.println("Please enter your date of birth .");
        Scanner sc = new Scanner(System.in);
        int Y;
        int M;
        int D;
        System.out.println("Enter year then month then day");
        Y = sc.nextInt();
        M = sc.nextInt();
        D = sc.nextInt();
        this.dob = LocalDate.of(Y, M, D);
    }

    void greeetBirthday() {
        LocalDate d1, d2;
        d1 = this.dob;
        d2 = LocalDate.now();
        if (d2.isBefore(d1)) {
            System.out.println("Advance HAPPY BIRTHDAY " + this.name);
        } else if (d2.isAfter(d1)) {
            System.out.println("Belated HAPPY BIRTHDAY " + this.name);
        } else {
            System.out.println("HAPPY BIRTHDAY " + this.name);
        }
    }

    void getAge() {
        LocalDate d1, d2;
        d1 = LocalDate.now();
        d2 = this.dob;
        int a;
        int b;
        a = d1.getYear() - d2.getYear();
        b = d1.getMonthValue() - d2.getMonthValue();
        if (b < 0) {
            a = a - 1;
            b = b + 12;
        }
        System.out.println("Your age is " + a + " years " + b + " months");

    }
}
