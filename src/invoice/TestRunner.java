package invoice;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class TestRunner {
    static ArrayList<Customer> customerArrayList = new ArrayList<>();
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Customer customer;
        Invoice invoice = new Invoice();
        //ArrayList<String> invoiceArrayList = new ArrayList<>();
        int cus_id=0;
        int invoices=0;
        HashMapHandler hashMapObj = new HashMapHandler();
        while (true){
            System.out.println("________Invoice System_________");
            System.out.println("Enter your option\n1.Add Customer\n" +
                    "2.Add invoice to the customer\n3.Add item to invoice\n4.List customers\n5.List invoice\n6.List invoice of a customer" +
                    "\n7.Display an invoice");
            int option  = scan.nextInt();

            switch (option){
                case 1:{
                   customer = new Customer();

                    cus_id++;
                    scan.nextLine();
                    System.out.println("Enter the customer name");
                    String name = scan.nextLine();
                    System.out.println("Enter the address");
                    String address = scan.nextLine();
                    System.out.println("Enter the mobile num");
                    int mobile = scan.nextInt();
                    customer.setId(cus_id);
                    customer.setName(name);
                    customer.setAddress(address);
                    customer.setMobile(mobile);
                    customerArrayList.add(customer);
                    System.out.println("Your id is "+customer.getId());
                    System.out.println(customerArrayList);
                    break;
                }
                case 2:{
                    ArrayList<String> itemArrayList = new ArrayList<>();

                    String[] item = new String[]{"HeadPhone","Speaker","Sd-Card","Battery"};
                    int[] price = new int[]{500,100,300,700};


                    invoices++;
                    int check=1;
                    System.out.println("Enter customer id");
                    int id = scan.nextInt();
                    while (check==1) {
                        System.out.println("Select the item\n1.HeadPhone-500\n2.Speaker-100" +
                                "\n3.Sd card-300\n4.Battery-700");
                        int choice = scan.nextInt();
                        String items = item[choice-1];
                        int prices = price[choice-1];
                        itemArrayList.add(items+prices);
                        System.out.println("Do u want to add more\n1.Yes\n2.No");
                        check = scan.nextInt();
                    }
                    invoice.setInvoice(invoices);
                    invoice.setCustomerId(id);
                    hashMapObj.getFromInvoice(id,invoices,itemArrayList);
                    HashMap<Integer,ArrayList<String>> map = hashMapObj.returnInvoice();
                    HashMap<Integer, HashMap<Integer, ArrayList<String>>> outerHashMap = hashMapObj.returnOuterHashMap();
                    System.out.println(map);
                    System.out.println(outerHashMap);
                    break;
                }
                case 3:{
                    System.out.println("Enter the invoice number");
                    int invoiceNumber = scan.nextInt();
                    HashMap<Integer,ArrayList<String>> innerMap = hashMapObj.returnInvoice();
                    ArrayList<String> list = innerMap.get(invoiceNumber);
                    System.out.println(list);
                    String[] item = new String[]{"HeadPhone","Speaker","Sd-Card","Battery"};
                    int[] price = new int[]{500,100,300,700};
                    int check=1;
                    while (check==1) {
                        System.out.println("Select the item\n1.HeadPhone-500\n2.Speaker-100" +
                                "\n3.Sd card-300\n4.Battery-700");
                        int choice = scan.nextInt();
                        String items = item[choice-1];
                        int prices = price[choice-1];
                        list.add(items+prices);
                        System.out.println("Do u want to add more\n1.Yes\n2.No");
                        check = scan.nextInt();
                    }
                    System.out.println(list);

                    break;
                }
                case 4:{
                    for (int i=0;i<customerArrayList.size();i++){
                        customer = customerArrayList.get(i);
                        System.out.println(customer.getId()+" "+customer.getName());
                    }
                    break;
                }
                case 5:{
                    HashMap<Integer,ArrayList<String>> map = hashMapObj.returnInvoice();
                    System.out.println(map);
                    System.out.println("The invoices are");
                    Iterator<Integer> itr = map.keySet().iterator();
                    while (itr.hasNext()) {
                        System.out.println(itr.next());
                    }
                    System.out.println("The invoices are");
                    for (Integer key: map.keySet()) {
                        System.out.println(key);
                    }
                    break;
                }
                case 6:{
                    System.out.println("Enter the id to see the invoices");
                    int idForInvoice = scan.nextInt();
                    HashMap<Integer, HashMap<Integer, ArrayList<String>>> outerHashMap = hashMapObj.returnOuterHashMap();
                    System.out.println(outerHashMap.get(idForInvoice));
                    break;
                }
                case 7:{
                    System.out.println("Enter the invoice to see the items");
                    int idForItems = scan.nextInt();
                    HashMap<Integer,ArrayList<String>> map = hashMapObj.returnInvoice();
                    System.out.println(map.get(idForItems));
                    break;
                }
            }
        }
    }
}
