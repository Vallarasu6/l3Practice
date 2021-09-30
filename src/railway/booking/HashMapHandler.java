package railway.booking;

import java.util.HashMap;

public class HashMapHandler {
    static HashMap<Integer, PojoBooking> bookingHashMap = new HashMap<>();


    public  HashMap<Integer,PojoBooking>  bookingHashMap(int i, PojoBooking pojoBooking) {
        bookingHashMap.put(i,pojoBooking);
        return bookingHashMap;
    }
    public HashMap<Integer,PojoBooking> show(){
        return bookingHashMap;
    }
}
