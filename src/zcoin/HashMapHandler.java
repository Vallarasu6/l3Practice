package zcoin;

import java.util.HashMap;

public class HashMapHandler {
     HashMap<String,RegisterPojo> registerMap = new HashMap<>();
    public void register(String userEmail,RegisterPojo registerPojo){
        System.out.println(registerPojo);
        registerMap.put(userEmail,registerPojo);
    }
    public HashMap<String,RegisterPojo> returnRegisterMap(){
        return registerMap;
    }
//    public static HashMap<String,String> adminLogoMap = new HashMap<>();
//
//    public void adminLogin(AdminPojo adminPojo){
//
//        adminLogoMap.put("valla","alla");
//    }
//    public HashMap<String,String> returnAdminLoginData(){
//        return adminLogoMap;
//    }

}
