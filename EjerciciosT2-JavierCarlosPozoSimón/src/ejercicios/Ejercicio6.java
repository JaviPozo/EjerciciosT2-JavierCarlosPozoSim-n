package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// Definimos las variables
		int num1, num2, resultado, resto;

		// Abrimos el escaner
		Scanner sc = new Scanner(System.in);

		// Sacamos los 2 numeros aleatorios
		num1 = (int) (Math.random() * 99);
		num2 = (int) (Math.random() * 99);

		// Pedimos la suma de los 2 numeros
		System.out.printf("¿Cuanto es %d+%d?", num1, num2);
		resultado = sc.nextInt();

		// Calculamos el resultado de la suma
		resto = num1 + num2;

		if (resto == resultado) { // Si el resultado dicho por el usuario es igual
			System.out.println("Enhorabuena sabes sumar, maquina");
		} else { // si no es igual no a adivinado
			System.out.println("Te quivocaste, vuelve a primaria");
		}

		// Cerramos el escaner
		sc.close();

	}

}
