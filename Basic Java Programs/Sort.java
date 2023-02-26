public class Sort {
    
    /* Bubble Sort
     *
     * Bubble sort algorithm is known as the simplest sorting algorithm.
     *
     * In bubble sort algorithm, array is traversed from first element to last element. 
     * Here, current element is compared with the next element. 
     * If current element is greater than the next element, it is swapped.
     *
     */
    public static void bubbleSort(int[] arr) {  
        int n = arr.length;  
        int temp = 0;  
        for(int i=0; i < n; i++) {  
            for(int j=1; j < (n-i); j++) {  
                if(arr[j-1] > arr[j]) {  
                    //swap elements  
                    temp = arr[j-1];  
                    arr[j-1] = arr[j];  
                    arr[j] = temp;  
                }  
            }  
        }  
    }  

    /* Selection sort
     *
     * In selection sort algorithm, we search for the lowest element and arrange it to the proper location. 
     * We swap the current element with the next lowest number.
     * 
     * The selection sort algorithm works in a very simple way. It maintains two subarray for the given array.
     *
     * The subarray is already sorted. And the second subarray is unsorted.
     * With every iteration of selection sort, an element is picked from the unsorted subarray and moved to the sorted subarray.
     * 
     */
    public static void selectionSort(int[] arr) {  
        for (int i = 0; i < arr.length - 1; i++) {  
            int index = i;  
            for (int j = i + 1; j < arr.length; j++) {  
                if (arr[j] < arr[index]) {  
                    index = j;//searching for lowest index  
                }  
            }  
            int smallerNumber = arr[index];   
            arr[index] = arr[i];  
            arr[i] = smallerNumber;  
        }  
    }  

    /* Insertion sort
     *
     * We can create a java program to sort array elements using insertion sort. 
     * Insertion is good for small elements only because it requires more time for sorting large number of elements.
     * 
     */
    public static void insertionSort(int array[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                i--;  
            }  
            array[i+1] = key;  
        }  
    }  

    public static void main(String[] args) {  
        int arr[] ={3,60,35,2,45,320,5};  
            
        System.out.println("Array before sorting : ");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  
        System.out.println();  
            
        bubbleSort(arr);
        //selectionSort(arr);
        //insertionSort(arr);
            
        System.out.println("Array after sorting : ");  
        for(int i=0; i < arr.length; i++){  
                System.out.print(arr[i] + " ");  
        }  

    }  
}