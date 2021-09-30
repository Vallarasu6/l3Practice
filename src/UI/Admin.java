package UI;

import java.util.HashMap;

public class Admin {
    HashMapHandler hashMapHandler = new HashMapHandler();

    String adminUserName = "valla";
    String adminPassword = "alla";
    public int adminLoginService(String userName, String password){
        if(userName.equals(adminUserName) && password.equals(adminPassword)){
//            HashMap<String,Register> map =  hashMapHandler.returnRegister();
//            System.out.println(map.keySet());
            return 1;

        }else{
            return -1;
        }
    }
    public void userApprovalService(String email){
        HashMap<String,Register> map =  hashMapHandler.returnRegister();
        Register register = map.get(email);
        register.setFlag(1);
        System.out.println("approved!!!");
    }
    public void showService(){
        HashMap<String,Register> map =  hashMapHandler.returnRegister();
        System.out.println(map);
    }
}
