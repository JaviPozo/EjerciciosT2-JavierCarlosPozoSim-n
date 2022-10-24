package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// Definimos las variables

		int resto; // Es el número que se le pide al usuario
		int numero; // Es el numero que sale al sacar el módulo
		String letra =""; // Es la letra que le corresponde a cada numero 

		// Creamos el Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número de 8 digitos
		System.out.print("Introduzca un número de 8 digitos para poder calcular tu letra del DNI: ");
		numero = sc.nextInt();
		
		// Si el número tiene más de o menos de 8 cifras el número no es valido
		if (numero <= 10000000 || numero > 100000000) {
			System.out.println("El número no es valido");
		} else { // Si no, es valido
			resto = numero % 23; // Hacemos el módulo de 23 para sacar el resto y así poder calcular la letra
			
			// Dependiendo del valor del resto la letra es una u otra
			switch (resto) {
			case 0:
				letra = "T";
				break;
			case 1:
				letra = "R";
				break;
			case 2:
				letra = "W";
				break;
			case 3:
				letra = "A";
				break;
			case 4:
				letra = "G";
				break;
			case 5:
				letra = "M";
				break;
			case 6:
				letra = "Y";
				break;
			case 7:
				letra = "F";
				break;
			case 8:
				letra = "P";
				break;
			case 9:
				letra = "D";
				break;
			case 10:
				letra = "X";
				break;
			case 11:
				letra = "B";
				break;
			case 12:
				letra = "N";
				break;
			case 13:
				letra = "J";
				break;
			case 14:
				letra = "Z";
				break;
			case 15:
				letra = "S";
				break;
			case 16:
				letra = "Q";
				break;
			case 17:
				letra = "V";
				break;
			case 18:
				letra = "H";
				break;
			case 19:
				letra = "L";
				break;
			case 20:
				letra = "C";
				break;
			case 21:
				letra = "K";
				break;
			case 22:
				letra = "E";
				break;
			}
			
			// Mostramos el DNI con letra
			System.out.println("El DNI completo es: " + numero + letra);

		}
		
		// Cerramos el Scanner
		sc.close();
	}

}
