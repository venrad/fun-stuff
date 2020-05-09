import java.util.Scanner;

public class input {
	
	public static void main(String[] args) {

		System.out.print("Please enter your name: ");
		Scanner sc = new Scanner(System.in);
		String scanned = sc.next();

		if (scanned.contains("0") || scanned.contains("1") || scanned.contains("2") || scanned.contains("3") || scanned.contains("4") || scanned.contains("5") || scanned.contains("6") || scanned.contains("7") || scanned.contains("8") || scanned.contains("9")) {
			System.out.println("Wow! RUDE! I asked you a question and Mr. Doofus is over here typing like a mongoose!");
		
		}
		
	}
}