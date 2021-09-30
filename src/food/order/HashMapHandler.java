package food.order;

import java.util.HashMap;

public class HashMapHandler {
    static public HashMap<String , Register> registerHashMap = new HashMap<>();

    public void getRegisterObject(String email, Register register){
registerHashMap.put(email, register);
    System.out.println("You have successfully registered");
}
public HashMap<String , Register> returnHashMap(){
    return registerHashMap;
}
}
