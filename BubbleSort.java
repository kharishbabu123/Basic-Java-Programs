import java.util.Arrays;
import java.util.Scanner;

public class BubbleSort {
    public static void main(String[] args) {
        System.out.println("Enter number of elements: ");
        Scanner input =  new Scanner(System.in);
        int n = input.nextInt();
        int[] arr = new int[n];
 
        System.out.println("Enter integers for sorting: ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();
        }
	    
        Arrays.sort(arr);

        // -----Traditional method-----
        //
        // int temp;
        // for (int i = 0 ; i < n-1 ; i++) {
	    //     for (int j = 0 ; j < n-i-1; j++) {
	    //         if (arr[j] > arr[j+1]) {
        //             temp = arr[j];
        //             arr[j] = arr[j+1];
        //             arr[j+1] = temp;
        //         }
        //     }
	    // }
	    System.out.println("Sorted list in ascending order: ");
 
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        } 
        input.close();
    }
}