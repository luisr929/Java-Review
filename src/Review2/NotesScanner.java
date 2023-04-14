package Review2;

import java.util.Scanner;

public class NotesScanner {

    public static void main(String[] args) {
        int i = 10;
        Scanner key = new Scanner(System.in);

        System.out.println("please enter full sentence");
        String sentence = key.nextLine();
        System.out.println(sentence);

        System.out.println("please enter 1 word");
        String word = key.next();
        System.out.println("word that was captured = " + word);

        System.out.println("please enter interger value");
        int number = key.nextInt();
        System.out.println("entered number is = " + number);

        System.out.println("lets capture a decimal");
        double decimal = key.nextDouble();
        System.out.println("entered decimal is = " + decimal);

    }
}
