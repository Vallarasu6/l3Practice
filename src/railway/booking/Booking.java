package railway.booking;

import java.util.ArrayList;
import java.util.HashMap;

public class Booking {
    static int i=0;
    static int seat = 2;
    static int rac = 2;
    static int waitingList = 2;
    String s="",position = "";
    ObjectHandler obj = new ObjectHandler();
    HashMapHandler hashMapHandler = new HashMapHandler();

    public String book(String name, int age, String berth){
            if(seat>0) {
                i++;
                position = "seat";
                PojoBooking pojoBooking = obj.book(name, age, berth, position);
                //System.out.println(pojoBooking);
                HashMap<Integer, PojoBooking> map = hashMapHandler.bookingHashMap(i, pojoBooking);
                //System.out.println(map);
                seat--;
               s = "Successfully booked and your id is "+i+"";
               return s;

            }else if(seat<=0&&rac>0){
                i++;
                position = "rac";
                PojoBooking pojoBooking = obj.book(name, age, berth, position);
                //System.out.println(pojoBooking);
                HashMap<Integer, PojoBooking> map = hashMapHandler.bookingHashMap(i, pojoBooking);
                //System.out.println(map);
                rac--;
                return s = "Successfully booked at rac and your id is "+i+"";
            }
            else if(seat<=0&&rac<=0&&waitingList>0){
                i++;
                position = "waitingList";
                PojoBooking pojoBooking = obj.book(name, age, berth, position);
                //System.out.println(pojoBooking);
                HashMap<Integer, PojoBooking> map = hashMapHandler.bookingHashMap(i, pojoBooking);
                //System.out.println(map);
                waitingList--;
                return s ="You r in waiting list and your id is "+i+"";
            }else{
                return s = "Sorry No ticket available";
            }

    }

}
