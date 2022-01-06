
import java.util.Scanner;

public class SimulateStopwatch {


    public static void main(String[] args) {
        double differenceStartStop;
        Scanner sc = new Scanner(System.in);

        // to start the timer

        System.out.println("Now Start the stop watch:");
        double start = sc.nextDouble();
        //To get current time in milliseconds we use
        // java.lang.System.currentTimeMillis() method returns the current time in milliseconds
        start = System.currentTimeMillis();

        // to stop the timer

        System.out.println("Now Stop Watch will be stopped:");
        double stop = sc.nextDouble();
        stop = System.currentTimeMillis();

        if (stop == 0) {
            double now = System.currentTimeMillis();
            differenceStartStop = now - start;
        } else {
            differenceStartStop = stop - start;
        }
        // Here we get time in microseconds
        System.out.println("Elapsed time is: " + differenceStartStop + "microseconds");
        // Here we get time in milliseconds
        double millliseconds = differenceStartStop % 1000;
        System.out.println("Elapsed time is: " + millliseconds + "milliseconds");
        differenceStartStop = (differenceStartStop - millliseconds) / 1000;
        // Here we get time in seconds
        double seconds = differenceStartStop % 60;
        System.out.println("Elapsed time is: " + seconds + "seconds");
        differenceStartStop = (differenceStartStop - seconds) / 60;
        // Here we get time in minutes
        double minutes = differenceStartStop % 60;
        System.out.println("Elapsed time is: " + minutes + "minutes");
    }
}