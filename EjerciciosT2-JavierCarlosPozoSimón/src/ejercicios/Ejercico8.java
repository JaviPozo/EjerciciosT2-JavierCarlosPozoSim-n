package ejercicios;

import java.util.Scanner;

public class Ejercico8 {

	public static void main(String[] args) {
		// Definimos las variables
		int dist, est; // Estas variables es para identificar la estancia del usuario y para la
						// distancia realizada
		final double precio = 2.5; // Es el precio por kilometro
		double descuento, total; // Indica el descuento por si la distancia es mayor a 80 KM y el total

		// Creamos el Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);

		// Pedimos al usuario la distancia que va a realizar
		System.out.print("Introduzca la disctancia que va a recorrer en el viaje: ");
		dist = sc.nextInt();

		// Pedimos al usuario la estancia que va a realizar
		System.out.print("¿Cuantos dias vas a instanciarte?: ");
		est = sc.nextInt();

		// Calculamos el precio total del trayecto
		total = dist * precio;

		// Si la distancia es mayor a 800 y la estancia mayor a 7 calculamos un 30% de
		// descuento respecto al total
		if (dist > 800 && est > 7) {
			descuento = total * 0.3;
			
			// Le restamos el descuento al total
			total -= descuento;
			System.out.println("Ya que la distancia del viaje es mayor a 800km y la estancia mayor a 7 dias, se ha realizado un 30% de descuento.\n El total de su viaje es: "
					+ total);
			
			// Mostramos el total del viaje con el descuento ya efectuado
		} else { // Si no, el precio total no cambiaria
			System.out.printf("El total del viaje es: %.2f", total);
		}

		// Cerramos el escaner
		sc.close();

	}

}
