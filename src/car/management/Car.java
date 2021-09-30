package car.management;

public class Car {
    private String city;
    private String branchName;
    private int seltos;
    private int sonet;

    public Car(String city, String branchName, int seltos, int sonet) {
        this.city = city;
        this.branchName = branchName;
        this.seltos = seltos;
        this.sonet = sonet;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getBranchName() {
        return branchName;
    }

    public void setBranchName(String branchName) {
        this.branchName = branchName;
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
        return "Car{" +
                "city='" + city + '\'' +
                ", branchName='" + branchName + '\'' +
                ", seltos=" + seltos +
                ", sonet=" + sonet +
                '}';
    }
}
