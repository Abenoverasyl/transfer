package app.transfer.models;

public class User {
    private String userName;
    private long money;
    private String rate;

    public User(String userName, long money, String rate) {
        this.userName = userName;
        this.money = money;
        this.rate = rate;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public long getMoney() {
        return money;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public String getRate() {
        return rate;
    }

    public void setRate(String rate) {
        this.rate = rate;
    }
}
