package rover;

public class Main {

	public static void main(String[] args) {
		Rover viper = new Rover();
		Rover python = new Rover(new Position(5, 10), Direction.EAST);
		Rover anaconda = new Rover(20, 30, Direction.SOUTH);
		
		System.out.println(viper.toString());
		System.out.println(python.toString());
		System.out.println(anaconda.toString());
	}

}
