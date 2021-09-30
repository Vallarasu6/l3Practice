package UI;
import java.sql.SQLException;
import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) throws SQLException {
        HashMapHandler hashMapHandler = new HashMapHandler();
        Scanner scan = new Scanner(System.in);
        LogicLayer ll = new LogicLayer();
        Register register;
        while (true) {
            System.out.println("1.User\n2.Admin");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1: {

                        System.out.println("1.Register\n2.Login");
                        int option = scan.nextInt();
                        scan.nextLine();
                        switch (option) {
                            case 1: {
                                System.out.println("Enter your name");
                                String name = scan.nextLine();
                                System.out.println("Enter your mail");
                                String mail = scan.nextLine();
                                System.out.println("Enter your mobile");
                                long mobile = scan.nextLong();
                                scan.nextLine();
                                System.out.println("Enter your password");
                                String password = scan.nextLine();
                                System.out.println("Enter your deposit amount");
                                long amount = scan.nextLong();
                                register = new Register(name, mail, mobile, 0, password, amount, 0);
                                ll.userRegister(register);


                                break;
                            }
                            case 2: {
                                System.out.println("Enter your mail");
                                String mail = scan.nextLine();
                                System.out.println("Enter your password");
                                String password = scan.nextLine();
                                ll.userLogin(mail, password);
                                break;
                            }
                        }
                        break;


                }
                case 2: {
                    System.out.println("Enter your username");
                    String adminName = scan.nextLine();
                    System.out.println("Enter yur password");
                    String adminPassword = scan.nextLine();
                    int result = ll.adminLogin(adminName, adminPassword);
                    if (result == 1) {
                        ll.show();

                        System.out.println("Enter");
                        String approval = scan.nextLine();
                        ll.userApproval(approval);

                    }
                    break;
                }
            }
        }
    }
}