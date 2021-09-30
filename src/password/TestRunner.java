package password;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter pass");
        String password  = scan.nextLine();
        String regex = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&=+])(?=.\\S+$).{8,20}";
        Pattern p = Pattern.compile(regex);
        Matcher m = p.matcher(password);
        System.out.println(m.matches());
        Map<String ,String> map = new HashMap<>();
        map.put("valla","das");
        System.out.println(map.containsValue("das"));
    }
}
