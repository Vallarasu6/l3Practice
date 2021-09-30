package mapRoute;

import javax.sound.midi.Soundbank;
import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        LogicLayer ll = new LogicLayer();
        ll.store();
        ll.display();
        System.out.println("Enter the start");
        char start = scanner.next().charAt(0);
        System.out.println("Enter the end");
        char end = scanner.next().charAt(0);
        ll.allRoutes(start,end);
        ll.routes();
    }

}
