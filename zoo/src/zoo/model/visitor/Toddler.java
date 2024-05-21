package zoo.model.visitor;

public class Toddler extends Child {

	public Toddler(Integer age) {
		super(age);
	}
	
	public String whoAmI() {
		return "I'm between 1 and 6 years old : I'm a toggler : ";
	}
	
	public Integer priceOfTicket() {
		return REGULAR_TICKET / 4;
	}
}
