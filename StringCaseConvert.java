import java.util.Scanner;

public class StringCaseConvert {
    public static void main(String[] args) {
        System.out.println("Enter a string: ");
        Scanner sc =  new Scanner(System.in);
        String str = sc.nextLine();
        System.out.println("String in upper case: "+str.toUpperCase());
        System.out.println("String in lower case: "+str.toLowerCase());
        System.out.println("String with vowels in upper case: "+str.toLowerCase().replace("a", "A").replace("e", "E").replace("i", "I").replace("o", "O").replace("u", "U"));
        sc.close();
    }
}