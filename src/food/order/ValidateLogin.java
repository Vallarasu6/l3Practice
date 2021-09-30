package food.order;

import java.util.HashMap;

public class ValidateLogin {
    HashMapHandler hashMapHandler = new HashMapHandler();
    public int validateLogin(String mail, String password){
        HashMap<String , Register> map =  hashMapHandler.returnHashMap();
        if(map.get(mail)!=null){
            Register register = map.get(mail);
            if(register.getPassword().equals(password)){
                return 1;
            }else{
                return 2;
            }
        }
        return 3;
    }
}
