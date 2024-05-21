package zoo.model.animal;

public class Duck extends Animal {

	public Duck(String name) {
		super(name);
	}
	
	@Override
	public String noise() {
		return "Quack !";
	}
}
