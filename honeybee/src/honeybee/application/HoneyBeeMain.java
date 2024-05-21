package honeybee.application;

import honeybee.gui.Console;
import honeybee.model.Drone;
import honeybee.model.HoneyBee;
import honeybee.model.Queen;
import honeybee.model.Worker;

public class HoneyBeeMain {

	public static void main(String[] args) {
		someHoneyBees();
		arrayOfHoneyBees();
		collectionOfHoneyBees();
	}


	private static void someHoneyBees() {
		Console.title(" Some honeybees ");

		HoneyBee queen = new Queen("Mellifera");
		HoneyBee firstWorker = new Worker("Maya");
		HoneyBee secondWorker = new Worker("Marguerite");
		HoneyBee thirdWorker = new Worker("Propolis");
		HoneyBee firstDrone = new Drone("Willy");
		HoneyBee secondDrone = new Drone("Didier");

		Console.message(queen.doYourJob());
		Console.message(firstWorker.doYourJob());
		Console.message(secondWorker.doYourJob());
		Console.message(thirdWorker.doYourJob());
		Console.message(firstDrone.doYourJob());
		Console.message(secondDrone.doYourJob());

		Console.message(Console.SEPARATOR_LINE);

		Console.message(queen.fly());
		Console.message(firstWorker.fly());
		Console.message(secondWorker.fly());
		Console.message(thirdWorker.fly());
		Console.message(firstDrone.fly());
		Console.message(secondDrone.fly());
	}
	
	private static void arrayOfHoneyBees() {
		Console.title(" Array of honeybees ");
		
		HoneyBee[] honeyBees = new HoneyBee[] {new Queen("Mellifera"), 
				new Drone("Willy"),
				new Drone("Didier"),
				new Worker("Maya"),
				new Worker("Marguerite"),
				new Worker("Propolis")};
		
		for(int i = 0; i < honeyBees.length; i++) {
			System.out.println(honeyBees[i].doYourJob());
		}
		Console.message(Console.SEPARATOR_LINE);
		for(int i = 0; i < honeyBees.length; i++) {
			System.out.println(honeyBees[i].fly());
		}
		Console.message(Console.SEPARATOR_LINE);
	}
	
	private static void collectionOfHoneyBees() {
		Console.title(" Collection of honeybees ");
		
		HoneyBee[] honeyBees = new HoneyBee[] {new Queen("Mellifera"), 
				new Drone("Willy"),
				new Drone("Didier"),
				new Worker("Maya"),
				new Worker("Marguerite"),
				new Worker("Propolis")};
		
		for(int i = 0; i < honeyBees.length; i++) {
			System.out.println(honeyBees[i].doYourJob() + "\n" + honeyBees[i].fly());
			Console.message(Console.SEPARATOR_LINE);
		}
	}
}	
