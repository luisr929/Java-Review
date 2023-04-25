package Review4;

import java.util.Scanner;

public class ArrayScanner {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("how many integers you want to store?");
        int elements= input.nextInt();
        int [] numbers=new int[elements];
        System.out.println("");
        for (int i = 0; i < elements ; i++) {
            System.out.println("please enter "+(i+1)+" "+"element");
            numbers[i]=input.nextInt();
            int sum=0;



        }

    }
}
