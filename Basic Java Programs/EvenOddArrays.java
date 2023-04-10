import java.util.Arrays;

public class EvenOddArrays{
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] evenNumbers = Arrays.stream(numbers).filter(n -> n % 2 == 0).toArray();
        int[] oddNumbers = Arrays.stream(numbers).filter(n -> n % 2 == 1).toArray();

        System.out.println("Even numbers: " + Arrays.toString(evenNumbers));
        System.out.println("Odd numbers: " + Arrays.toString(oddNumbers));
    } 
}

