package mapRoute;

import java.util.HashMap;

public class Cache {
    public static HashMap<Character , HashMap<Character,Integer>> outerMap = new HashMap<>();
    public static HashMap<Character, Integer> innerMap;
    public void cache(char first,char second,Integer km){
        innerMap = outerMap.getOrDefault(first,new HashMap<Character,Integer>());
        innerMap.put(second,km);
        outerMap.put(first,innerMap);
    }
    public HashMap<Character , HashMap<Character,Integer>> returnOuterMap(){
        return outerMap;
    }
}
