import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

public class UnitC {

    private Map<String, String> normalizeUnits;

    public UnitC() {
		normalizeUnits = new HashMap<String, String>();
    	normalizeUnits.put("mm", "millimeters");
    	normalizeUnits.put("millimeter", "millimeters");
    	normalizeUnits.put("millimeters", "millimeters");
    	normalizeUnits.put("cm", "centimeters");
    	normalizeUnits.put("centimeters", "centimeters");
    	normalizeUnits.put("centimeter", "centimeters");
    	normalizeUnits.put("meter", "meters");
    	normalizeUnits.put("m", "meters");
    	normalizeUnits.put("meters", "meters");
    	normalizeUnits.put("decameter", "decameters");
    	normalizeUnits.put("decameters", "decameters");
    	normalizeUnits.put("dam", "decameters");
    	normalizeUnits.put("hectometer", "hectometers");
    	normalizeUnits.put("hectometers", "hectometers");
    	normalizeUnits.put("hm", "hectometers");
    	normalizeUnits.put("kilometer", "kilometers");
   		normalizeUnits.put("kilometers", "kilometers");
   		normalizeUnits.put("km", "kilometers");    	
    }

    public Map<String, String> getNormalizeUnits() {
    	return normalizeUnits;
    }

	public static void main(String[] args) {
            UnitC uc = new UnitC();
			Scanner sc = new Scanner(System.in);
			System.out.print("Enter your initial unit: ");
			String initunit1 = sc.next();
			if(uc.getNormalizeUnits().containsKey(initunit1.toLowerCase())) {
				System.out.printf("You entered %s. Now enter your final unit: ", uc.getNormalizeUnits().get(initunit1));
			    String finunit1 = sc.next();
			    if (uc.getNormalizeUnits().containsKey(finunit1.toLowerCase())) {
			    	System.out.printf("Ok. You are converting from %s to %s\n", uc.getNormalizeUnits().get(initunit1), uc.getNormalizeUnits().get(finunit1));
			    } else {
			    	System.out.println("Entered a wrong unit. Exiting.. ");
			    }
			} else {
				System.out.println("Entered a wrong unit. Try again");
			}
		}


}
	

