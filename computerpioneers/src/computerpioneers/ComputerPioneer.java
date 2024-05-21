package computerpioneers;

public class ComputerPioneer {
	private final String firstName;
	private final String lastName;
	private Device device;
	
	public ComputerPioneer(String firstName, String lastName, Device device) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.device = device;
	}
	
	public String toString() {
		return this.device + ". " + this.firstName + " " + this.lastName + " is a pioneer in Computer Science.";
	}
	
	public boolean worksOn(Device device) {
		if (this.device.getName().equals(device.getName())) {
	        return true;
	    } else {
	        return false;
	    }
	}
}
