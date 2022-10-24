package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// Definimos las variables
		int num; // Esta variable sirve para identificar el número introducido por el usuario
		
		// Creamos el Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario que introduzca un número
		System.out.print("Introduzca un número para poder hallar su valor absoluto: ");
		num = sc.nextInt();

		// Creamos un ternario para saber el valor absoluto
		num = num < 0 ? -num : num;

		// Le mostramos al usuario el valor absoluto
		System.out.printf("El numero en valor absoluto es: %d", num);

		// Cerramos el escaner
		sc.close();

	}

}
