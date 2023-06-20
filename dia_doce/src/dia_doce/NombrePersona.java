package dia_doce;

import java.util.Scanner;

public class NombrePersona {
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Por favor ingrese su nombre");
		String nombre = input.nextLine();
		
		System.out.println("Por favor ingrese su edad");
		int edad = input.nextInt();
		
		System.out.println("Bienvenido" + nombre);
		
	}
	

}
