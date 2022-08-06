import java.util.Scanner;
public class pr1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        circle c = new circle();

        System.out.println("Enter value of radius: ");
        double radius = sc.nextInt();
        circle c1 = new  circle(radius);

        System.out.println("Area is: ");
        System.out.format("%.2f",c1.getArea());
        System.out.println("\nPerimeter is: ");
        System.out.format("%.3f",c1.getPerimeter());
    }
}