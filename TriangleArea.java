import java.util.Scanner;

class TriangleArea {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        double s1, s2, s3, sp, area;

        System.out.print("Enter the first side: ");
        s1 = sc.nextDouble();
        while(s1 <= 0) {
            System.out.println("Invalid input. Side 1 must be positive. ");
            System.out.print("Enter side one again: ");
            s1 = sc.nextDouble();
        }

        System.out.print("Enter the second side : ");
        s2 = sc.nextDouble();
        while(s2 <= 0) {
            System.out.println("Invalid input. Side 2 must be positive. ");
            System.out.print("Enter side two again: ");
            s2 = sc.nextDouble();
        }

        System.out.print("Enter the third side: ");
        s3 = sc.nextDouble();
        while(s3 <= 0) {
            System.out.println("Invalid input. Side 3 must be positive. ");
            System.out.print("Enter side third again: ");
            s3 = sc.nextDouble();
        }

        if(s1 + s2 > s3 && s1 + s3 > s2 && s2 + s3 > s1) {
           sp = ( s1 + s2 + s3)/2;
           area = Math.sqrt(sp*(sp-s1)*(sp-s2)*(sp-s3));
           System.out.println(" The area of triangle = "+area);
        } else {
        System.out.println("The triangle is invalid. Sum of any two side must be greater than the third. ");
        }
    }
}
