package TareaPila;

public class Prueba {

	public static void main(String[] args) {	
		
		PilaG<Integer> PilaNum = new PilaG<Integer> (5);
		PilaNum.push(5);
		PilaNum.push(7);
		PilaNum.push(10);
		System.out.println(PilaNum.pop());
		
		PilaG<String> PilaAlumnos= new PilaG<String> (4);
		PilaAlumnos.push("Mario");
		PilaAlumnos.push("Sergio");
		PilaAlumnos.push("Camilo");
		System.out.println(PilaAlumnos.peek());
		
		PilaG<String> PilaAlumnos2= new PilaG<String> (4);
		PilaAlumnos2.push("Cristina");
		PilaAlumnos2.push("Benni");
		PilaAlumnos2.push("Ruth");
		PilaAlumnos2.push("Charo");
		System.out.println(PilaAlumnos2.estaLleno());
		
		PilaG<String> PilaAlumnos3= new PilaG<String> (4);
		PilaAlumnos3.push("Marimar");
		PilaAlumnos3.push("Anubis");
		PilaAlumnos3.push("copito");
		System.out.println(PilaAlumnos3.estaVacio());

	}
}
