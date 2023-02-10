import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();
        String reverse = new StringBuilder(input).reverse().toString();
        if (input.equals(reverse)) {
            System.out.println("The input "+input+" is a palindrome.");
        } 
        else {
            System.out.println("The input "+input+" is not a palindrome.");
        }
        sc.close();
    }
}
