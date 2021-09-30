package taxi;

import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) throws InterruptedException {
        Scanner scan = new Scanner(System.in);

        Booking booking = new Booking();
        while (true){
            System.out.println("Enter your Customer Id");
            int customerId = scan.nextInt();
            System.out.println("Enter the pickup point");
            char pickup = scan.next().charAt(0);
            System.out.println("Enter the drop point");
            char drop = scan.next().charAt(0);
            System.out.println("Enter the time to pickup");
            int time = scan.nextInt();

            booking.book(customerId,pickup,drop,time);
        }

    }
}
