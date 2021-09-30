package lru;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Set;

public class Logicayer {
    HashMap<Integer,Integer> map = new HashMap<>();
    ArrayList<Node> node = new ArrayList<>();
    int capacity=3;
    Node nodeObj;
    public void put(int key, int value){
        nodeObj = new Node(key,value);
        node.add(nodeObj);
            if(map.containsKey(key)){
               map.remove(key);


            }
            if(map.size()==capacity){
               Node node1 = node.get(0);
               map.remove(node1.getKey());
               node.remove(0);
            }
        map.put(key,value);
        System.out.println("Added Successfully");
    }
    public void get(int key){
        int a = 0,b=0;
        if(map.containsKey(key)){

            map.remove(key);
            for (int i=0;i<node.size();i++){
                Node node1 = node.get(i);
                if(key==node1.getKey()){
                    a= node1.getKey();
                    b= node1.getValue();
                    node.remove(i);
                    break;
                }
            }
            map.put(a,b);
            node.add(new Node(a,b));
            System.out.println("Get value "+b);
        }else{
            System.out.println("Not found");
        }

    }
}
