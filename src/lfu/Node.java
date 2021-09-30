package lfu;

public class Node {
    private int key;
    private int value;
    private int count;


    public Node(int key, int value, int count) {
        this.key = key;
        this.value = value;
        this.count = count;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getKey() {
        return key;
    }

    public void setKey(int key) {
        this.key = key;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }


    @Override
    public String toString() {
        return "Node{" +
                "key=" + key +
                ", value=" + value +
                ", count=" + count +
                '}';
    }

}
