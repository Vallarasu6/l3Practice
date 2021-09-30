package route;

import java.util.*;

public class TestRunner {
    public static void main(String[] args) {
        Route routeObj;
        ArrayList<Route> routes = new ArrayList<>();
        HashMapHandler hashMapHandler = new HashMapHandler();
        Scanner scan = new Scanner(System.in);
        while (true){
            System.out.println("Enter your choice\n1.Add route\n2.Find city\n3.Print route\n4.Show cities\n5.Delete Route\n6.Short path\n7.Busy City");
            int choice = scan.nextInt();
            switch (choice){
                case 1:{
//                    for (int i = 0; i < 10; i++) {
//
//                    }
                    routeObj = new Route('a','b',20);
                    routes.add(routeObj);

                    routeObj = new Route('a','c',45);
                    routes.add(routeObj);

                    routeObj = new Route('a','d',25);
                    routes.add(routeObj);

                    routeObj = new Route('b','f',90);
                    routes.add(routeObj);

                    routeObj = new Route('b','g',35);
                    routes.add(routeObj);

                    routeObj = new Route('c','e',10);
                    routes.add(routeObj);

                    routeObj = new Route('d','g',30);
                    routes.add(routeObj);

                    routeObj = new Route('e','h',35);
                    routes.add(routeObj);

                    routeObj = new Route('f','g',30);
                    routes.add(routeObj);

                    routeObj = new Route('g','h',40);
                    routes.add(routeObj);
                    hashMapHandler.store('a','b',20);
                    hashMapHandler.store('a','c',45);
                    hashMapHandler.store('a','d',25);
                    hashMapHandler.store('b','f',90);
                    hashMapHandler.store('b','g',35);
                    hashMapHandler.store('c','e',10);
                    hashMapHandler.store('d','g',30);
                    hashMapHandler.store('e','h',35);
                    hashMapHandler.store('f','g',30);
                    hashMapHandler.store('g','h',40);
                    hashMapHandler.setStore('a','b');
                    hashMapHandler.setStore('a','c');
                    hashMapHandler.setStore('a','d');
                    hashMapHandler.setStore('b','f');
                    hashMapHandler.setStore('b','g');
                    hashMapHandler.setStore('c','e');
                    hashMapHandler.setStore('d','g');
                    hashMapHandler.setStore('e','h');
                    hashMapHandler.setStore('f','g');
                    hashMapHandler.setStore('g','h');
                    //System.out.println("Enter the first ");
//                    char first = scan.next().charAt(0);
//                    System.out.println("Enter the second ");
//                    char second = scan.next().charAt(0);
//                    System.out.println("Enter the distance ");
//                    int km = scan.nextInt();
//                    routeObj = new Route(first,second,km);
//                    routes.add(routeObj);
                    //                   hashMapHandler.store(first,second,km);
//                    hashMapHandler.setStore(first,second);
                    System.out.println(hashMapHandler.returnOuter());
                    break;
                }
                case 2:{
                    //System.out.println(hashMapHandler.returnOuter());
                    HashMap<Character , HashMap<Character,Integer>> map = hashMapHandler.returnOuter();
                    //HashMap<Character , Integer> innerMap = hashMapHandler.returnInner();

                    TreeSet<Character> set = hashMapHandler.returnSet();
                    System.out.println(set);
                    System.out.println("Enter the city");
                    char city = scan.next().charAt(0);
                    if(set.contains(city)){
                        System.out.println("Yes found");
                    }else{
                        System.out.println(" Not found");
                    }
                    break;
                }
                case 3:{
                    HashMap<Character , HashMap<Character,Integer>> map = hashMapHandler.returnOuter();
                        System.out.println(map.keySet());

                    Set<Character> city = map.keySet();
                    for(char c : city){
                        HashMap<Character,Integer> innerMap = map.get(c);
                        Set<Character> innerSet = innerMap.keySet();
                        for (char s : innerSet){
                            System.out.print(c);
                            System.out.println(s);
                            System.out.println(innerMap.get(s));
                        }
                    }

                    break;
                }
                case 4:{
                    TreeSet<Character> set = hashMapHandler.returnSet();
                    System.out.println(set);
                    break;
                }
                case 5:{
                    HashMap<Character , HashMap<Character,Integer>> map = hashMapHandler.returnOuter();

                    System.out.println("Enter the first");
                    char first = scan.next().charAt(0);
                    System.out.println("Enter the second ");
                    char second = scan.next().charAt(0);
                    TreeSet<Character> set = hashMapHandler.returnSet();
                    if(set.contains(first) && set.contains(second)){
                        if(map.containsKey(first)){
                            HashMap<Character,Integer>innerMap = map.get(first);
                            if(innerMap.containsKey(second)){
                                innerMap.remove(second);
                                System.out.println("Removed Successfully");
                            }else{
                                System.out.println("No route found");
                            }
                        }
                    }else{
                        System.out.println("No cities found");
                    }
                    break;
                }

                case 6:{
                    System.out.println("Enter the first ");
                    char first = scan.next().charAt(0);
                    char temp = first;
                    System.out.println("Enter the second ");
                    char second = scan.next().charAt(0);
                    HashMap<Character , HashMap<Character,Integer>> map = hashMapHandler.returnOuter();
                    add(first, map,second,temp);

                    break;
                }
                case 7:{
                    HashMap<Character , HashMap<Character,Integer>> map = hashMapHandler.returnOuter();

                    break;
                }
                default:
                    throw new IllegalStateException("Unexpected value: " + choice);
            }

        }
    }
    static ArrayList<ArrayList<Character>> rr = new ArrayList<>();
static ArrayList<Character> r = new ArrayList<>();

  static   int sum = 0;
    private static void add(char first, HashMap<Character, HashMap<Character, Integer>> map,char second,char temp) {
        HashMap<Character, Integer> inner = map.get(first);
        //System.out.println(inner);
        Set<Character> set = inner.keySet();
        //System.out.println(set);
        for (char c : set) {
            r.add(c);
            sum += inner.get(c);
            if(c!=second) {
                first = c;

                add(first, map, second, temp);
            }else {
                rr.add(r);
                System.out.print(temp);
                System.out.println(r);
                System.out.println(sum);



            }
            r.remove(r.size()-1);
            sum=sum-inner.get(c);
            System.out.println(rr);
        }

    }
}
