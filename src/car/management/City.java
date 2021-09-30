package car.management;

public class City {
    private String city;
    private String branchName;
    private String car;

    public City(String city, String branchName, String car) {
        this.city = city;
        this.branchName = branchName;
        this.car = car;
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

    public String getCar() {
        return car;
    }

    public void setCar(String car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "City{" +
                "city='" + city + '\'' +
                ", branchName='" + branchName + '\'' +
                ", car='" + car + '\'' +
                '}';
    }
}
