public class DataTypes {
	
	byte byteNo;
	short shortNo;
	int intNo;
	long longNo;
	float floatNo;
	double doubleNo;
	char character;
	String name;
	
	
	public void displayData() {
	    System.out.println("byte = "+byteNo);
		System.out.println("short = "+shortNo);
		System.out.println("int = "+intNo);
		System.out.println("long = "+longNo);	
		System.out.println("float = "+floatNo);
		System.out.println("double = "+doubleNo);
		System.out.println("char = "+character);
		System.out.println("String = "+name);
	}
	
	public static void main (String args[]) {
		DataTypes obj = new DataTypes();
		obj.byteNo=23;
		obj.shortNo=188;
		obj.intNo=765433;
		obj.longNo=4300l;
		obj.floatNo=1.9005f;
		obj.doubleNo=9877;
		obj.character='P';
		obj.name="Rohan Maske";
		
		obj.displayData();
	}
}