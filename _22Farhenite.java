import java.util.Scanner;

public class _22Farhenite {
    public static void main (String []args)
    {

    Scanner input = new Scanner (System.in);
    System.out.println("Welcome to Temperature Converter");
    System.out.print("Enter your temp in fahrenheit ");
    float fah = input.nextFloat();
    float Cel = (fah-32)*5/9;
    System.out.println("your temperature in celsius " + Cel + "C");
    input.close();
    }
    
  }

