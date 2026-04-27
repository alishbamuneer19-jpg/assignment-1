import java.util.Scanner;
public class Trapezoid {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double x, y, z;

        System.out.print("Enter first parallel side: ");
        x = sc.nextDouble();
        if (x <= 0) {
            System.out.println("Invalid input. Side must be positive. ");
        } else {

            System.out.print("Enter second parallel side: ");
            y = sc.nextDouble();
            if (y <= 0) {
                System.out.println("Invalid input. Side must be positive. ");
        
            } else {
                System.out.print("Enter height: ");
                z = sc.nextDouble();
                if (z <= 0) {
                    System.out.println("Invalid input. Height must be positive. ");
                } else {

                    double area = (x + y) * z / 2;
                    System.out.println("Area of Trapezoid = " + area); 
                }            
            }       
        }
    }
}
