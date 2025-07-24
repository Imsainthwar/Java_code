import java.util.Scanner;

public class _20Interest {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to Simple interest Calculator \n");
        System.out.println("Please enter your principle amount RS");
        int principle = input.nextInt();
        System.out.println("Now tell me your rate of interest: ");
        float rate  =input.nextFloat();
        System.out.println("Now , tell me how many year for you borrowed money");
        float time = input.nextFloat();

        float interest = (principle * rate * time ) /100;
 
        System.out.println(" Simple enter amount " + interest);

input.close();
    }
}
