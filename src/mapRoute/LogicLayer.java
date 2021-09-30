package mapRoute;

import java.util.*;

public class LogicLayer {
    Cache cacheObj = new Cache();
    Set<Character> set = new LinkedHashSet<>();
    ArrayList< Set<Character>> list = new ArrayList<>();
    HashMap<Character , HashMap<Character,Integer>> outerMap = cacheObj.returnOuterMap();
    HashMap<Character , HashMap<Character,Integer>> outerMapCopy = outerMap;

    public void store(){
        cacheObj.cache('a','b',20);
        cacheObj.cache('a','c',20);
        cacheObj.cache('a','d',20);
        cacheObj.cache('b','f',20);
        cacheObj.cache('b','g',20);
        cacheObj.cache('c','e',20);
        cacheObj.cache('d','g',20);
        cacheObj.cache('e','h',20);
        cacheObj.cache('f','g',20);
        cacheObj.cache('g','h',20);
    }
    public void display(){
        System.out.println(cacheObj.returnOuterMap());
    }
    public void routes(){
        System.out.println(list);
//        for (int i=0;i< list.size();i++){
//            System.out.println("list "+list.get(i));
//        }
    }
    public void allRoutes(char start,char end){
        char temp = start;
        //                Set<Character> set = new LinkedHashSet<>();
        set.add(temp);
       // System.out.println("Set :"+set);
        HashMap<Character, Integer> innerMap = outerMapCopy.get(temp);
        //System.out.println("Inner Map "+innerMap);
        if(innerMap!=null){
            for(Map.Entry<Character,Integer> entry : innerMap.entrySet()){
                if(entry.getKey()==end){

                    set.add(end);
                    Set set1 = new LinkedHashSet<>(set);
                    list.add(set1);
                    //System.out.println("set "+set);

                }
                else {
                    allRoutes(entry.getKey(),end);

                }
                System.out.print(" " +entry.getKey());
                set.remove(entry.getKey());

//            set.removeAll();
            }
        }



    }

}
