package zoo.model.visitor;

public class SchoolAge extends Child {
	
	public SchoolAge(Integer age) {
		super(age);
	}
	
	public String whoAmI() {
		return "I'm between 6 and 12 years old : I'm a school-age age :";
	}

	public Integer priceOfTicket() {
		return REGULAR_TICKET / 3;
	}
}
