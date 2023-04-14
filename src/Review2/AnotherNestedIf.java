package Review2;

public class AnotherNestedIf {

    public static void main(String[] args) {

        boolean vaccine = true;
        int dose = 1;

        if (vaccine) {
            if (dose == 1) {
                System.out.println("you need 2 to be fully vaxed");
            } else if (dose == 2) {
                System.out.println("you are fully vaxed");
            } else if (dose == 3) {
                System.out.println("you are fully vaxed and boosted");
            }
        }else{
            System.out.println("go get vaxed dirty");
        }
    }
}
