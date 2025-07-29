package prgs;
public class Swap {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int t = 3;
		int j = 5;
		System.out.println("Number of apples in Tom's bag " + t);
		System.out.println("Number of apples in Jerry's bag " + j);
		t = t + j;
		j = t - j;
		t = t - j;
		System.out.println("\n");
		System.out.println("Number of apples in Tom's bag " + t);
		System.out.println("Number of apples in Jerry's bag " + j);
	}
}
