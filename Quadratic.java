
import java.util.Scanner;

public class Quadratic {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first element(a)of Quadratic equation: ");
        float firstElement = sc.nextFloat();
        System.out.println("Enter second element(b) of Quadratic equation: ");
        float secondElement = sc.nextFloat();
        System.out.println("Enter third element(c) of Quadratic equation: ");
        float thirdElement = sc.nextFloat();

        float delta = (secondElement * secondElement) - (4 * firstElement * thirdElement);
        float firstRoot = (float) (-(secondElement) + (Math.sqrt(delta)))/ (2 * firstElement);
        float secondRoot = (float) (-(secondElement) - (Math.sqrt(delta)))/ (2 * firstElement);
        System.out.println(firstRoot);
        System.out.println(secondRoot);
    }
}
