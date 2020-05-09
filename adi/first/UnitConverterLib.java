public class UnitConverterLib {
	
	private Map<String, String> normalizeUnits;
	private Map<String, Double> conversionTable;
	public static UnitConverterLib INSTANCE = new UnitConverterLib();

    public Map<String, Double> getConversionTable() {
         return conversionTable;
    }

    public Map<String, Double> getNormalizeUnits() {
         return normalizeUnits;
    }
    
    private UnitConverterLib() {
		normalizeUnits = new HashMap<String, String>();
    	normalizeUnits.put("mm", "millimeters");
    	normalizeUnits.put("millis", "millimeters");
    	normalizeUnits.put("millimeters", "millimeters");
    	normalizeUnits.put("cm", "centimeter");
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
   		normalizeUnits.put("km", "kilometer"); 

   		conversionTable = new HashMap<String, Double>();
   		conversionTable.put("millimeters-millimeters", 1);
   		conversionTable.put("millimeters-centimeters", 0.1);
   		conversionTable.put("millimeters-meters", 0.001);
   		conversionTable.put("millimeters-decameters", 0.0001);
   		conversionTable.put("millimeters-kilometers", 0.000001);

   		conversionTable.put("centimeters-millimeters", 10);
   		conversionTable.put("centimeters-centimeters", 1);
   		conversionTable.put("centimeters-meters", .01);
   		conversionTable.put("centimeters-decameters", 0.001);
   		conversionTable.put("centimeters-kilometers", 0.00001);


   		conversionTable.put("meters-millimeters", 1000);
   		conversionTable.put("meters-centimeters", 100);
   		conversionTable.put("meters-meters", 1);
   		conversionTable.put("meters-decameters", 0.1);
   		conversionTable.put("meters-kilometers", 0.001);

  		conversionTable.put("decameters-millimeters", 100000);
   		conversionTable.put("decameters-centimeters", 1000);
   		conversionTable.put("decameters-meters", 10);
   		conversionTable.put("decameters-decameters", 1);
   		conversionTable.put("decameters-kilometers", 0.01);

  		conversionTable.put("kilometers-millimeters", 1000000);
   		conversionTable.put("kilometers-centimeters", 100000);
   		conversionTable.put("kilometers-meters", 1000);
   		conversionTable.put("kilometers-decameters", 100);
   		conversionTable.put("kilometers-kilometers", 1);

    }

    public static double convert(double value, String conversionType) {
          double conversionValue = INSTANCE.getConversionTable().get(conversionType);
          return value * conversionValue;
    }

}