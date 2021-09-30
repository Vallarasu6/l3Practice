package toll;

public class Toll {
    private int toll;
    private int amount;
    private int vNum;

    public int getToll() {
        return toll;
    }

    public void setToll(int toll) {
        this.toll = toll;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getvNum() {
        return vNum;
    }

    public void setvNum(int vNum) {
        this.vNum = vNum;
    }

    @Override
    public String toString() {
        return "Toll{" +
                "toll=" + toll +
                ", amount=" + amount +
                ", vNum=" + vNum +
                '}';
    }
}
