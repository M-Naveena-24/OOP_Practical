package prgms;
public class Namedisplay {
	public static void main(String[] args) {
		String name = "Naveena";
		System.out.println("Displaying of the name character by character in new lines. ");
		for(int i = 0; i < name.length(); i++) {
			char ch = name.charAt(i);
			System.out.println(ch);
		}
	}
}