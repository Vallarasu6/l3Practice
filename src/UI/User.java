package UI;

import java.util.HashMap;

public class User {
    HashMapHandler hashMapHandler = new HashMapHandler();
    Database database = new Database();
    public void userLoginService(String email, String password){
        HashMap<String,Register> map= database.uploadData();
       // HashMap<String,Register> map =  hashMapHandler.returnRegister();
        System.out.println("Hello "+map);
        if(map.containsKey(email)) {
            Register register = map.get(email);
            if (register.getPassword().equals(password)) {
                if (register.getFlag() != 0) {
                    System.out.println("Welcome " + register.getUserName());
                } else {
                    System.out.println("Admin not approved");
                }
            } else {
                System.out.println("Your password is wrong");
            }
        }else {
            System.out.println("Wrong email id");
        }
    }
}
