package zcoin;

import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LogicLayer ll = new LogicLayer();
        AdminPojo adminPojo;

        LoginPojo loginPojo;
        int choice;
        do{
            System.out.println("Enter your choice\n1.User\n2.Admin\n3.Exit");
            choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1: {
                    int option;
                    do {
                        System.out.println("Enter the option\n1.Register\n2.Login\n3.Exit");
                        option = scan.nextInt();
                        scan.nextLine();
                        switch (option) {
                            case 1: {
                                RegisterPojo registerPojo = new RegisterPojo();
                                System.out.println("Enter the name");
                                String userName = scan.nextLine();
                                System.out.println("Enter email");
                                String userEmail = scan.nextLine();
                                System.out.println("Enter mobile");
                                long userMobile = scan.nextLong();
                                scan.nextLine();
                                System.out.println("Enter password");
                                String userPassword = scan.nextLine();
                                System.out.println("Enter the real money");
                                long realMoney = scan.nextLong();
                                registerPojo.setUserName(userName);
                                registerPojo.setUserEmail(userEmail);
                                registerPojo.setUserMobile(userMobile);
                                registerPojo.setUserPassword(userPassword);
                                registerPojo.setRealMoney(realMoney);
                                ll.userRegister(registerPojo);
                                ll.returnRegister();
                                break;
                            }
                            case 2: {
                                System.out.println("Enter the email id");
                                String userEmail = scan.nextLine();
                                System.out.println("Enter password");
                                String userPassword = scan.nextLine();
                                loginPojo = new LoginPojo(userEmail, userPassword);
                                int value = ll.userLogin(loginPojo);
                                if (value == 1) {
                                    System.out.println("Welcome board!");
                                    System.out.println("Enter your option\n1.Transaction\n2.");

                                } else if (value == -2) {
                                    System.out.println("Your id is not verified by admin");
                                } else {
                                    System.out.println("No valid email or password");
                                }
                                break;
                            }

                            default: {

                            }
                        }
                    }while (option<3);
                    break;
                }
                case 2:{
                    System.out.println("Enter the adminUsername");
                    String adminUserName = scan.nextLine();
                    System.out.println("Enter the adminPassword");
                    String adminPassword = scan.nextLine();
                    adminPojo = new AdminPojo(adminUserName,adminPassword);
                    int val = ll.adminLogin(adminPojo);
                    if(val==1){
                        System.out.println("Yay!");
                        ll.approval();
                        System.out.println("Enter your approval");
                        String approvalMail = scan.nextLine();
                        ll.changeState(approvalMail);

                    }else{
                        System.out.println("No valid email or password");
                    }

                    break;
                }
                case 3:{

                }
            }
        }while (choice<3);
    }
}


