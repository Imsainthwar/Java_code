import java.util.Scanner;

public abstract class _19rectangle {
{}    public static void main (String[] args){
    Scanner input = new Scanner (System.in);
    System.out.println("Welcome to area calculator");
    System.out.println("Please enter your base in cms:");
    double base = input.nextDouble();
    System.out.println("Please enter your Height in cms");
    double height = input.nextDouble();

    double area = 0.5 * base * height;
    double Area = (base* height)/2;
    System.out.println("The area of rectangle is " + area);
        System.out.println("The  area of rectangle is " + Area);
input.close();
}
}
