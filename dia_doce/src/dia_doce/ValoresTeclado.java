package dia_doce;

import java.util.Scanner;



public class ValoresTeclado {
	
	/*public static int valorMayor(int a, int b, int c) {
        return Math.max(Math.max(a, b), c);
    }

    public static int valorMenor(int a, int b, int c) {
        return Math.min(Math.min(a, b), c);
    }*/
    

	public static void main(String[] args) {
		Scanner input = new Scanner (System.in);
		
		System.out.println("Ingresa el primer numero : " );
		int val1 = input.nextInt();
		
		System.out.println("Ingresa el segundo numero : " );
		int val2 = input.nextInt();
		
		System.out.println("Ingresa el tercer numero : " );
		int val3 = input.nextInt();
		
		int mayor = val1;
		
				if (val2 > mayor) {
		            mayor = val2;
		        }
		        if (val3 > mayor) {
		            mayor = val3;
		        }
		        
		        int menor = val1;
		        if (val2 < menor) {
		            menor = val2;
		        }
		        if (val3 < menor) {
		            menor = val3;
		        }
		        
		        System.out.println("El mayor de los valores es: " + mayor);
		        System.out.println("El menor de los valores es: " + menor);
			
				
			}
	
	}


