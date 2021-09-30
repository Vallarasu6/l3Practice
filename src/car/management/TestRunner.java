package car.management;

import java.util.*;

public class TestRunner {
    public static void main(String[] args) {
        ArrayList<CarPojo> carPojoArrayList= new ArrayList<>();
        ArrayList<City> carSell= new ArrayList<>();
        ArrayList<String> cityArrayList = new ArrayList<>();
        HashMapHandler hashMapHandler = new HashMapHandler();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of cities");
        int cities = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i < cities; i++) {
            System.out.println("Enter the city name");
            String city = scan.nextLine();
            cityArrayList.add(city);
            System.out.println("Enter the num of branches");
            int branches = scan.nextInt();
            scan.nextLine();
            for (int j = 0; j < branches; j++) {
                System.out.println("Enter the branch Name");
                String branch = scan.nextLine();
                Car car = new Car(city,branch,0,0);
                hashMapHandler.store(city,branch,car);
            }
        }
        while (true){
            System.out.println("Enter your choice\n1.Admin\n2.Customer");
            int choice = scan.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("Enter the option\n1.Dispatch the car\n2.Show\n3.Show most sold");
                    int opt = scan.nextInt();
                    switch (opt){
                        case 1:{
                            System.out.println("Enter the city you want to dispatch");
                            for(int i=0;i<cityArrayList.size();i++){
                                System.out.println((i+1)+" "+cityArrayList.get(i));
                            }
                            int cityChoice = scan.nextInt();
                            scan.nextLine();
                            String citySelected = cityArrayList.get(cityChoice-1);
                            HashMap<String , HashMap<String, Car>> map = hashMapHandler.returnOuterMap();
                            HashMap<String,Car> inner= map.get(citySelected);
                            for(Map.Entry<String, Car> entry: inner.entrySet()) {
                                System.out.println(entry.getKey());
                            }
                            System.out.println("Enter the branch");
                            String branchSelected = scan.nextLine();
                            System.out.println("Enter the type\n1.Seltos\n.Sonet");
                            int s  = scan.nextInt();
                            Car car = inner.get(branchSelected);
                            if(s==1){
                                int temp = car.getSeltos();
                                temp++;
                                car.setSeltos(temp);
                            }else{
                                int temp = car.getSonet();
                                temp++;
                                car.setSonet(temp);
                            }
                            System.out.println("Dispatched successfully");
                            break;
                        }
                        case 2:{
                            HashMap<String , HashMap<String, Car>> map = hashMapHandler.returnOuterMap();
                            System.out.println(map);
                            break;
                        }
                        case 3:{
                            int seltosTemp=0,sonetTemp=0;
                            HashMap<String , HashMap<String, Car>> map = hashMapHandler.returnOuterMap();
                            for (int i = 0; i < map.size(); i++) {
                                HashMap<String,Car> in= map.get(cityArrayList.get(i));
                                for(Map.Entry<String, Car> entry: in.entrySet()) {
                                    //System.out.println(entry.getKey());
                                    String temp = entry.getKey();
                                    Car car = in.get(temp);
                                    seltosTemp += car.getSeltos();
                                    sonetTemp+= car.getSonet();

                                }

                                CarPojo carPojo = new CarPojo(cityArrayList.get(i),seltosTemp,sonetTemp);
                                carPojoArrayList.add(carPojo);
                                seltosTemp=0;
                                sonetTemp=0;
                            }
                            System.out.println("1.Seltos\n2.Sonet\n");
                            int c  = scan.nextInt();
                            if(c==1) {
                                Comparator<CarPojo> com = new Comparator<CarPojo>() {
                                    @Override
                                    public int compare(CarPojo t, CarPojo t1) {
                                        if (t.getSeltos() < t1.getSeltos()) {
                                            return 1;
                                        } else {
                                            return -1;
                                        }
                                    }
                                };
                                carPojoArrayList.sort(com);
                            }else{
                                Comparator<CarPojo> com = new Comparator<CarPojo>() {
                                    @Override
                                    public int compare(CarPojo t, CarPojo t1) {
                                        if (t.getSonet() < t1.getSonet()) {
                                            return 1;
                                        } else {
                                            return -1;
                                        }
                                    }
                                };
                                carPojoArrayList.sort(com);
                            }
                            System.out.println(carPojoArrayList.get(0));

                            break;
                        }
                    }
                    break;
                }
                case 2:{
                    System.out.println("Enter the city");
                    for(int i=0;i<cityArrayList.size();i++){
                        System.out.println((i+1)+" "+cityArrayList.get(i));
                    }
                    int cityChoice = scan.nextInt();
                    scan.nextLine();
                    String citySelected = cityArrayList.get(cityChoice-1);
                    HashMap<String , HashMap<String, Car>> map = hashMapHandler.returnOuterMap();
                    HashMap<String,Car> inner= map.get(citySelected);
                    for(Map.Entry<String, Car> entry: inner.entrySet()) {
                        System.out.println(entry.getKey());
                    }
                    System.out.println("Enter the branch");
                    String branchSelected = scan.nextLine();
                    System.out.println("Enter the type\n1.Seltos\n.Sonet");
                    int s  = scan.nextInt();
                    Car car = inner.get(branchSelected);
                    if(s==1){
                        int temp = car.getSeltos();
                        temp--;
                        car.setSeltos(temp);
                        City city = new City(citySelected,branchSelected, "Seltos");
                        carSell.add(city);
                    }else{
                        int temp = car.getSonet();
                        temp--;
                        car.setSonet(temp);
                        City city = new City(citySelected,branchSelected, "Sonet");
                        carSell.add(city);

                    }

                    System.out.println("Dispatched successfully");
                    System.out.println(carSell);
                    System.out.println(map);
                    break;
                }
            }
        }
    }
}
