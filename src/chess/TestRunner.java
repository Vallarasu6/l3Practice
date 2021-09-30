package chess;
import java.util.Scanner;

public class TestRunner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of players");
        int num = scan.nextInt();
        scan.nextLine();
        double marks[] = new double[num];
        if(num%2!=0)
        marks[num-1] = 1;
        String name[] = new String[num];
        for(int i=0;i<num;i++){
            name[i] = scan.nextLine();
        }

        for(int i=0;i<num;i++){
            for(int j=i+1;j<num;j++){
                double a = (1+( Math.random()*10));
                double b = (1+( Math.random()*10));
                if(a>b){
                    marks[i] = marks[i]+1;
                    System.out.println("The winner is "+name[i]);
                    System.out.println(name[i]+" score is "+marks[i]);
                    System.out.println(name[j]+" score is "+marks[j]);

                }else if(b>a){
                    marks[j] = marks[j]+1;
                    System.out.println("The winner is "+name[j]);
                    System.out.println(name[i]+" score is "+marks[i]);
                    System.out.println(name[j]+" score is "+marks[j]);
                }else if(a==b){
                    marks[i] = marks[i]+0.5;
                    marks[j] = marks[j]+0.5;
                    System.out.println("The match is tie");
                    System.out.println(name[i]+" score is "+marks[i]);
                    System.out.println(name[j]+" score is "+marks[j]);
                }

            }
        }
        for(int i=0;i<num;i++){
            for(int j=0;j<num;j++){
                if(marks[i]>marks[j]) {
                    double temp = marks[i];
                    marks[i] = marks[j];
                    marks[j] = temp;
                    String temp1 = name[i];
                    name[i] = name[j];
                    name[j] = temp1;

                }
            }
        }
        System.out.println("The tournament winner is "+name[0]);

    }
}
