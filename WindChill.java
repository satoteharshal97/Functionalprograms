import java.util.Scanner;

public class WindChill {
    public static final int TEMPERATURE_CONSTANT = 50;
    public static final int SPEED_CONSTANT_1 = 120;
    public static final int SPEED_CONSTANT_2 = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter value for wind speed: ");
        double windSpeed = sc.nextDouble();
        System.out.println("Enter value for temperature: ");
        double temperature = sc.nextDouble();

        if(temperature < TEMPERATURE_CONSTANT &&  SPEED_CONSTANT_1 > windSpeed && windSpeed > SPEED_CONSTANT_2) {
            double windChill = 35.74 + 0.6215 * temperature + ((0.4275 * temperature) - 35.75) * (Math.pow(windSpeed, 0.16));
            System.out.println("Value of wind chill: " + windChill);
        }
    }


}
