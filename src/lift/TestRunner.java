package lift;

import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LogicLayer ll= new LogicLayer();
        //while (true){
        ll.createList();
        System.out.println("Just");
        ll.display();
        System.out.println("Just");
                while (true){
                    System.out.println("Enter your start");
                    int start = scan.nextInt();
                    System.out.println("Enter your end");
                    int end = scan.nextInt();
                    ll.getValue(start,end);
                }
        //}
    }
}
