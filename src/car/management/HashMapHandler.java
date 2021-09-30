package car.management;

import java.util.HashMap;

public class HashMapHandler {
    public static HashMap<String , HashMap<String, Car>> outerMap = new HashMap<>();
    public static HashMap<String,Car> innerMap;
    public void store(String city,String branch,Car car){
        innerMap = outerMap.getOrDefault(city,new HashMap<String,Car>());
        innerMap.put(branch,car);
        outerMap.put(city,innerMap);
    }
    public HashMap<String,Car> returnInnerMap(){
        return innerMap;
    }
    public HashMap<String , HashMap<String, Car>> returnOuterMap(){
        return outerMap;
    }
}
