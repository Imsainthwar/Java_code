import java.util.Scanner;

public class _21Compund {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to Compound interest Calculator \n");
        System.out.println("Please enter your principle amount RS");
        int principle = input.nextInt();
        System.out.println("Now tell me your rate of interest: ");
        float rate  =input.nextFloat();
        System.out.println("Now , tell me how many years for you borrowed money");
        float time = input.nextFloat();

        double Compound = principle * Math.pow((1 + rate / 100 ),  time);
        System.out.println("Your compound interest is: " + Compound);
        input.close();
    }
}

