import java.util.Scanner;

public class DiscountedPrice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter orignal price: ");
        double orignal = sc.nextDouble();

        System.out.print("Enter discount percentage: ");
        double discount = sc.nextDouble();

        double discountedprice = orignal - (orignal * discount / 100);
      
        System.out.println ("Discounted Price = " + discountedprice);
    }
}
