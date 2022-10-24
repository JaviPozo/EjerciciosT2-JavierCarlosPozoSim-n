package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// Definimos las variables
		double cantComida, kilosComida, resultado;
		int numAnimales;

		// Creamos el Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca la cantidad de comida comprada
		System.out.print("Introduzca la catidad de comida comprada: ");
		cantComida = sc.nextDouble();

		// Le pedimos al usuario que introduzca el número de animales que hay en la
		// granja
		System.out.print("Introduzca el número de animales que hay en la granja: ");
		numAnimales = sc.nextInt();

		// Le pedimos al usuario que introduzca la cantidad en kilos, la comida que come
		// cada animal
		System.out.print("Introduzca la cantiadad en kilos, la comida que come cada animal: ");
		kilosComida = sc.nextDouble();

		resultado = cantComida - (kilosComida * numAnimales); // Hacemos una simple cuenta para aviriguar el resultado

		// Si el resultado da positivo hay suficiente comida para los animales
		if (resultado > 0) {
			System.out.print("Hay suficiente comida para los animales.");

		} else { // Si no, no hay suficiente comida
			System.out.println("No hay suficiente comida para los animales.");
		}

		if (resultado < 0) { // En caso de que de negativo, s e realizara un simple cuenta para averiguar de
								// cuanto tiene que ser la ración
			System.out.print("La ración correcpondiente a cada animal sería: " + (cantComida / numAnimales)
					+ "kg de comida para cada animal.");
		}
		// Cerramos el Scanner
		sc.close();

	}

}
