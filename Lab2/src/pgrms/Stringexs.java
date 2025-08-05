package pgrms;

import java.util.Scanner;

public class Stringexs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String original, word;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a new string: ");
		original = sc.nextLine();
		System.out.println("Character at a particular index is: " + original.charAt(2));
		System.out.println("Length of the character is: " + original.length());
		System.out.println("String in uppercase is: " + original.toUpperCase());
		System.out.println("String in lowercase is: " + original.toLowerCase());
		System.out.println("Substring is: " + original.substring(1,8));
		System.out.println("Now, enter a word to check if it is present in the original string: ");
		word = sc.nextLine();
		if(original.contains(word)) {
			System.out.println("The given word '" + word + "' is present in the string");
		}else {
			System.out.println("The given word '" + word + "' is not present in the string");
		}
		sc.close();
	}
}
