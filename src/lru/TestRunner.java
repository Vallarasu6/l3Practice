package lru;

import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        Logicayer ll = new Logicayer();
        while (true){
            System.out.println("Enter your choice\n1.Put\n2.Get");
            int choice = scan.nextInt();
            switch (choice){
                case 1:{
                    System.out.println("Enter the key");
                    int key = scan.nextInt();
                    System.out.println("Enter the value");
                    int value = scan.nextInt();
                    ll.put(key,value);
                    break;
                }
                case 2:{
                    System.out.println("Enter the key");
                    int key  = scan.nextInt();
                    ll.get(key);
                    break;
                }
            }
        }
    }
}
