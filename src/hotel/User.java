package hotel;

public class User {
    private String userName;
    private String hName;
    private int userId;
    private int price;

    public User(String userName, String hName, int userId, int price) {
        this.userName = userName;
        this.hName = hName;
        this.userId = userId;
        this.price = price;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String gethName() {
        return hName;
    }

    public void sethName(String hName) {
        this.hName = hName;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", hName='" + hName + '\'' +
                ", userId=" + userId +
                ", price=" + price +
                '}';
    }
}
