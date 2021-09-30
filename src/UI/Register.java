package UI;

public class Register {
    private String userName;
    private String email;
    private long mobile;
    private int id;
    private String password;
    private long amount;
    private int flag=0;

    public Register(String userName, String email, long mobile, int id, String password, long amount,int flag) {
        this.userName = userName;
        this.email = email;
        this.mobile = mobile;
        this.id = id;
        this.password = password;
        this.amount = amount;
    }

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public long getMobile() {
        return mobile;
    }

    public void setMobile(long mobile) {
        this.mobile = mobile;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public long getAmount() {
        return amount;
    }

    public void setAmount(long amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Register{" +
                "userName='" + userName + '\'' +
                ", email='" + email + '\'' +
                ", mobile=" + mobile +
                ", id=" + id +
                ", password='" + password + '\'' +
                ", amount=" + amount +
                ", flag=" + flag +
                '}';
    }
}
