import java.util.Scanner;

public class _7Sum {

    public static void main(String[] args) {

        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to our Calculator");
         System.out.println("Type First Number");
        int firstNum = input.nextInt();
         System.out.println("Type Second Number");
        int secondNum = input.nextInt();
        int sum = firstNum + secondNum;
        System.out.println("Sum of your number " + sum);
    }
}
