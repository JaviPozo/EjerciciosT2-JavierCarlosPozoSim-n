package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// Definimos las variables
		int horas; // La variable horas es para indicar el número de hpras intoducidas por el
					// usuario
		int minutos; // La variable minutos es para indicar el número de minutos intoducidos por el
						// usuario
		int segundos; // La variable segundos es para indicar el número de segundos intoducidos por el
						// usuario

		// Creamos un Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca la hora, los mitos y los segundos
		System.out.print("Horas: ");
		horas = sc.nextInt();

		System.out.print("Minutos: ");
		minutos = sc.nextInt();

		System.out.print("Segundos: ");
		segundos = sc.nextInt();

		// Le sumamos 1 a los segundos
		segundos++;

		// Si las horas son >24, los minutos > 61 o los segundos > 61, no es valido
		if (horas > 24 || minutos > 61 || segundos > 61) {

			System.out.println("El número introducido no es valido");

		} else { // Si no, comprobamos los siguientes casos

			if (segundos == 60) { // Si los segundos son 60
				minutos++; // Sumamos 1 minuto
				segundos = 0;
			}
			// Si los minutos son 60
			if (minutos == 60) {
				horas++; // Aumentamos una hora
				minutos = 0;
			}
			// Si la hora es igual a 24
			if (horas == 24) {
				horas = 0;
			}

			// Mostramos las horas los minutos y los segundos con lo que pedía el ejercicio
			System.out.printf("%d:%d.%d", horas, minutos, segundos);
		}

		// Cerramos el escaner
		sc.close();

	}

}
