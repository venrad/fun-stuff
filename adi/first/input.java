import java.util.Scanner;

public class input {
	
	public static void main(String[] args) {

		System.out.print("Please enter your name: ");
		Scanner sc = new Scanner(System.in);
		String scanned = sc.next();

		if (scanned.contains("0") || scanned.contains("1") || scanned.contains("2") || scanned.contains("3") || scanned.contains("4") || scanned.contains("5") || scanned.contains("6") || scanned.contains("7") || scanned.contains("8") || scanned.contains("9")) {
			System.out.println("Wow! RUDE! I asked you a question and Mr. Doofus is over here typing like a mongoose!");
		}
		else if (scanned.contains("adha")) {
			System.out.println("Hello, you are Adisesh's mom right? Nice to meet you. I was created by Adisesh. He is my hero. Did you know that he is the best in everything? How is your day going?");
		}
		else if (scanned.contains("enkatesh")) {
			System.out.println("Hello, you are Adisesh's dad right? Nice to meet you. I was created by Adisesh. He is my hero. Did you know that he is the best in everything? How is your day going?");
		}
		else if (scanned.contains("disesh") || scanned.equals("Adi") || scanned.equals("adi")) {
			System.out.println("I bow down to you master. You are my hero and my inspiration. Continue with your journey to become a billionaire :) How is your day going?");
		}
		else if (scanned.contains("avithri") || scanned.equals("Savithri") || scanned.equals("Savithramma")) {
			System.out.println("Hello Savithri, you are Adisesh's grandmother right? How are you doing?");
		}
		else {
			System.out.println("Hello " + scanned + ", how are you doing?");
		}
		

		sc = new Scanner(System.in);
		String hi = sc.next();

		if (hi.contains("ood") || hi.contains("ine") || hi.contains("ok") || hi.contains("okay")) {
			System.out.println("Great to hear that! Be more enthusiastic! :)");
		}
		else if (hi.contains("reat") || hi.contains("antastic") || hi.contains("mazing")) {
			System.out.println("Amazing. Love your enthusiasm!");
		}
		else if (hi.contains("ad") || hi.contains("orrible") || hi.contains("isastrous")) {
			System.out.println("Aww. That's sad. Anything I can do to help?");
		}
		else if (hi.contains("0") || hi.contains("1") || hi.contains("2") || hi.contains("3") || hi.contains("4") || hi.contains("5") || hi.contains("6") || hi.contains("7") || hi.contains("8") || hi.contains("9")) {
			System.out.println("Wow! RUDE! I asked you a question and Mr. Doofus is over here typing like a mongoose!");
		}
		else {
			System.out.println("Sorry, my vocabulary isn't the best. Could you try rephrasing that in simpler terms? :)");
		}
		
	}
}