import java.util.Scanner;

public class _25Logicaloperator {
    public static void main (String[] args)
    {
        Scanner input = new Scanner (System.in);
        System.out.println("Welcome to Ticket Discount Calculator");
        System.out.print("Please enter your age:");
       int age = input.nextInt();
       System.out.println("Are you a female? (true/false)");
       boolean isFemale = input.nextBoolean();

if (age < 5) {
    System.out.println("You got 75% disocunt");  
}else if (isFemale){
System.out.println("You got 50% discount");
    } else if ( age > 60 && !isFemale){
        System.out.println("You got 25% discount");
    } else {
        System.out.println( "You got no discount");
    }
input.close();
    }
    
}
