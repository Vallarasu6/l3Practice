package internetBanking;

import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Register register;
        LogicLayer ll = new LogicLayer();
        int option = 0;

        do{
            System.out.println("Enter you option\n1.Register\n2.Login");
            option = scan.nextInt();
            scan.nextLine();
            switch (option){
                case 1:{
                    System.out.println("Enter email");
                    String email = scan.nextLine();
                    System.out.println("Enter name");
                    String name = scan.nextLine();
                    boolean b;
                    String password;
                    do {
                        System.out.println("Enter password");
                        password = scan.nextLine();
                       b = ll.checkPassword(password);
                    }while (b!=true);
                        System.out.println("Enter balance");
                        long balance = scan.nextLong();
                        register = new Register(email, name, password, balance);
                        String s = ll.registerData(register);
                        System.out.println(s);

                        break;

                }

                case 2:{
                    System.out.println("Enter name");
                    String name = scan.nextLine();
                    System.out.println("Enter password");
                    String password = scan.nextLine();
                    String s = ll.checkLogin(name,password);
                    System.out.println(s);
                    if(s.equals("Successfully logged in")){
                        int choice;
                        do {
                            System.out.println("Enter the choice\n1.Balance check\n2.Reset Password\n3.Transfer money");
                            choice = scan.nextInt();
                            scan.nextLine();
                            switch (choice){
                                case 1:{
                                    String s1 = ll.checkBalance(name);
                                    System.out.println(s1);
                                    break;
                                }
                                case 2:{
                                    System.out.println("Enter your new password");
                                    String newPassword = scan.nextLine();
                                    String s1 = ll.changePassword(newPassword,name);
                                    System.out.println(s1);
                                    break;
                                }
                                case 3:{
                                    System.out.println("Enter the sender name");
                                    String senderName = scan.nextLine();
                                    System.out.println("Enter the sender amount");
                                    long sendBalance = scan.nextLong();
                                    String s1 = ll.sendBalance(name,senderName,sendBalance);
                                    System.out.println(s1);
                                    break;
                                }
                            }
                        }while (choice<=3);
                    }
                    break;
                }
            }
        }while (option<3);
    }
}
