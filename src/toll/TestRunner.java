package toll;

import java.util.ArrayList;
import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        Vehicle vehicle = new Vehicle();
        Process p = new Process();
        ArrayList<Vehicle> vehicleArrayList = new ArrayList<>();
        while (true) {
            System.out.println("Enter your choice\n1.Toll payment\n2.vehicle details\n3.Toll Data");
            int option = scan.nextInt();
            switch (option) {
                case 1: {
                    while (true) {
                        System.out.println("Enter your choice\n1.Car\n2.Bus\n3.Truck\n4.van");
                        int choice = scan.nextInt();

                        int payment[] = new int[]{150, 250, 350, 450};
                        String vehicleName[] = new String[]{"car", "bus", "truck", "van"};
                        System.out.println("Enter you vehicle num");
                        int vehicleNum = scan.nextInt();
                        System.out.println("Enter you start");
                        char start = scan.next().charAt(0);
                        System.out.println("Enter you destination");
                        char destiny = scan.next().charAt(0);
                        vehicle.setDestiny(destiny);
                        vehicle.setVehicleNum(vehicleNum);
                        vehicle.setPayment(payment[choice - 1]);
                        vehicle.setStart(start);
                        vehicle.setDestiny(destiny);
                        vehicle.setVehicleName(vehicleName[choice - 1]);
                        vehicleArrayList.add(vehicle);
                        int amount = p.process(vehicle);
                        System.out.println("The normal amount is " + amount);
                        int newAmount = amount * 20 / 100;
                        int amount1 = amount - newAmount;
                        System.out.println("The discount amount is " + amount1);
                        break;
                    }

                }
                case 2:{
                    System.out.println(vehicleArrayList);
                    break;
                }
                case 3:{
                    p.displayToll();

                    break;
                }
                default:
                    throw new IllegalStateException("Unexpected value: " + option);
            }
        }
    }
}