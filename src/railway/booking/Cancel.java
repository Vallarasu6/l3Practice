package railway.booking;

import javax.sound.midi.Soundbank;
import java.util.HashMap;

public class Cancel {
    Display d = new Display();
    public void cancel(int id){

        HashMap<Integer,PojoBooking> map =d.showData();
        System.out.println(map.remove(id)+" "+"is deleted");

    }
}
