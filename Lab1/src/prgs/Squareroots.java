package prgs;
import java.util.Scanner;
import java.lang.Math;
public class Squareroots {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number ");
		n = sc.nextInt();
		double squareroot;;
		System.out.println("Enter a number ");
		for(int i = 1; i <= n; i++) {
			squareroot = Math.sqrt(i);
			System.out.println("Sqaure root of " + i + " is : " + squareroot);
		}
		sc.close();
	}
}
