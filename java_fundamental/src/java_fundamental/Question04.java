package java_fundamental;
import java.util.Scanner;
public class Question04 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer number: ");
        int n = sc.nextInt();
        if(n > 0) {
        	System.out.println("The number is Positive.");
        }else if(n < 0) {
        	System.out.println("The number is Negative.");
        }else {
        	System.out.println("The number is Zero.");
        }
        System.out.println("Enter first non-negative number.");
        int n1 = sc.nextInt();
        System.out.println("Enter second non- negative number.");
        int n2 = sc.nextInt();
        if(n1 < 0 || n < 0) {
        	System.out.println("Enter Non-negative Numbers only");
        }else {
        	boolean sameLastDigit = (n1 % 10) == (n2 % 10);
        	System.out.println("Same last digit: " + sameLastDigit);
        }
        sc.close();
	}

}
