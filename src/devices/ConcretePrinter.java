package devices;

public class ConcretePrinter extends Device implements Printer{

	public ConcretePrinter(String serialNumbber) {
		super(serialNumbber);
	}

	@Override
	public void processDoc(String doc) {
		System.out.println("Printer porcessing: " + doc);
	}
	
	@Override
	public void print (String doc) {
		System.out.println("Printing : " + doc);
	}
}
