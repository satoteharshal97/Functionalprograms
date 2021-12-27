
import java.util.Scanner;
public class SumOfThreeIntegers {
    static void addZero(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of integers: ");
        int N = sc.nextInt();

        int [] intArray = new int[N];
        for(int i = 0; i < N; i++){
                    intArray[i] = sc.nextInt();
                }

        for(int i = 0; i < N; i++ ){
           System.out.print(intArray[i] + " ");
        }
        System.out.println();

        int countOfTriplets = 0;
        for(int i = 0; i < N-2; i++){
            for(int j = i+1; j < N-1; j++ ){
                for(int k = j+1; k < N; k++){
                    if(intArray[i] + intArray[j] +intArray[k] == 0){
                        countOfTriplets++;
                        System.out.println("Triplet: " + intArray[i] + "," + intArray[j]
                        + "," + intArray[k]);
                    }
                }
            }
        }
        System.out.println("Number of triplets formed are: " + countOfTriplets);
    }
    public static void main(String[] args) {
    addZero();
    }
}
