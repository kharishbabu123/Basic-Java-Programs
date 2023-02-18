import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        int first = 0, second = 1, next;
        Scanner sc =  new Scanner(System.in);
	    System.out.print("Enter the number of terms : ");
        int n = sc.nextInt();
        System.out.println("First "+n+" terms of Fibonacci series are : ");
        for (int c = 0; c < n; c++) {
            if (c <= 1)
                next = c;
            else {
                next = first + second;
                first = second;
                second = next;
            }
	        System.out.println(next);
	    }
        sc.close();
    }
}