import java.util.Scanner;

public class _17Floating {
    public static void main (String[] args){

    Scanner input = new Scanner(System.in);
    System.out.println("We are doing Float Multiplication\n");
    System.out.println("Please enter the first decimal number");
    double first = input.nextDouble();
    System.out.println(" Please enter the second number");
    double second = input.nextDouble();

    double mul = first * second ;
    System.out.println( mul);

    input.close();
    }
}
