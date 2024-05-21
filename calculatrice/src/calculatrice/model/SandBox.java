package calculatrice.model;

import calculatrice.util.DivisionParZeroException;

public class SandBox {

	public static void main(String[] args) {
		
		Calculatrice calculatrice = new Calculatrice();
		
		int dividende = 42;
		int diviseur = 2;
		int quotient = 0;
		int resultat = 0;
		
		try {
			quotient = calculatrice.diviser(dividende, diviseur);
		} catch (DivisionParZeroException e) {
			e.printStackTrace();
		}
		System.out.println("Le résultat de la division de " + dividende + " par " + diviseur + " est : " + quotient);
		
		try {
			resultat = calculatrice.diviser(42, 0);
		} catch(ArithmeticException | DivisionParZeroException e) {
		System.out.println("La division par zéro est impossible");
		System.out.println("L'exception capturée est : " + e.getMessage());
		}
		
		try {
			resultat = calculatrice.diviser(42, 0);
		} catch(Exception e) {
		System.out.println("La division par zéro est impossible");
		System.out.println("L'exception capturée est : " + e.getMessage());
		}
	}

}
