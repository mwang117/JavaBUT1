package zoo.model.visitor;

public class Adult extends Visitor {
	
	public String whoAmI() {
		return "I'm an adult. ";
	}
	
	public Integer priceOfTicket() {
		return REGULAR_TICKET;
	}
}
