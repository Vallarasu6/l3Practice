package zcoin;

public class RegisterPojo {
    private String userName;
    private String userEmail;
    private long userMobile;
    private int userId;
    private String userPassword;
    private long realMoney;
    private int flag=0;

    public int getFlag() {
        return flag;
    }

    public void setFlag(int flag) {
        this.flag = flag;
    }

    public long getRealMoney() {
        return realMoney;
    }

    public void setRealMoney(long realMoney) {
        this.realMoney = realMoney;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserEmail() {
        return userEmail;
    }

    public void setUserEmail(String userEmail) {
        this.userEmail = userEmail;
    }

    public long getUserMobile() {
        return userMobile;
    }

    public void setUserMobile(long userMobile) {
        this.userMobile = userMobile;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }


    @Override
    public String toString() {
        return "RegisterPojo{" +
                "userName='" + userName + '\'' +
                ", userEmail='" + userEmail + '\'' +
                ", userMobile=" + userMobile +
                ", userId=" + userId +
                ", userPassword='" + userPassword + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }
}
