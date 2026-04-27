import java.util.Scanner;

public class PowerCalculation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter voltage : ");
        double voltage = sc.nextDouble();

        System.out.print("Enter current : ");
        double current = sc.nextDouble();

        double power = voltage * current;
        System.out.println("Power = " + power + "watts" );
       }
}
