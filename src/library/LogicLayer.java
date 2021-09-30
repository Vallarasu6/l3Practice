package library;

import java.util.HashMap;

public class LogicLayer {
    HashMapHandler hashMapHandler = new HashMapHandler();

    public void searchName(String bookName,int option){
        HashMap<String,Book> map = hashMapHandler.returnInner();
        System.out.println(map.get(bookName));
    }
    public void searchAuthor(String author){
        HashMap<String,HashMap<String,Book>> outerMap = hashMapHandler.returnMap();
        System.out.println(outerMap);
    }
}
