package railway.booking;

import java.util.HashMap;
import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        LogicLayer logicLayer = new LogicLayer();


        while (true) {
            System.out.println("Enter the choice\n1.Book\n2.Cancel\n3.Details\n4.Child Details");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1: {
                    String berth="";
                    System.out.println("Enter your name");
                    String name = scan.nextLine();

                    System.out.println("Enter your age");
                    int age = scan.nextInt();

                    System.out.println("Enter your berth preference\n1.Upper\n2.Middle\n3.Lower");
                    int choice1 = scan.nextInt();
                    switch (choice1) {
                        case 1: {
                              berth = "upper";
                            break;
                        }
                        case 2: {
                                berth = "middle";
                            break;
                        }
                        case 3: {
                            berth = "lower";
                            break;
                        }
                        default:
                            break;
                    }
                    String s = logicLayer.booking(name, age, berth);
                    System.out.println(s);

                    break;
                }
                case 2: {
                    System.out.println("Enter your id");
                    int id = scan.nextInt();
                    logicLayer.delete(id);
                    break;
                }
                case 3: {
                          HashMap<Integer,PojoBooking> map = logicLayer.showDetails();
                    System.out.println(map);
                    break;
                }
                case 4:{
                    System.out.println(logicLayer.childDetails());
                }
                default:
                    break;
            }
        }
    }
}