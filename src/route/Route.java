package route;

public class Route {
    private char first;
    private char second;
    private int km;

    public Route(char first, char second, int km) {
        this.first = first;
        this.second = second;
        this.km = km;
    }

    public char getFirst() {
        return first;
    }

    public void setFirst(char first) {
        this.first = first;
    }

    public char getSecond() {
        return second;
    }

    public void setSecond(char second) {
        this.second = second;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    @Override
    public String toString() {
        return "Route{" +
                "first=" + first +
                ", second=" + second +
                ", km=" + km +
                '}';
    }
}
