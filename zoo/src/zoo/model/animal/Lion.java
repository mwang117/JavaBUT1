package zoo.model.animal;

public class Lion extends Animal {

	public Lion(String name) {
		super(name);
	}
	
	@Override
	public String noise() {
		return "Roar !";
	}
}
