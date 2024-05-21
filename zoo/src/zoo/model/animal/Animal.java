package zoo.model.animal;

public abstract class Animal implements zoo.model.Noisy {
	
	protected String name;
	
	protected Animal(String name) {
		this.name = name;
	}
	
	public String name() {
		return this.name;
	}
}
