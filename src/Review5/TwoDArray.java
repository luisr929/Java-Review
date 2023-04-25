package Review5;

public class TwoDArray {

    public static void main(String[] args) {

        String[][] cars = {
                {
                        "ford", "lincoln", "dodge"
                },
                {
                        "bwm", "audi", "mercedes", "VW", "fiat"
                },
                {
                        "honda", "Toyota", "subaru", "nissan"
                }
        };
        for (String[] car : cars) {
            for (String s : car) {
                System.out.print(s+" ");


                
            }
            System.out.println();
            
        }
    }
}