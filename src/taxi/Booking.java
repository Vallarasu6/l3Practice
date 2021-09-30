package taxi;

import java.util.ArrayList;

public class Booking {
    ArrayList<Taxi> bookingDetails = new ArrayList<>();
    ArrayList<Taxi> taxiArrayList = new ArrayList<>();
   Booking(){
       for(int i=0;i<4;i++){
           Taxi taxi1 = new Taxi();
           taxi1.setTaxiId(i+1);
           taxiArrayList.add(taxi1);

       }

   }
    char[] place = new char[]{'a','b','c','d','e'};
    int[] placeNum = new int[]{1,2,3,4,5};
    public void book(int customerId, char pickup, char drop, int time) throws InterruptedException {
        int availability=0;
        for(int i=0;i<4;i++){
            Taxi taxi = taxiArrayList.get(i);
            if((pickup== taxi.getStand() && time>=taxi.getFreeTime())){

//            if(taxi.getState()==0 && time>=taxi.getFreeTime()){
                availability=1;
                int flag=0,count=0;
                for(int j=0;j<place.length;j++){
                    if(place[j]==pickup || flag==1){
                        flag=1;
                        count++;
                    }if(place[j]==drop){
                        count--;
                        break;
                    }
                }
                int freeTime = time+count;
                int distance = count*15;
                int payment = ((distance-5)*10)+100;
                //taxi.setState(1);
                taxi.setTime(time);
                taxi.setDrop(drop);
                taxi.setPickup(pickup);
                taxi.setCustomerId(customerId);
                taxi.setPayment(payment);
                taxi.setFreeTime(freeTime);
                taxi.setStand(drop);
                bookingDetails.add(taxi);

                System.out.println("Taxi Allotted and taxi Number is "+taxi.getTaxiId());

                break;
            }

        }
        if(availability==0){
            System.out.println("Sorrry!! No taxi available");
        }
        System.out.println(taxiArrayList);
        System.out.println(bookingDetails);


    }

}
