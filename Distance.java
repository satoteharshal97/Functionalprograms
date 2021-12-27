import java.util.Scanner;

public class Distance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter X-cordinate: ");
        double cordinateX = sc.nextFloat();
        System.out.println("Enter Y-cordinate: ");
        double cordinateY = sc.nextFloat();
        //Calulating
        float Distance = (float)Math.pow((cordinateX * cordinateX + cordinateY * cordinateY), 0.5);
        System.out.println(Distance);
    }
}
