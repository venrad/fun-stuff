import java.util.Scanner;

public class unitconverter {

	public static void main(String[] args) {

			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your initial unit: ");
			String initunit1 = sc.next();

			if (initunit1.equalsIgnoreCase("millimeters") || initunit1.equalsIgnoreCase("millimeter") || initunit1.equalsIgnoreCase("mm")) {
				System.out.print("You entered millimeters. Now, enter your final unit: ");
				String finunit1 = sc.next();
				if (finunit1.equalsIgnoreCase("centimeter") || finunit1.equalsIgnoreCase("centimeters") || finunit1.equalsIgnoreCase("cm")) {
					System.out.println("Ok. You are converting from millimeters to centimeters.");
				}
				else if (finunit1.equalsIgnoreCase("decimeter") || finunit1.equalsIgnoreCase("decimeters") || finunit1.equalsIgnoreCase("dm")) {
					System.out.println("Ok. You are converting from millimeters to decimeters.");
				}
				else if (finunit1.equalsIgnoreCase("meter") || finunit1.equalsIgnoreCase("meters") || finunit1.equalsIgnoreCase("m")) {
					System.out.println("Ok. You are converting from millimeters to meters.");
				}
				else if (finunit1.equalsIgnoreCase("decameter") || finunit1.equalsIgnoreCase("decameters") || finunit1.equalsIgnoreCase("dam")) {
					System.out.println("Ok. You are converting from millimeters to decameters.");
				}
				else if (finunit1.equalsIgnoreCase("hectometer") || finunit1.equalsIgnoreCase("hectometers") || finunit1.equalsIgnoreCase("hm")) {
					System.out.println("Ok. You are converting from millimeters to hectometers.");
				}
				else if (finunit1.equalsIgnoreCase("kilometer") || finunit1.equalsIgnoreCase("kilometers") || finunit1.equalsIgnoreCase("km")) {
					System.out.println("Ok. You are converting from millimeters to kilometers.");
				}
				else {
					System.out.println("Sorry, our conversion system only goes from millimeters to kilometers. Try again.");
				}
			}
			else if (initunit1.equalsIgnoreCase("centimeters") || initunit1.equalsIgnoreCase("centimeter") || initunit1.equalsIgnoreCase("cm")) {
				System.out.print("You entered centimeters. Now, enter your final unit: ");
				String finunit2 = sc.next();
				if (finunit2.equalsIgnoreCase("millimeters") || finunit2.equalsIgnoreCase("millimeter") || finunit2.equalsIgnoreCase("mm")) {
					System.out.println("Ok. You are converting from centimeters to millimeters.");
				}
				else if (finunit2.equalsIgnoreCase("decimeter") || finunit2.equalsIgnoreCase("decimeters") || finunit2.equalsIgnoreCase("dm")) {
					System.out.println("Ok. You are converting from centimeters to decimeters.");
				}
				else if (finunit2.equalsIgnoreCase("meter") || finunit2.equalsIgnoreCase("meters") || finunit2.equalsIgnoreCase("m")) {
					System.out.println("Ok. You are converting from centimeters to meters.");
				}
				else if (finunit2.equalsIgnoreCase("decameter") || finunit2.equalsIgnoreCase("decameters") || finunit2.equalsIgnoreCase("dam")) {
					System.out.println("Ok. You are converting from centimeters to decameters.");
				}
				else if (finunit2.equalsIgnoreCase("hectometer") || finunit2.equalsIgnoreCase("hectometers") || finunit2.equalsIgnoreCase("hm")) {
					System.out.println("Ok. You are converting from centimeters to hectometers.");
				}
				else if (finunit2.equalsIgnoreCase("kilometer") || finunit2.equalsIgnoreCase("kilometers") || finunit2.equalsIgnoreCase("km")) {
					System.out.println("Ok. You are converting from centimeters to kilometers.");
				}
				else {
					System.out.println("Sorry, our conversion system only goes from millimeters to kilometers. Try again.");
				}
			}
			else if (initunit1.equalsIgnoreCase("decimeter") || initunit1.equalsIgnoreCase("decimeters") || initunit1.equalsIgnoreCase("dm")) {
				System.out.print("You entered decimeters. Now, enter your final unit: ");
				String finunit3 = sc.next();
				if (finunit3.equalsIgnoreCase("millimeters") || finunit3.equalsIgnoreCase("millimeter") || finunit3.equalsIgnoreCase("mm")) {
					System.out.println("Ok. You are converting from decimeters to millimeters.");
				}
				else if (finunit3.equalsIgnoreCase("centimeters") || finunit3.equalsIgnoreCase("centimeter") || finunit3.equalsIgnoreCase("cm")) {
					System.out.println("Ok. You are converting from decimeters to centimeters.");
				}
				else if (finunit3.equalsIgnoreCase("meter") || finunit3.equalsIgnoreCase("meters") || finunit3.equalsIgnoreCase("m")) {
					System.out.println("Ok. You are converting from decimeters to meters.");
				}
				else if (finunit3.equalsIgnoreCase("decameter") || finunit3.equalsIgnoreCase("decameters") || finunit3.equalsIgnoreCase("dam")) {
					System.out.println("Ok. You are converting from decimeters to decameters.");
				}
				else if (finunit3.equalsIgnoreCase("hectometer") || finunit3.equalsIgnoreCase("hectometers") || finunit3.equalsIgnoreCase("hm")) {
					System.out.println("Ok. You are converting from decimeters to hectometers.");
				}
				else if (finunit3.equalsIgnoreCase("kilometer") || finunit3.equalsIgnoreCase("kilometers") || finunit3.equalsIgnoreCase("km")) {
					System.out.println("Ok. You are converting from decimeters to kilometers.");
				}
				else {
					System.out.println("Sorry, our conversion system only goes from millimeters to kilometers. Try again.");
				}
			}
			else if (initunit1.equalsIgnoreCase("meters") || initunit1.equalsIgnoreCase("meter") || initunit1.equalsIgnoreCase("m")) {
				System.out.print("You entered meters. Now, enter your final unit: ");
				String finunit4 = sc.next();
				if (finunit4.equalsIgnoreCase("millimeters") || finunit4.equalsIgnoreCase("millimeter") || finunit4.equalsIgnoreCase("mm")) {
					System.out.println("Ok. You are converting from meters to millimeters.");
				}
				else if (finunit4.equalsIgnoreCase("centimeters") || finunit4.equalsIgnoreCase("centimeter") || finunit4.equalsIgnoreCase("cm")) {
					System.out.println("Ok. You are converting from meters to centimeters.");
				}
				else if (finunit4.equalsIgnoreCase("decimeters") || finunit4.equalsIgnoreCase("decimeter") || finunit4.equalsIgnoreCase("dm")) {
					System.out.println("Ok. You are converting from meters to decimeters.");
				}
				else if (finunit4.equalsIgnoreCase("decameter") || finunit4.equalsIgnoreCase("decameters") || finunit4.equalsIgnoreCase("dam")) {
					System.out.println("Ok. You are converting from meters to decameters.");
				}
				else if (finunit4.equalsIgnoreCase("hectometer") || finunit4.equalsIgnoreCase("hectometers") || finunit4.equalsIgnoreCase("hm")) {
					System.out.println("Ok. You are converting from meters to hectometers.");
				}
				else if (finunit4.equalsIgnoreCase("kilometer") || finunit4.equalsIgnoreCase("kilometers") || finunit4.equalsIgnoreCase("km")) {
					System.out.println("Ok. You are converting from meters to kilometers.");
				}
				else {
					System.out.println("Sorry, our conversion system only goes from millimeters to kilometers. Try again.");
				}
			}
			else if (initunit1.equalsIgnoreCase("decameters") || initunit1.equalsIgnoreCase("decameter") || initunit1.equalsIgnoreCase("dam")) {
				System.out.print("You entered decameters. Now, enter your final unit: ");
				String finunit5 = sc.next();
				if (finunit5.equalsIgnoreCase("millimeters") || finunit5.equalsIgnoreCase("millimeter") || finunit5.equalsIgnoreCase("mm")) {
					System.out.println("Ok. You are converting from decameters to millimeters.");
				}
				else if (finunit5.equalsIgnoreCase("centimeters") || finunit5.equalsIgnoreCase("centimeter") || finunit5.equalsIgnoreCase("cm")) {
					System.out.println("Ok. You are converting from decameters to centimeters.");
				}
				else if (finunit5.equalsIgnoreCase("decimeters") || finunit5.equalsIgnoreCase("decimeter") || finunit5.equalsIgnoreCase("dm")) {
					System.out.println("Ok. You are converting from decameters to decimeters.");
				}
				else if (finunit5.equalsIgnoreCase("meters") || finunit5.equalsIgnoreCase("meter") || finunit5.equalsIgnoreCase("m")) {
					System.out.println("Ok. You are converting from decameters to meters.");
				}
				else if (finunit5.equalsIgnoreCase("hectometer") || finunit5.equalsIgnoreCase("hectometers") || finunit5.equalsIgnoreCase("hm")) {
					System.out.println("Ok. You are converting from decameters to hectometers.");
				}
				else if (finunit5.equalsIgnoreCase("kilometer") || finunit5.equalsIgnoreCase("kilometers") || finunit5.equalsIgnoreCase("km")) {
					System.out.println("Ok. You are converting from decameters to kilometers.");
				}
				else {
					System.out.println("Sorry, our conversion system only goes from millimeters to kilometers. Try again.");
				}
			}
			else if (initunit1.equalsIgnoreCase("hectometers") || initunit1.equalsIgnoreCase("hectometer") || initunit1.equalsIgnoreCase("hm")) {
				System.out.print("You entered hectometers. Now, enter your final unit: ");
				String finunit6 = sc.next();
				if (finunit6.equalsIgnoreCase("millimeters") || finunit6.equalsIgnoreCase("millimeter") || finunit6.equalsIgnoreCase("mm")) {
					System.out.println("Ok. You are converting from hectometers to millimeters.");
				}
				else if (finunit6.equalsIgnoreCase("centimeters") || finunit6.equalsIgnoreCase("centimeter") || finunit6.equalsIgnoreCase("cm")) {
					System.out.println("Ok. You are converting from hectometers to centimeters.");
				}
				else if (finunit6.equalsIgnoreCase("decimeters") || finunit6.equalsIgnoreCase("decimeter") || finunit6.equalsIgnoreCase("dm")) {
					System.out.println("Ok. You are converting from hectometers to decimeters.");
				}
				else if (finunit6.equalsIgnoreCase("meters") || finunit6.equalsIgnoreCase("meter") || finunit6.equalsIgnoreCase("m")) {
					System.out.println("Ok. You are converting from hectometers to meters.");
				}
				else if (finunit6.equalsIgnoreCase("decameters") || finunit6.equalsIgnoreCase("decameter") || finunit6.equalsIgnoreCase("dam")) {
					System.out.println("Ok. You are converting from hectometers to decameters.");
				}
				else if (finunit6.equalsIgnoreCase("kilometer") || finunit6.equalsIgnoreCase("kilometers") || finunit6.equalsIgnoreCase("km")) {
					System.out.println("Ok. You are converting from hectometers to kilometers.");
				}
				else {
					System.out.println("Sorry, our conversion system only goes from millimeters to kilometers. Try again.");
				}
			}
			else if (initunit1.equalsIgnoreCase("kilometers") || initunit1.equalsIgnoreCase("kilometer") || initunit1.equalsIgnoreCase("km")) {
				System.out.print("You entered kilometers. Now, enter your final unit: ");
				String finunit7 = sc.next();
				if (finunit7.equalsIgnoreCase("millimeters") || finunit7.equalsIgnoreCase("millimeter") || finunit7.equalsIgnoreCase("mm")) {
					System.out.println("Ok. You are converting from kilometers to millimeters.");
				}
				else if (finunit7.equalsIgnoreCase("centimeters") || finunit7.equalsIgnoreCase("centimeter") || finunit7.equalsIgnoreCase("cm")) {
					System.out.println("Ok. You are converting from kilometers to centimeters.");
				}
				else if (finunit7.equalsIgnoreCase("decimeters") || finunit7.equalsIgnoreCase("decimeter") || finunit7.equalsIgnoreCase("dm")) {
					System.out.println("Ok. You are converting from kilometers to decimeters.");
				}
				else if (finunit7.equalsIgnoreCase("meters") || finunit7.equalsIgnoreCase("meter") || finunit7.equalsIgnoreCase("m")) {
					System.out.println("Ok. You are converting from kilometers to meters.");
				}
				else if (finunit7.equalsIgnoreCase("decameters") || finunit7.equalsIgnoreCase("decameter") || finunit7.equalsIgnoreCase("dam")) {
					System.out.println("Ok. You are converting from kilometers to decameters.");
				}
				else if (finunit7.equalsIgnoreCase("hectometers") || finunit7.equalsIgnoreCase("hectometer") || finunit7.equalsIgnoreCase("hm")) {
					System.out.println("Ok. You are converting from kilometers to hectometers.");
				}
				else {
					System.out.println("Sorry, our conversion system only goes from millimeters to kilometers. Try again.");
				}
			}
		}
	}
