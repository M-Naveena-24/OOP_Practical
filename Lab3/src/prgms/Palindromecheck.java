package prgms;
import java.util.Scanner;
public class Palindromecheck {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check if it is a palindrome or not: ");
		String originalstr = sc.nextLine();
		originalstr = originalstr.toLowerCase();
		StringBuilder reversedstr = new StringBuilder(originalstr);
		reversedstr.reverse();
		if(originalstr.equals(reversedstr.toString())) {
			System.out.println("The given string '" + originalstr + "' is a palindrome. ");
		}else {
			System.out.println("The given string '" + originalstr + "' is not a palindrome. ");
		}sc.close();	
	}
}