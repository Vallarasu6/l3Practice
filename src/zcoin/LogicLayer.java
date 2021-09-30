package zcoin;

import java.util.HashMap;
import java.util.Set;

public class LogicLayer {
    String adminUserName = "valla";
    String adminPassword = "alla";
    HashMapHandler hashMapHandler = new HashMapHandler();
    static int userId=0;
    public void userRegister(RegisterPojo registerPojo){
        userId++;
        registerPojo.setUserId(userId);
        System.out.println(registerPojo);
        hashMapHandler.register(registerPojo.getUserEmail(),registerPojo);
    }
    public void returnRegister(){
        System.out.println(hashMapHandler.returnRegisterMap());
    }
    public int userLogin(LoginPojo loginPojo){
        String email = loginPojo.getUserEmail();
        String password = loginPojo.getUserPassword();
        HashMap<String,RegisterPojo> map = hashMapHandler.returnRegisterMap();
        if(map.containsKey(email)){
            RegisterPojo registerPojo = map.get(email);
            if(registerPojo.getUserPassword().equals(password)){
               if(registerPojo.getFlag()==0){
                   return -2;
               }else {
                   return 1;
               }

            }else{
                return -1;
            }
        }else{
            return -1;
        }
    }
//    public void setAdminLogin(AdminPojo adminLoginData){
//        hashMapHandler.adminLogin(adminLoginData);
//    }
    public int adminLogin(AdminPojo adminPojo){
      // HashMap<String,String> map =  hashMapHandler.returnAdminLoginData();
        String email = adminPojo.getUserEmail();
        String password = adminPojo.getUserPassword();
      //  Set<String> set = map.keySet();
//        for (int i = 0; i < ; i++) {
//
//        }

            if(email.equals(adminUserName) && password.equals(adminPassword)){
                return 1;
            }else{
                return -1;
            }



    }
    public void approval(){
        HashMap<String,RegisterPojo> map = hashMapHandler.returnRegisterMap();
        Set<String> set = map.keySet();
        int i=1;
        for(String s : set){
            System.out.println(i+"."+s);
            i++;
        }
    }
    public void changeState(String approval){
        HashMap<String,RegisterPojo> map = hashMapHandler.returnRegisterMap();
        RegisterPojo registerPojo = map.get(approval);
        registerPojo.setFlag(1);

    }

}
