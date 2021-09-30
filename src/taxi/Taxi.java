package taxi;

public class Taxi {
    private int taxiId;
    private int customerId;
    private char pickup;
    private char drop;
    private int time;
    //private int state=0;
    private int payment;
    private int freeTime=1;
    private char stand = 'a';

    public char getStand() {
        return stand;
    }

    public void setStand(char stand) {
        this.stand = stand;
    }

    public int getFreeTime() {
        return freeTime;
    }

    public void setFreeTime(int freeTime) {
        this.freeTime = freeTime;
    }

    public int getTaxiId() {
        return taxiId;
    }

    public void setTaxiId(int taxiId) {
        this.taxiId = taxiId;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

//    public int getState() {
//        return state;
//    }
//
//    public void setState(int state) {
//        this.state = state;
//    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public char getPickup() {
        return pickup;
    }

    public void setPickup(char pickup) {
        this.pickup = pickup;
    }

    public char getDrop() {
        return drop;
    }

    public void setDrop(char drop) {
        this.drop = drop;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Taxi{" +
                "taxiId=" + taxiId +
                ", customerId=" + customerId +
                ", pickup=" + pickup +
                ", drop=" + drop +
                ", time=" + time +
//                ", state=" + state +
                ", payment=" + payment +
                ", freeTime=" + freeTime +
                ", stand='" + stand + '\'' +
                '}';
    }
}
