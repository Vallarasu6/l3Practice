package route;

import java.util.HashMap;
import java.util.TreeSet;

public class HashMapHandler {
    public static HashMap<Character , HashMap<Character,Integer>> outerMap = new HashMap<>();
    public static HashMap<Character, Integer> innerMap;
    public static TreeSet<Character> set = new TreeSet<>();
    public void store(char first,char second,Integer km){
    innerMap = outerMap.getOrDefault(first,new HashMap<Character,Integer>());
    innerMap.put(second,km);
    outerMap.put(first,innerMap);
    }
    public HashMap<Character , HashMap<Character,Integer>> returnOuter(){
        return outerMap;
    }
//    public HashMap<Character, Integer>  returnInner(){
//        return innerMap;
//    }
    public void setStore(char f,char s){
        set.add(f);
        set.add(s);
    }
    public TreeSet<Character> returnSet(){
        return set;
    }
}
