package zoo.model.visitor;

public class Visitor {
	
	protected Integer REGULAR_TICKET = 10;

	public String sayHello() {
		return "Hello! ";
	}
	
	public String whoAmI() {
		return "I'm a visitor. ";
	}
	
	public Integer priceOfTicket() {
		return REGULAR_TICKET;
	}
}
