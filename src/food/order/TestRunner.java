package food.order;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        ValidateRegister validateRegister = new ValidateRegister();
        ValidateLogin validationLogin = new ValidateLogin();
        LogicLayer ll = new LogicLayer();
        Register register;
        HashMapHandler hashMapHandler = new HashMapHandler();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter your choice\n1.SignUp\n2.Login\n3.Exit");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("Enter your name");
                    String name = scan.nextLine();
                    System.out.println("Enter your age");
                    int age = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter your mail");
                    String mail = scan.nextLine();
                    System.out.println("Enter your password");
                    String password = scan.nextLine();
                    System.out.println("Enter your Confirm password");
                    String confirmPassword = scan.nextLine();
                    int validate = validateRegister.validatePassword(password, confirmPassword);
                    if (validate == 1) {
                        System.out.println("Check your password");
                    } else if (validate == 2) {
                        System.out.println("Check your password length");
                    } else {
                        register = new Register(name, age, mail, password);
                        hashMapHandler.getRegisterObject(mail, register);
                    }

                    break;
                }
                case 2: {
                    System.out.println("Enter your mail id");
                    String mail = scan.nextLine();
                    System.out.println("Enter your password");
                    String password = scan.nextLine();

                    int validate = validationLogin.validateLogin(mail, password);
                    if (validate == 3) {
                        System.out.println("You have no acc please register");
                    } else if (validate == 2) {
                        System.out.println("Wrong password");
                    } else {
                        int total = 0;
                        String[] hotelArray = new String[]{"Gourmet", "Paradise", "Priyam", "God Father"};
                        while (true) {
                            System.out.println("Welcome Bro!\nWe are having Two ways of searches\n1.Search By hotel\n2.Search By Food\n3.Cart");
                            int option = scan.nextInt();
                            switch (option) {
                                case 1: {
                                    for (int i = 0; i < hotelArray.length; i++) {
                                        System.out.println((i + 1) + " " + hotelArray[i]);
                                    }
                                    System.out.println("Enter you choice");
                                    int hotelChoice = scan.nextInt();
                                    HashMap<String, ArrayList<Food>> map = ll.foodArrayList();
                                    ArrayList<Food> foodArray = map.get(hotelArray[hotelChoice - 1]);
                                    for (int i = 0; i < foodArray.size(); i++) {
                                        Food food = foodArray.get(i);
                                        System.out.println((i + 1) + " " + food.getFoodName());
                                    }
                                    System.out.println("Enter the choice");
                                    int foodChoice = scan.nextInt();
                                    Food food = foodArray.get(foodChoice - 1);
                                    total += food.getPrice();


                                    break;
                                }
                                case 2: {
                                    break;
                                }
                                case 3: {
                                    System.out.println("Your total amount is " + total);
                                    break;
                                }
                            }

                        }
                    }
                    break;
                }
            }
        }
    }
}
