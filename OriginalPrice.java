import java.util.Scanner;

public class OrignalPrice {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter discounted price: ");
        double discounted = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();

        double orignal = discounted / (1 - discount / 100);
      
        System.out.println ("Orignal Price = " + orignal);
    }  
}
