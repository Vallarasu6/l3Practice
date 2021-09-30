package conference;

public class PojoEvent {
    private String event;
    private int time;

    public String getEvent() {
        return event;
    }

    public void setEvent(String event) {
        this.event = event;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "PojoEvent{" +
                "event='" + event + '\'' +
                ", time=" + time +
                '}';
    }
}
