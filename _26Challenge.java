import java.util.Scanner;

public class _26Challenge {
    public static void main (String[] args) {
        Scanner input = new Scanner (System.in);
      System.out.println("Welcome to number Checker \n");
      System.out.print("Please enter your numnber");
      int num = input.nextInt();

      if( num  > 0){
        System.out.println("your number is Positive ");
      } else if ( num == 0){
        System.out.println("your number is Zero");
      } else{
        System.out.println("Your Number is negative");
      }
    input.close();
    }
}
