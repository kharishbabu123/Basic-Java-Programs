/* Java program to check whether a number is armstrong or not */

import java.util.Scanner;
 
public class Armstrong {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int number, sum=0, rem=0, tempNumber;
        System.out.println("Enter an integer number: ");
        number = sc.nextInt();
        tempNumber=number;
        while(tempNumber!=0)
        {
            rem=tempNumber%10;
            sum=sum + (rem*rem*rem);
            tempNumber/=10;
        }  
// checking number is armstrong or not
        if(sum==number) System.out.println(number+" is an Armstrong number.");
        else System.out.println(number+" is not an Armstrong number.");
        sc.close();            
    }
}


