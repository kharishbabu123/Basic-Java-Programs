import java.util.Scanner;

/*

Linear search is used to search a key element from multiple elements. 
Linear search is less used today because it is slower than binary search and hashing.

Algorithm:

Step 1: Traverse the array
Step 2: Match the key element with array element
Step 3: If key element is found, return the index position of the array element
Step 4: If key element is not found, return -1

*/

public class LinearSearch {
    public static void main(String args[]) { 
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = sc.nextInt();

        // Create the array
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = sc.nextInt();
        }

        // Get the target value from the user
        System.out.print("Enter the target value: ");
        int target = sc.nextInt();
  

        int index = search(arr, target);
        if (index == -1)
            System.out.println("Target not found in the array.");
        else 
            System.out.println("Target found at index " + index + ".");
        
        sc.close();
    
    }  

    public static int search(int[] arr, int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return i; // return the index of the found element
            }
        }
        return -1; // return -1 if target is not found in the array
    }
}
