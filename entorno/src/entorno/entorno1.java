package entorno;

import java.util.Scanner;
	
public class entorno1 {
	
	static Scanner teclado = new Scanner(System.in);
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		System.out.println("Cual es tu nombre?!");
		
		String miNombre = teclado.nextLine();
		
		System.out.println("Hola "+miNombre);
	}

}
  