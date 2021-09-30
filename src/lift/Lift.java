package lift;

public class Lift {
    private String floorName;
    private int floor=0;

    public String getFloorName() {
        return floorName;
    }

    public void setFloorName(String floorName) {
        this.floorName = floorName;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public String toString() {
        return "Lift{" +
                "floorName='" + floorName + '\'' +
                ", floor=" + floor +
                '}';
    }
}
