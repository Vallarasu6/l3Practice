package library;

import java.util.HashMap;

public class HashMapHandler {
    public static HashMap<String,HashMap<String,Book>> outerMap = new HashMap<>();
    public static HashMap<String, Book> innerMap;
    public static void store(String bookName, String authorName, Book book){
        innerMap = outerMap.getOrDefault(authorName,new HashMap<String, Book>());
        innerMap.put(bookName,book);
        outerMap.put(authorName, innerMap);
//        System.out.println(innerMap);
//        System.out.println(outerMap);
    }
    public HashMap<String,HashMap<String,Book>> returnMap(){
        return outerMap;
    }
    public HashMap<String ,Book> returnInner(){
        return innerMap;
    }
}
