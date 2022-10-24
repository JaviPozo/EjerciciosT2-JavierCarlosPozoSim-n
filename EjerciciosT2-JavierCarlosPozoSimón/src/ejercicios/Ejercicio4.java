package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// Derivamos las variables
		int num;
		int unidades;
		int decenas;
		int cifras = 0;
		String cadenaNum1 = "";
		String cadenaNum2 = "";

		// Creamos el Scanner para que pueda leer el teclado
		Scanner sc = new Scanner(System.in);

		// Le pedimos al usuario que introduzca un número entero entre 0 y 99
		System.out.print("Introduzca un número entre 0 y 99");
		num = sc.nextInt();

		if (num < 0 || num >= 100) {
			System.out.print("El número introducido no es correcto");
		} else {

			if (num > 0 && num < 10) {
				cifras = 1;
			}
			if (num >= 0 && num < 100) {
				cifras = 2;
			}

			unidades = num % 10;
			decenas = num / 10;

			if (num % 10 == 0) {
				if (decenas == 1) {
					cadenaNum1 = "diez";
				} else if (decenas == 2) {
					cadenaNum1 = "veinte";
				} else if (decenas == 3) {
					cadenaNum1 = "treinte";
				} else if (decenas == 4) {
					cadenaNum1 = "cuarenta";
				} else if (decenas == 5) {
					cadenaNum1 = "cincuenta";
				} else if (decenas == 6) {
					cadenaNum1 = "sesenta";
				} else if (decenas == 7) {
					cadenaNum1 = "setenta";
				} else if (decenas == 8) {
					cadenaNum1 = "ochenta";
				} else if (decenas == 9) {
					cadenaNum1 = "noventa";
				}

				else {
					cadenaNum1 = switch (unidades) {
					case 1 -> {
						yield "uno";
					}
					case 2 -> {
						yield "dos";
					}
					case 3 -> {
						yield "tres";
					}
					case 4 -> {
						yield "cuatro";
					}
					case 5 -> {
						yield "cinco";
					}
					case 6 -> {
						yield "seis";
					}
					case 7 -> {
						yield "siete";
					}
					case 8 -> {
						yield "ocho";
					}
					case 9 -> {
						yield "nueve";
					}
					default -> {
						yield "";
					}
					};
					
					cadenaNum2 = switch(decenas) {
					case 2 -> {
						yield "veinti";
					}
					case 3 -> {
						yield "veinti";
					}
					case 4  -> {
						yield "veinti";
					}
					case 5 -> {
						yield "veinti";
					}
					case 6 -> {
						yield "veinti";
					}
					case 7 -> {
						yield "veinti";
					}
					case 8 -> {
						yield "ochenti";
					}
					case 9 -> {
						yield "noventi";
					}
					default ->{
						yield "";
					}
					};
				}
			}
		}
		sc.close();

	}
}
