package racional;

import org.junit.*;

class RacionalTest {

	Racional racional;
	
	@Before
	void antes() {
		racional = new Racional(3.1);
	}

	@Test
	public void testCISI() {
		long antes, despues;
		antes = System.nanoTime();
		racional.convertirIterativo();
		despues = System.nanoTime();
		long dif1 = despues - antes;
		
		antes = System.nanoTime();
		racional.simplificarIterativo();
		despues = System.nanoTime();
		long dif2 = despues - antes;

		System.out.println("Convertir Iterativo: " + dif1 + " - Simplificar Iterativo: " + dif2);
	}

	@Test
	public void testCRSI() {
		long antes, despues;
		antes = System.nanoTime();
		racional.convertirRecursivo();
		despues = System.nanoTime();
		long dif1 = despues - antes;
		
		antes = System.nanoTime();
		racional.simplificarIterativo();
		despues = System.nanoTime();
		long dif2 = despues - antes;

		System.out.println("Convertir Recursivo: " + dif1 + " - Simplificar Iterativo: " + dif2);
	}
	
	@Test
	public void testCISR() {
		long antes, despues;
		antes = System.nanoTime();
		racional.convertirIterativo();
		despues = System.nanoTime();
		long dif1 = despues - antes;
		
		antes = System.nanoTime();
		racional.simplificarRecursivo();
		despues = System.nanoTime();
		long dif2 = despues - antes;

		System.out.println("Convertir Iterativo: " + dif1 + " - Simplificar Recursivo: " + dif2);
	}

	@Test
	public void testCRSR() {
		long antes, despues;
		antes = System.nanoTime();
		racional.convertirRecursivo();
		despues = System.nanoTime();
		long dif1 = despues - antes;
		
		antes = System.nanoTime();
		racional.simplificarRecursivo();
		despues = System.nanoTime();
		long dif2 = despues - antes;

		System.out.println("Convertir Recursivo: " + dif1 + " - Simplificar Recursivo: " + dif2);
		
	}
}
