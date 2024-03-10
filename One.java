import java.util.Scanner;

class One{
    public static void main(String[] args){
        int num1 = 0, num2 = 0, result;
        char operator;

        System.out.println("Enter two numbers for division\n(First number is dividend):");

        try {
            Scanner a = new Scanner(System.in);
            num1 = a.nextInt();

            Scanner c = new Scanner(System.in);
            num2 = c.nextInt();
        }catch (Exception e){
            System.out.println("Please enter valid number!");
        }

//        System.out.println(((Object)num1).getClass().getSimpleName());

        try {
            result = num1 / num2;
            System.out.println(num1 + " / " + num2 + " = "+result);
        }catch (ArithmeticException e){
            System.out.println("An error occurred: "+e);
        }
    }
}