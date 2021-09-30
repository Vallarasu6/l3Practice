package hotel;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        int userId=0;
        ArrayList<User> userArrayList = new ArrayList<User>();
        ArrayList<Hotels> hotelsArrayList = new ArrayList<Hotels>();
        Scanner scan = new Scanner(System.in);
        while (true) {
            System.out.println("Enter the choice\n1.Add hotels\n2.Sort by name" +
                    "\n3.User data\n4.Sort by rating\n5.Sort by Room available\n6.Location\n7.Book");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice) {
                case 1: {
                    System.out.println("Enter the name of the hotel");
                    String hotelName = scan.nextLine();
                    System.out.println("Enter the num of room available");
                    int room = scan.nextInt();
                    scan.nextLine();
                    System.out.println("Enter the Location");
                    String location = scan.nextLine();
                    System.out.println("Enter the rating");
                    int rating = scan.nextInt();
                    System.out.println("Enter the price per room");
                    int price = scan.nextInt();
                    hotelsArrayList.add(new Hotels(hotelName, room, location, rating, price));
                    System.out.println(hotelsArrayList);

                    break;
                }
                case 2: {
                    Comparator<Hotels> hotelsComparator = new Comparator<Hotels>() {
                        @Override
                        public int compare(Hotels hotels, Hotels t1) {
                          return hotels.getName().compareTo(t1.getName());
                        }
                    };
                    Collections.sort(hotelsArrayList, hotelsComparator);
                    System.out.println(hotelsArrayList);
                    break;
                }
                case 3:{
                    System.out.println(userArrayList);
                    break;
                }
                case 4:{
                    Comparator<Hotels> hotelsComparator = new Comparator<Hotels>() {
                        @Override
                        public int compare(Hotels hotels, Hotels t1) {
                            if(hotels.getRating()<t1.getRating()){
                                return 1;
                            }else{
                                return -1;
                            }
                        }
                    };
                    Collections.sort(hotelsArrayList,hotelsComparator);
                    System.out.println(hotelsArrayList);

                    break;
                }
                case 5:{
                    Comparator<Hotels> hotelsComparator = new Comparator<Hotels>() {
                        @Override
                        public int compare(Hotels hotels, Hotels t1) {
                            if(hotels.getRoom()<t1.getRoom()){
                                return 1;
                            }else{
                                return -1;
                            }
                        }
                    };
                    Collections.sort(hotelsArrayList,hotelsComparator);
                    System.out.println(hotelsArrayList);
                    break;
                }
                case 6:{
                    Comparator<Hotels> hotelsComparator = new Comparator<Hotels>() {
                        @Override
                        public int compare(Hotels hotels, Hotels t1) {
                            return hotels.getLocation().compareTo(t1.getLocation());
                        }
                    };
                    Collections.sort(hotelsArrayList, hotelsComparator);
                    System.out.println(hotelsArrayList);
                    break;
                }
                case 7:{
                    userId++;
                    int price=0;
                    System.out.println("Enter the Your name");
                    String userName = scan.nextLine();
                    System.out.println("Enter the hotel name");
                    String hName = scan.nextLine();
                    int n = hotelsArrayList.size();
                    for(int i=0;i< n;i++){
                        Hotels hotel = hotelsArrayList.get(i);
                        if(hotel.getName().equals(hName)){
                           int room =  hotel.getRoom();
                           price = hotel.getPrice();
                           room--;
                           hotel.setRoom(room);
                           break;
                        }
                    }
                    userArrayList.add(new User(userName,hName,userId,price));
                    System.out.println("Booked Successfully");
                    break;
                }

            }
        }
    }
}
