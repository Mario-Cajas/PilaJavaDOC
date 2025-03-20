package TareaPila;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TestPilaG {
	
	@Test 
	void testConstructor () {
		PilaG <String> pila = new PilaG <String>(10);
		assertTrue(pila.estaVacio());
		pila.push("Hola");
		assertFalse(pila.estaVacio());
	}
	
	@Test
	void testPush() {
		PilaG<String> PilaAlumnos= new PilaG<String> (3);
		
		assertTrue(PilaAlumnos.push("Mario"));
		assertTrue(PilaAlumnos.push("Sergio"));
		assertTrue(PilaAlumnos.push("Camilo"));	
		assertFalse(PilaAlumnos.push("Juan"));
	}
	
	@Test
	void testPop() {
		PilaG<String> PilaAlumnos= new PilaG<String> (4);
		PilaAlumnos.push("Mario");
		PilaAlumnos.push("Sergio");
		PilaAlumnos.push("Camilo");
		assertEquals("Camilo", PilaAlumnos.pop());
	}
	
	@Test
	void testPeek() {
		PilaG<String> PilaAlumnos= new PilaG<String> (4);
		PilaAlumnos.push("Mario");
		PilaAlumnos.push("Sergio");
		PilaAlumnos.push("Camilo");
		
		assertEquals("Camilo", PilaAlumnos.peek());
	}
	
	@Test
	void testestaLleno() {
		PilaG<String> PilaAlumnos= new PilaG<String> (3);
		assertFalse(PilaAlumnos.estaLleno());
		
		PilaAlumnos.push("Sa");
		PilaAlumnos.push("Pe");
		PilaAlumnos.push("Al");
		
		assertTrue(PilaAlumnos.estaLleno());
	}
	
	@Test
	void testestaVacio() {
		PilaG<String> PilaAlumnos= new PilaG<String> (3);
		assertTrue(PilaAlumnos.estaVacio());
		
		PilaAlumnos.push("Sa");
		assertFalse(PilaAlumnos.estaVacio());
		
		PilaAlumnos.pop();
		assertTrue(PilaAlumnos.estaVacio());
	}
}
