import java.util.Scanner;

public class _24Relational {
    
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to Driving License Portal");
        System.out.println("Please enter your age ");
        int age = input.nextInt();
        if (age >=18){
            System.out.println("You are eligible to DL ");
        }
        else {
            System.out.println("Sorry,you are not eligible for DL ");
        }
        input.close();
    }

}

