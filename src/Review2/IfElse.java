package Review2;

public class IfElse {
    public static void main(String[] args) {
        int age = 18;

        if (age >= 18) {
            System.out.println("you can get DL");
        } else {
            System.out.println("you are too young");
        }


        String expected="best Sellers";
        if (expected.equals("best sellers")){
            System.out.println("test case passed");
        }else{
            System.out.println("test case failed");
        }
    }
}
