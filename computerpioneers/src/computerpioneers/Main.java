package computerpioneers;

public class Main {

	public static void main(String[] args) {	
		Device babbageMachine = new Device("Babbage Analystical Machine", 1837);
		
		Device turingEngine = new Device("Turing Engine", 1936);
		
		ComputerPioneer adaLovelace = new ComputerPioneer("Ada", "Lovelace", babbageMachine);
		System.out.println(adaLovelace.toString());
		
		ComputerPioneer alanTuring = new ComputerPioneer("Alan", "Turing", turingEngine);
		System.out.println(alanTuring.toString());
		
		System.out.println("Test case 3 ");
		System.out.println("--------------------------");
		System.out.println(adaLovelace.worksOn(babbageMachine));
		System.out.println(adaLovelace.worksOn(turingEngine));
		System.out.println(alanTuring.worksOn(babbageMachine));
		System.out.println(alanTuring.worksOn(turingEngine));
		System.out.println("--------------------------");
		
		System.out.println("Test case 4 ");
		System.out.println("--------------------------");
		Device babbage = new Device("Babbage Analystical Machine", 1837);
		Device turing = new Device("Turing Engine", 1936);
		System.out.println(adaLovelace.worksOn(babbage));
		System.out.println(adaLovelace.worksOn(turing));
		System.out.println(alanTuring.worksOn(babbage));
		System.out.println(alanTuring.worksOn(turing));
		System.out.println("--------------------------");
	}

}
