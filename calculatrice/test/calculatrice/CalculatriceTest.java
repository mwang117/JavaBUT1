package calculatrice;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import calculatrice.model.Calculatrice;
import calculatrice.util.DivisionParZeroException;

class CalculatriceTest {

	@Test
	public void doitAdditionerDeuxEntiers() {
		
		int terme1 = 4;
		int terme2 = 6;
		Calculatrice calculatrice = new Calculatrice();
		
		int somme = calculatrice.additionner(terme1, terme2);
		
		assertEquals(10, somme);
	}
	
	@Test
	public void doitSoustraireDeuxEntiers() {
		
		int terme1 = 5;
		int terme2 = 10;
		Calculatrice calculatrice = new Calculatrice();
		
		int soustraction = calculatrice.soustraire(terme1, terme2);
		
		assertEquals(-5, soustraction);
	}
	
	@Test
	public void doitMultiplierDeuxEntiers() {
		
		int facteur1 = 10;
		int facteur2 = 10;
		Calculatrice calculatrice = new Calculatrice();
		
		int multiplication = calculatrice.multiplier(facteur1, facteur2);
		
		assertEquals(100, multiplication);
	}

	@Test
	public void doitDiviserDeuxEntiers() throws DivisionParZeroException {
		
		int diviseur = 2;
		int dividende = 42;
		Calculatrice calculatrice = new Calculatrice();
		
		int quotient = calculatrice.diviser(dividende, diviseur);

		assertEquals(21, quotient);
	} 
	
	@Test
    public void doiLeverUneDivisionParZeroException() {
        Calculatrice calculatrice = new Calculatrice();
        DivisionParZeroException exception = assertThrows(DivisionParZeroException.class, () ->
            calculatrice.diviser(42, 0));
        assertEquals("Division impossible car le diviseur est égal à zéro !", exception.getMessage());
    }
}
