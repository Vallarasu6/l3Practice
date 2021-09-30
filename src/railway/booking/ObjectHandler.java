package railway.booking;

public class ObjectHandler {
public PojoBooking book(String name, int age, String berth, String position){
    PojoBooking pojoBooking = new PojoBooking();
    pojoBooking.setName(name);
    pojoBooking.setAge(age);
    pojoBooking.setBerth(berth);
    pojoBooking.setPosition(position);

    return pojoBooking;
}
}
