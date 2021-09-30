package railway.booking;

import java.util.ArrayList;
import java.util.HashMap;

public class LogicLayer {
    Booking b= new Booking();
    Display d = new Display();
    Cancel c= new Cancel();
    ObjectHandler obj = new ObjectHandler();
    String s="";
        ArrayList<PojoBooking> child = new ArrayList<>();

    public String booking(String name, int age, String berth){
        if(age>5) {
             s = b.book(name, age, berth);
            return s;
            // System.out.println("Logic layer"+name+" "+age);
        }else{
            PojoBooking pojoBooking = obj.book(name,age,berth,null);
            child.add(pojoBooking);
            return s ="Sorry!Your age is Below 5, We cant allot a sear for You";

        }
    }
public ArrayList<PojoBooking> childDetails(){
        ArrayList<PojoBooking> children = child;
        return children;
}
    public HashMap<Integer, PojoBooking> showDetails(){
       HashMap<Integer, PojoBooking> map = d.showData();
       return map;
    }
    public void delete(int id){
        c.cancel(id);

    }
}
