package prgs;
import java.util.Scanner;
public class RestaurantBill {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float bill;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the bill amount ");
		bill = sc.nextFloat();
		double discount, newbill;
		double GST = (0.12 * bill);
		double MC = (0.10 * bill);
		double TotalBill = (bill + GST + MC);
		if(TotalBill > 1000) {
			discount = (0.10 * TotalBill);
			newbill = (TotalBill - discount);
		}else {
			discount = (0.05 * TotalBill);
			newbill = (TotalBill - discount);
		}
		System.out.println("Bill " + TotalBill);
		System.out.println("GST " + GST);
		System.out.println("Maintenance Charge " + MC);
		System.out.println("Discount " + discount);
		System.out.println("Total Bill is " + newbill);
		
		sc.close();
	}
}
