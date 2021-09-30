package UI;

import java.util.HashMap;

public class HashMapHandler {
    HashMap<String,Register> registerHashMap = new HashMap<>();
    public void store(String email,Register register){
        registerHashMap.put(email,register);
        System.out.println("Hi "+registerHashMap);
    }
    public HashMap<String,Register> returnRegister(){
        System.out.println("Vetri "+registerHashMap);
        return registerHashMap;
    }

}
