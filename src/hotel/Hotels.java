package hotel;

public class Hotels {
    private String name;
    private int room;
    private String location;
    private int rating;
    private int price;
    public Hotels(String name,int room,String location,int rating,int price){
        this.name = name;
        this.room = room;
        this.location = location;
        this.rating = rating;
        this.price = price;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoom() {
        return room;
    }

    public void setRoom(int room) {
        this.room = room;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "hotels{" +
                "name='" + name + '\'' +
                ", room=" + room +
                ", location='" + location + '\'' +
                ", rating=" + rating +
                ", price=" + price +
                '}';
    }
}
