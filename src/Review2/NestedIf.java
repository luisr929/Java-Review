package Review2;

public class NestedIf {

    public static void main(String[] args) {

        boolean driversL=true;
        boolean car=false;

        if (driversL){
            System.out.println("lets check if you have a car?");
            if (car){
                System.out.println("you can drive to work?");
            }else{
                System.out.println("you will need to take an uber");
            }
        }else {
            System.out.println("you should get a DL");
        }
    }
}
