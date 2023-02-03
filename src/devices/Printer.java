package devices;

public class Printer extends Device{

	public Printer(String serialNumbber) {
		super(serialNumbber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Printer porcessing: " + doc);
	}
	
	public void print (String doc) {
		System.out.println("Printing : " + doc);
	}
}
