package pgrms;

import java.util.Scanner;

public class Equaltoexs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1, str2;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first string: ");
		str1 = sc.nextLine();
		System.out.println("Enter second string: ");
		str2 = sc.nextLine();
		System.out.println(str1 + " equals " + str2 + " -> " + str1.equals(str2));
		System.out.println(str1 + " == " + str2 + " -> " + (str1 == str2));
		sc.close();
	}
}
