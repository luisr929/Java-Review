package Review5;

public class TwoDArrayExamples {

    public static void main(String[] args) {

        int[][] numbers = new int[3][4];
        numbers[0][0] = 1;
        numbers[0][1] = 2;
        numbers[0][2] = 3;
        numbers[0][3] = 4;

        numbers[1][0] = 10;
        numbers[1][1] = 20;
        numbers[1][2] = 30;
        numbers[1][3] = 40;

        numbers[2][0] = 100;
        numbers[2][1] = 200;
        numbers[2][2] = 300;
        numbers[2][3] = 400;

        System.out.println(numbers.length);
        System.out.println(numbers[0].length);

        System.out.println();

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                int num = numbers[i][j];

                if (num % 3 == 0) {
                    System.out.println(num);

                }

            }
            System.out.println();


        }
    }
}
