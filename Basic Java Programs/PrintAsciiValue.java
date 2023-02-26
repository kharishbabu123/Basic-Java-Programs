import java.util.Scanner;

public class PrintAsciiValue {
    public static void main(String[] String) {  
        Scanner input = new Scanner(System.in);
        System.out.println("\nOptions for printing ASCII value of\n 1. Specific character\n 2. All characters\n 3. A to Z\n");
        System.out.print("Enter your input : ");
        int option = input.nextInt();
        System.out.print("\n");
        switch (option) {
            case 1 : 
                AsciiValueofChar();
                break;
            case 2 :
                AsciiValueOfAllChracters();
                break;
            case 3 :
                AsciiValueAtoZ();
                break;
            default : 
                System.out.println("Invalid option");
                break;
        }    
        input.close(); 
    }  

    //Method to print Ascii value of a specific character
    public static void AsciiValueofChar() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a character: ");  
        int ch = sc.next().charAt(0);
        System.out.println(" The ASCII value of a is: "+ch);  
        sc.close();
    }

    //Method to print Ascii Value Of All Characters
    public static void AsciiValueOfAllChracters() {
        for(int i = 0; i <= 255; i++) {  
            System.out.println(" The ASCII value of " + (char)i + "  =  " + i);  
        }
    }

    //Method to print Ascii Value AtoZ  
    public static void AsciiValueAtoZ() {

        //for upper case
        for(int i = 65; i <= 90; i++) {  
            System.out.println(" The ASCII value of " + (char)i + "  =  " + i);  
        }     
        //for lower case
        for(int i = 97; i <= 122; i++) {  
            System.out.println(" The ASCII value of " + (char)i + "  =  " + i);  
        }
    }
}  
