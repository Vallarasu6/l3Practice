package lfu;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;

public class LogicLayer {
    HashMap<Integer,Integer> map = new HashMap<>();
    ArrayList<Node> list = new ArrayList<>();
    int capacity=3;
    Node node;
    public void put(int key,int value){

        if(!map.containsKey(key)&& map.size()<capacity){
                    node = new Node(key,value,1);
        list.add(node);
        }

        if(map.containsKey(key)){
            map.remove(key);
            for (int i = 0; i < list.size(); i++) {
                Node node1 = list.get(i);
                if(node1.getKey()==key){
                    list.remove(i);
                    int count = node1.getCount();
                    count++;
                    node1.setValue(value);
                    node1.setCount(count);
                    list.add(node1);
                }
            }
        }
        if(map.size()==capacity){
            Comparator<Node> com = new Comparator<Node>() {
                @Override
                public int compare(Node t, Node t1) {
                    if(t.getCount()> t1.getCount()){
                        return 1;
                    }else if(t.getCount()< t1.getCount()){
                        return -1;
                    }else{
                        return 0;
                    }
                }
            };
            Collections.sort(list,com);

            Node node1 = list.get(0);
           map.remove(node1.getKey());
            list.remove(0);
            list.add(0,new Node(key,value,1));

        }
        map.put(key,value);
        System.out.println("Added Successfully");
        System.out.println(map);

    }
    public void get(int key){
        if(map.containsKey(key)){
            System.out.println("The value is "+map.get(key));
        }else{
            System.out.println("Not found");
        }
        System.out.println(map);

    }
}
