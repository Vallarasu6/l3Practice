package conference;

import java.util.ArrayList;
import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the inputs");
        String s="";
        ArrayList<String> list= new ArrayList<String>();
        while (!s.equals("no")){
          s =scan.nextLine();
          if(!s.equals("no")){
              list.add(s);
          }


        }
        ProcessLayer processLayer = new ProcessLayer();
        processLayer.process(list);
        System.out.println(list);
    }
}
