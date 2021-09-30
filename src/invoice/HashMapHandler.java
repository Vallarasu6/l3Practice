package invoice;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapHandler {
    public HashMap<Integer, HashMap<Integer, ArrayList<String>>> outerHashMap = new HashMap<Integer, HashMap<Integer, ArrayList<String>>>();
   public HashMap<Integer, ArrayList<String>> innerHashMap;
    public void getFromInvoice(int id, int invoices,ArrayList<String> itemArrayList){
        innerHashMap = outerHashMap.getOrDefault(id,new HashMap<Integer, ArrayList<String>>());
        innerHashMap.put(invoices,itemArrayList);
        outerHashMap.put(id, innerHashMap);
    }
    public HashMap<Integer,ArrayList<String>> returnInvoice(){
        return innerHashMap;
    }
    public  HashMap<Integer, HashMap<Integer, ArrayList<String>>> returnOuterHashMap(){
        return outerHashMap;
    }

}
