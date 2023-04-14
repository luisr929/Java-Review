package Review3;

public class SwitchStatement {
    public static void main(String[] args) {
        String color="RED";

        switch (color.toLowerCase()){

            case "red":
                System.out.println("stop");
                break;
            case "orange":
                System.out.println("yield");
                break;
            case "green":
                System.out.println("go");
                break;
            default:
                System.out.println("unknown");

        }

    }
}
