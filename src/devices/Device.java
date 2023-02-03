package devices;

public abstract class Device {
	
	public String serialNumbber;

	public Device(String serialNumbber) {
		this.serialNumbber = serialNumbber;
	}

	public String getSerialNumbber() {
		return serialNumbber;
	}

	public void setSerialNumbber(String serialNumbber) {
		this.serialNumbber = serialNumbber;
	}
	
	public abstract void processDoc(String doc);
}
