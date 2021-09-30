package UI;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;

public class LogicLayer {
    User user = new User();
    Admin admin = new Admin();
    Database database = new Database();
    ArrayList<Register> registerArrayList = new ArrayList<>();

    HashMapHandler hashMapHandler = new HashMapHandler();
    //LogicLayer(){

   // }
    public void userRegister(Register register) throws SQLException {
        hashMapHandler.store(register.getEmail(), register);
        registerArrayList.add(register);

        database.insertRegister(registerArrayList);

    }
    public void userLogin(String email, String password){
//        HashMap<String,Register> map =  hashMapHandler.returnRegister();
//        if(map.containsKey(email)) {
//            Register register = map.get(email);
//            if (register.getPassword().equals(password)) {
//                if (register.getFlag() != 0) {
//                    System.out.println("Welcome " + register.getUserName());
//                } else {
//                    System.out.println("Admin not approved");
//                }
//            } else {
//                System.out.println("Your password is wrong");
//            }
//        }else {
//            System.out.println("Wrong email id");
//        }
        user.userLoginService(email, password);
    }
    public int adminLogin(String userName, String password){
//        if(userName.equals(adminUserName) && password.equals(adminPassword)){
////            HashMap<String,Register> map =  hashMapHandler.returnRegister();
////            System.out.println(map.keySet());
//            return 1;
//
//        }else{
//            return -1;
//        }
        return admin.adminLoginService(userName,password);
    }
    public void userApproval(String email){
//        HashMap<String,Register> map =  hashMapHandler.returnRegister();
//        Register register = map.get(email);
//        register.setFlag(1);
//        System.out.println("approved!!!");
        admin.userApprovalService(email);

    }
    public void show(){
//        HashMap<String,Register> map =  hashMapHandler.returnRegister();
//        System.out.println(map);
        admin.showService();
    }
}
