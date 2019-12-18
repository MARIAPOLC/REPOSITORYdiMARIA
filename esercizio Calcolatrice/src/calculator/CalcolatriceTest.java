package calculator;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalcolatriceTest {

	@Before// codice da inserire prima del test
	public void setUp() throws Exception {
	}

	@After //codice da inserire dopo il test
	public void tearDown() throws Exception {
	}

	@Test
	public void testSomma() {
		Calcolatrice calc = new Calcolatrice();
				int a = 5;
		        int b = 4;
		        int risultato = calc.somma(a, b);
		        assertEquals (9,risultato,"somma"); 
		        // assertEquals mi confronta se il risultato atteso è uguale a quello ottenuto. per provare se funziona si fa "run as Junit test"
		        
		//fail("Not yet implemented");
	}
	@Test
	public void testDivisione() {
		Calcolatrice calc = new Calcolatrice();
				int a = 5;
		        int b = 0;
		       double risultato = calc.dividi(a,b);
		        assertEquals (2.5,risultato, "dividi"); 
		        }
}// "coverage as" serve capire se è stato coperto tutto il programma.
