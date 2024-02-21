package retoUD5;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {

		/*
		 * (Clases ObjectOutputStream/ObjectInputStream
		 * FileInputStream/FileOutputStream) Consiste en crear una clase llamada
		 * Ejercicio3.java y allí desarrollar un programa que creará y almacenará en el
		 * fichero “tres.dat” (fichero binario) los números positivos que se
		 * introducirán por consola, hasta que se introduzca uno negativo (que indicará
		 * el fin de introducción de datos). Utiliza las clases indicadas y maneja las
		 * excepciones necesarias. Utiliza los métodos que creas necesarios para agrupar
		 * código y hacer llamadas a dichos métodos desde el main.
		 */

		String fichero = "tres.dat";

		String directorioActual = System.getProperty("user.dir");

		String directorioFinal = directorioActual + File.separator + fichero;

		File archivo = new File(directorioFinal);

		try {
			if (!archivo.exists()) {
				archivo.createNewFile();
			}
		} catch (IOException e) {
			System.out.println("No se ha podido crear el archivo");
			e.getMessage();
			e.printStackTrace();
		}

		escribirEnArchivo(archivo);

	}

	public static void escribirEnArchivo(File archivo)

	{
		try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(archivo))) {
			Scanner sc = new Scanner(System.in);
			int n;
			System.out.println("Introduce números positivos a tu gusto,\n"
					+ "Cuando quieras termina introduce un número negativo");

			do {
				n = sc.nextInt();
				if (n > 0) {
					oos.writeInt(n);
				}

			} while (n > 0);

			System.out.println("Los numeros se han escrito correctamente");

		} catch (IOException e) {

			System.out.println("Error al escribir en el archivo");
			e.printStackTrace();
		}

	}

}
