package internetBanking;

import java.util.HashMap;

public class HashMapHandler {
    HashMap<String ,Register> map  = new HashMap<>();
    public String store(String name, Register register){
        if(map.containsKey(name)){
            return "Already a member";
        }else{
            map.put(name,register);
            return "Registered successfully";
        }

    }
    public HashMap<String ,Register> returnMap(){
        return map;
    }
}
