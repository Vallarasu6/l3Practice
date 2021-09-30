package railway.booking;

import java.util.HashMap;

public class Display {
    HashMapHandler hashMapHandler = new HashMapHandler();
    public HashMap<Integer,PojoBooking> showData(){
            HashMap<Integer,PojoBooking> map = hashMapHandler.show();
            return map;
    }
}
