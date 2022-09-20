package testAlgoritmico;

import java.util.Scanner;

public class algoritmos {

	static Scanner scan = new Scanner(System.in);
	static Scanner sc = new Scanner(System.in);

	public static void parImpar() {
		int numero = 0;
		System.out.println("Introduce un numero");
		numero = scan.nextInt();
		int nFin = numero % 2 == 0 ? 0 : 1;
		for (int i = numero; i >= nFin; i -= 2) {
			System.out.println(i);
		}

	}

	public static void clasificacion() {

		Persona[] personas = new Persona[50];

		int pTotales = 0;
		while (pTotales <= 49) {
			int edad = 0;
			System.out.println("Introduce edad");
			edad = scan.nextInt();
			String sexo = "";
			System.out.println("Introduce sexo (masculino, femenino)");
			sexo = scan.next().toLowerCase();
			personas[pTotales] = new Persona(edad, sexo);
			pTotales++;
			System.out.println("Persona registrada con exito (" + pTotales + " en total)");
		}
		int mayoresEdad = 0;
		int mayoresEdadMasculino = 0;

		int menoresEdad = 0;
		int mujeres = 0;
		int menoresEdadFemenino = 0;
		for (int i = 0; i < personas.length; i++) {

			if (personas[i].getSexo().equals("femenino")) {
				mujeres++;
			}

			if (personas[i].getEdad() >= 18) {
				mayoresEdad++;

				if (personas[i].getSexo().equals("masculino")) {
					mayoresEdadMasculino++;
				}

			} else {
				menoresEdad++;

				if (personas[i].getSexo().equals("femenino")) {
					menoresEdadFemenino++;

				}
			}

		}
		double porcentajeMayoresEdad = (double) ((mayoresEdad * 100) / personas.length);
		double porcentajeMujeres = (double) ((mujeres * 100) / personas.length);
		System.out.println("Cantidad de personas mayores de edad (18 años o más): " + mayoresEdad);
		System.out.println("Cantidad de personas menores de edad: " + menoresEdad);
		System.out.println("Cantidad de personas masculinas mayores de edad: " + mayoresEdadMasculino);
		System.out.println("Cantidad de personas femeninas menores de edad: " + menoresEdadFemenino);
		System.out.println("Porcentaje que representan las personas mayores de edad respecto al total de personas: "
				+ porcentajeMayoresEdad + "%");
		System.out.println(
				"Porcentaje que representan las mujeres respecto al total de personas: " + porcentajeMujeres + "%");

	}

	public static void calcularSueldo() {
		String instruccion = "";
		int horasTrabajadas = 0;
		float tarifa = 0;
		while ((horasTrabajadas == 0) || (tarifa == 0)) {
			System.out.println("Que desea: leer horas trabajadas / leer tarifa");
			instruccion = sc.nextLine().toUpperCase();

			switch (instruccion) {
			case "LEER HORAS TRABAJADAS":

				System.out.println("Introduce horas trabajadas");
				horasTrabajadas = scan.nextInt();
				break;
			case "LEER TARIFA":
				System.out.println(
						"Introduce tarifa (en caso de ser decimal escriba , para indicar los decimales, ej: 12,3)");
				tarifa = scan.nextFloat();
			}
		}

		float sueldo = 0;
		sueldo = tarifa * horasTrabajadas;
		if (horasTrabajadas > 40) {
			float extras = horasTrabajadas - 40;
			extras = extras * (tarifa / 2);
			sueldo = sueldo + extras;
		}
		System.out.println(sueldo + "€ semanales");
		System.out.println(sueldo * 4 + "€ mensuales(30 dias)");
	}

	public static void main(String[] args) {

		String instruccion = "";
		System.out.println("Introduce instruccion");
		System.out.println("1- Leer numero\n" + "2- Leer personas\n" + "3- Leer sueldo");
		instruccion = scan.nextLine().toUpperCase();

		switch (instruccion) {
		case "LEER NUMERO":
			parImpar();
			break;
		case "LEER PERSONAS":
			clasificacion();
			break;
		case "LEER SUELDO":
			calcularSueldo();
			break;
		}

	}
}
