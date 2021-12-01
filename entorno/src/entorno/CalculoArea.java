package entorno;

import java.util.Scanner;

public class CalculoArea {

		static Scanner teclado = new Scanner(System.in);
		
		public static void main(String[] args) {
			
			int base, altura;
			
			System.out.println("Introduce la base:");
			base = Integer.parseInt(teclado.nextLine());
			
			System.out.println("Introduce la altura");
			altura = Integer.parseInt(teclado.nextLine());
			
			System.out.print("El area es: " + (base * altura));
		}
}
