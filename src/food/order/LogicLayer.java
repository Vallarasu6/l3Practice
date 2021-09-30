package food.order;

import java.util.ArrayList;
import java.util.HashMap;

public class LogicLayer {
public HashMap<String,ArrayList<Food>> foodArrayList(){
    ArrayList<Food> food1 = new ArrayList<>();
    ArrayList<Food> food2 = new ArrayList<>();
    ArrayList<Food> food3 = new ArrayList<>();
    food1.add(new Food("Idly",200));
    food1.add(new Food("Dosa",300));
    food2.add(new Food("Idly",200));
    food2.add(new Food("Dosa",300));
    food2.add(new Food("Noodles",400));
    food3.add(new Food("Idly",200));
    food3.add(new Food("Dosa",300));
    food3.add(new Food("Noodles",400));
    food3.add(new Food("Rice",500));
    HashMap<String,ArrayList<Food>> foodHashMap = new HashMap<>();
    foodHashMap.put("Gourmet",food1);
    foodHashMap.put("Paradise",food2);
    foodHashMap.put("Priyam",food3);
return foodHashMap;
}
}
