package lab4;

import java.util.Scanner;
import java.lang.Integer;

public class IntWrapper {

    public static void main (String[] args){
    
     int int1;
     String string1;
     String string2;
     Scanner scan = new Scanner(System.in);
    
     System.out.print("Please enter an interger: ");
     int1 = scan.nextInt();
     System.out.print("Please enter a number: ");
     string1 = scan.next();
     System.out.print("Please enter another number: ");
     string2 = scan.next();
     
     System.out.println("Binary: " + Integer.toBinaryString(int1));
     System.out.println("Octal: " + Integer.toOctalString(int1));
     System.out.println("Hexadecimal: " + Integer.toHexString(int1));
     System.out.println("The maximum value for an integer is: " + Integer.MAX_VALUE);
     System.out.println("The minium value for an integer is: " + Integer.MIN_VALUE);
     System.out.println("The Sum of the two numbers are: " + (Integer.parseInt(string1) + Integer.parseInt(string2)));
    }
}
