package honeybee.model;

public class Worker extends HoneyBee {

	public Worker(String name) {
		super(name);
	}

	@Override
	public String doYourJob() {
		return name + " " + super.doYourJob() + "I'm a worker, I work all day!";
	}
}
