package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// Definimos las variables
		int numero; // Es el número que le pedimos al usuario
		int cifra1; // Es la primera cifra del número
		int cifra2; // Es la segunda cifra del número
		int cifra3; // Es la tercera cifra del número
		int cifra4; // Es la cuarta cifra del número

		// Creamos el Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número del 0 al 9999
		System.out.print("Introduzca un número comprendido entre el 0 y 9999: ");
		numero = sc.nextInt();

		// Comprobamos que esté entre esos números
		if (numero < 0 || numero > 10000) { // Si el número es menor que cero o mayor que 10000 no es valido dicho num
			System.out.println("El número no está en el rango");

		} else if (numero < 10) {// Si el número es menos que 10 es capicua
			System.out.println("El número es capicúa. ");

		} else if (numero >= 10 && numero < 100) { // Si el número tiene dos cifras
			cifra1 = (numero / 10); // Dvidimos entre 10 y sacamos la parte entera, que es la primera cifra
			cifra2 = numero % 10; // El resto al dividir entre 10 es el segundo número
			if (cifra1 == cifra2) { //Si las dos cifras son iguales el número es capicúa
				System.out.println("El numero es capicúa");
			} else { //Si no, no es capicúa
				System.out.println("El número no es capicúa");
			}
		} else if (numero >= 100 && numero < 1000) { // Si el número tiene tres cifras
			cifra1 = numero / 100; // Dvidimos entre 100 y sacamos la parte entera, que es la primera cifra
			cifra3 = numero % 10; // El resto al dividir entre 10 es el tercer número
			if (cifra1 == cifra3) { // Si la primera cifra y la tercera son iguales el número es capicúa
				System.out.println("El número es capicúa");
			} else { // Si no no es capicúa
				System.out.println("El número no es capicúa");
			}
		} else if (numero >= 1000 && numero < 10000) {  // Si el número tiene cuatro cifras
			cifra1 = numero / 1000; //Dividimos entre 1000 y sacamos la parte entera, que es la primera cifra
			cifra2 = (numero / 100) % 10; //Dividimos entre 100 y sacamos la parte entera y esa parte entera le hacemos el modulo de 10 y nos dará la segunda cifra
			cifra3 = (numero / 10) % 10; //Dividimos entre 10 y sacamos la parte entera y esa parte entera le hacemos el modulo de 10 y nos dará la tercera cifra
			cifra4 = numero % 10;
			if (cifra1 == cifra4 && cifra2 == cifra3) { //Si la primera y cuarta cifra y la sgunda y tercera cifra son iguales, es un numero capicua
				System.out.println("El número es capicúo"); 

			} else { // Si no no es capicúa
				System.out.println("No es capicúa");
			}

		}
		// Cerramos el Scanner
		sc.close();
	}
}
