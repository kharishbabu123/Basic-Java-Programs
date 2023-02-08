import java.util.Scanner;

public class PrimeNumber { 
    public static void main(String[] args) {
        int flag = 0;
        Scanner sc =  new Scanner(System.in);
        System.out.println("Enter an integer number : ");
        int number =  sc.nextInt();

        for(int i=2; i<=(number/2); i++)
        {
            if(number % i ==0)
            {
                flag=1;
                break;
            }
        } 
        sc.close();  
        if(flag==0) System.out.println(number+" is a prime number.");
        else System.out.println(number+" is not a prime number.");
    }
}