package library;

import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        LogicLayer ll = new LogicLayer();
        HashMapHandler map = new HashMapHandler();
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = scan.nextInt();
        scan.nextLine();
        int count=0;
        for(int i=0;i<n;i++){
            count++;
            System.out.println("Enter book name");
            String bookName = scan.nextLine();
            System.out.println("Enter the author");
            String authorName = scan.nextLine();
            System.out.println("Enter the subject");
            String subjectName = scan.nextLine();
            System.out.println("Enter the date");
            String date = scan.nextLine();
            Book book = new Book(count,bookName,authorName,subjectName,2,date);
            map.store(bookName,authorName,book);
        }
        System.out.println(map.returnMap());
        while (true){
            System.out.println("Enter the choice\n1.Search by Title\n2.Search by author\n3.Search by subject\n4.Search by publication");
            int choice = scan.nextInt();
            scan.nextLine();
            switch (choice){
                case 1:{
                    System.out.println("Enter the Title");
                    String bookName = scan.nextLine();
                    System.out.println("Do you want \n1.Yes\n2.No");
                    int option = scan.nextInt();
                    ll.searchName(bookName,option);
                    break;
                }
                case 2:{
                    System.out.println("Enter the author");
                    String author = scan.nextLine();
                    ll.searchAuthor(author);
                    break;
                }
            }

        }

    }
}
