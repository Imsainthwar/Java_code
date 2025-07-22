import java.util.Scanner;

class _18perimetre {
    
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
    System.out.println("Welcom to perimetre calculator");
    System.out.println("Please enter all four sides in cm");
double a = input.nextDouble();
double b = input.nextDouble();
double c = input.nextDouble();
double d = input.nextDouble();

double perimetre = a + b + c + d ;

System.out.println(perimetre);



input.close();

    }
}
