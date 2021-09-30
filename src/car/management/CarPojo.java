package car.management;

public class CarPojo {
    private String city;
    private int seltos;
    private int sonet;

    public CarPojo(String city, int seltos, int sonet) {
        this.city = city;
        this.seltos = seltos;
        this.sonet = sonet;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getSeltos() {
        return seltos;
    }

    public void setSeltos(int seltos) {
        this.seltos = seltos;
    }

    public int getSonet() {
        return sonet;
    }

    public void setSonet(int sonet) {
        this.sonet = sonet;
    }

    @Override
    public String toString() {
        return "CarPojo{" +
                "city='" + city + '\'' +
                ", seltos=" + seltos +
                ", sonet=" + sonet +
                '}';
    }
}
