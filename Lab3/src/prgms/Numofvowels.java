package prgms;
import java.util.Scanner;
public class Numofvowels {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a string to check the number of vowels present in it: ");
		String temp = sc.nextLine();
		int count = 0;
		temp = temp.toLowerCase();
		for(int i = 0; i < temp.length(); i++) {
			char ch = temp.charAt(i);
			if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				count++;
			}
		}System.out.println("The name of vowels present in the string are: " + count);
		sc.close();
	}
}
