import java.util.Scanner;

public class 2DArrays{

    static void getArray() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rowArray = sc.nextInt();
        System.out.println("Enter the number of coloumns: ");
        int columArray = sc.nextInt();

        int [][] newArray = new int[rowArray][columArray];
        int numberOfElements = rowArray * columArray;
        System.out.println("Number of Elements to be Entered: " + numberOfElements);

        for (int i = 0; i < rowArray; i++) {
            for (int j = 0; j < columArray; j++) {
                newArray[i][j] = sc.nextInt();
            }
        }
        System.out.println("You have entered the following array : ");

        for (int i = 0; i < rowArray; i++) {
            for (int j = 0; j < columArray; j++) {
                System.out.print(newArray[i][j] + " ");
            }
            System.out.println();
        }
    }
        public static void main (String[]args){
        getArray();
        }
}