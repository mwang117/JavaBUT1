package honeybee.model;

public class Queen extends HoneyBee {

	public Queen(String name) {
		super(name);
	}

	@Override
	public String doYourJob() {
		return name + " " + super.doYourJob() + "I'm a Queen, any questions?";
	}
}
