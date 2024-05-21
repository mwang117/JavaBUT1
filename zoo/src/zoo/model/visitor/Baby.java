package zoo.model.visitor;

public class Baby extends Child implements zoo.model.Noisy {
	
	protected Baby(Integer age) {
		super(age);
	}

	public String whoAmI() {
		return "I'm under 1 years old : I'm a baby ! : ";
	}
	
	public Integer priceOfTicket() {
		return REGULAR_TICKET * 0;
	}
	
	public String noise() {
		return "waaaaaaaaaaaaa";
	}
}
