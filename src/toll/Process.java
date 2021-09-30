package toll;

import java.util.ArrayList;

public class Process {
    ArrayList<Toll> tollArrayList = new ArrayList<>();

    int arr[] = new int[]{1,2,3,4,5};
    public int process(Vehicle vehicle){

        char start = vehicle.getStart();
        char destiny = vehicle.getDestiny();
        int payment = vehicle.getPayment();
        int vehicleNum = vehicle.getVehicleNum();
        int temp = Integer.parseInt(String.valueOf(start));
        int temp1 = Integer.parseInt(String.valueOf(destiny));
        int count=0;
        int count1=0;
        ArrayList<Integer> toll = new ArrayList<>();
        ArrayList<Integer> toll1 = new ArrayList<>();
        for(int i=temp;i<=temp1;i++){
           toll.add(i);
                count++;

        }
        int sum = count*payment;
        for(int i=temp;i>=0;i--){
            toll1.add(i);
                count1++;
        }
        for(int i=temp1;i<arr.length-1;i++){
            toll1.add(i);
                count1++;
        }

        int sum1 = count1*payment;
        if(sum1<sum){
            for(int i=0;i< toll1.size();i++){
                Toll tollObj = new Toll();
                tollObj.setToll(toll1.get(i));
                tollObj.setAmount(payment);
                tollObj.setvNum(vehicleNum);
                tollArrayList.add(tollObj);

            }
            return sum1;
        }else{
            for(int i=0;i< toll.size();i++){
                Toll tollObj = new Toll();
                tollObj.setToll(toll.get(i));
                tollObj.setAmount(payment);
                tollObj.setvNum(vehicleNum);
                tollArrayList.add(tollObj);
            }
            return sum;
        }

    }
    public void displayToll(){
        System.out.println(tollArrayList);
    }
}
