package Review5;

public class task4 {
    public static void main(String[] args) {
        int odd = 0;
        int even = 0;
        int number;

        int[][] array = {
                {12, -12, 67, 56},
                {45, 2, 4},
                {56, 2},
                {67, 43, 11, 13}
        };
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {

                number = array[i][j];

                if (number % 2 == 0) {
                    even += number;


                }else {
                    odd+=number;
                }


            }

        }
        System.out.println(even);
        System.out.println(odd);

    }
}
