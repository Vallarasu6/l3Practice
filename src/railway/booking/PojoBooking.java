package railway.booking;

public class PojoBooking {
    private String name;
    private int age;
    private String berth;
    private String position;
    public PojoBooking() {}

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBerth() {
        return berth;
    }

    public void setBerth(String berth) {
        this.berth = berth;
    }

    @Override
    public String toString() {
        return "PojoBooking{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", berth='" + berth + '\'' +
                ", position='" + position + '\'' +
                '}';
    }
}
