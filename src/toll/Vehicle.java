package toll;

public class Vehicle {
    private int payment;
    private int vehicleNum;
    private char start;
    private char destiny;

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    private String vehicleName;

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public int getVehicleNum() {
        return vehicleNum;
    }

    public void setVehicleNum(int vehicleNum) {
        this.vehicleNum = vehicleNum;
    }

    public char getStart() {
        return start;
    }

    public void setStart(char start) {
        this.start = start;
    }

    public char getDestiny() {
        return destiny;
    }

    public void setDestiny(char destiny) {
        this.destiny = destiny;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "payment=" + payment +
                ", vehicleNum=" + vehicleNum +
                ", start='" + start + '\'' +
                ", destiny='" + destiny + '\'' +
                ", vehicleName='" + vehicleName + '\'' +
                '}';
    }
}
