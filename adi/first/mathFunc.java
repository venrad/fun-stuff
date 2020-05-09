import java.util.Scanner;

public class mathFunc {

	public static void main(String[] args) {

		System.out.print("Hello. Enter your value for x: ");
		Scanner sc = new Scanner(System.in);
		double x = sc.nextDouble();
		System.out.print("Hello. Enter your value for a: ");
		double a = sc.nextDouble();
		System.out.print("Hello. Enter your value for b: ");
		double b = sc.nextDouble();
		System.out.print("Hello. Enter your value for c: ");
		double c = sc.nextDouble();
		System.out.print("Hello. Enter your value for d: ");
		double d = sc.nextDouble();
		System.out.print("Hello. Enter your value for e: ");
		double e = sc.nextDouble();
		System.out.println("The output of the function is " + f(x, a, b, c, d, e));


	}
	private static double f(double x, double a1, double b1, double c1, double d1, double e1) {
		
		a = b = c = d = e = 0.0;
		double y = (a*(Math.pow(x,4)))+(b*(Math.pow(x,3)))+(c*(Math.pow(x,2)))+(d*x)+e;
		return y;

	}
}