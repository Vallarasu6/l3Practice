package internetBanking;

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogicLayer {
HashMapHandler hashMapHandler = new HashMapHandler();
public String registerData(Register register){
    Register register1 = register;
    String name = register1.getName();
    String s = hashMapHandler.store(name, register);
    return s;
}
public String checkLogin(String name,String password){
    HashMap<String ,Register> map = hashMapHandler.returnMap();
    System.out.println(map.get(name));
    if(map.containsKey(name)){
        Register register = map.get(name);
        if(register.getPassword().equals(password)){
            return "Successfully logged in";
        }else{
            return "Password is wrong";
        }
    }else{
        return "name is wrong";
    }

}
public String checkBalance(String name){
    HashMap<String ,Register> map = hashMapHandler.returnMap();
    Register register = map.get(name);
    long newBalance = register.getBalance();
    return "Your balance is "+newBalance;


}
    public String changePassword(String changePassword,String oldName){
        HashMap<String ,Register> map = hashMapHandler.returnMap();
        Register register = map.get(oldName);
        register.setPassword(changePassword);
        System.out.println(map);
        return "Password changed";
    }
    public String sendBalance(String name,String senderName,long senderBalance){
        HashMap<String ,Register> map = hashMapHandler.returnMap();
        Register register = map.get(name);
        long existBalance = register.getBalance();
        if(existBalance>=senderBalance){
            if(map.containsKey(senderName)) {
                Register register1 = map.get(senderName);
                register1.setBalance(register1.getBalance() + senderBalance);
                register.setBalance(register.getBalance()-senderBalance);
                return "Successfully transferred";
            }else {
                return "No receiver name available";
            }
        }else {
            return "No fund sufficient";
        }
    }
    public boolean checkPassword(String password){
    String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&=+])(?=\\S+$).{6,20}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        return m.matches();
    }
}
