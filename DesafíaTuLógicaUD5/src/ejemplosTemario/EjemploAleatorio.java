package ejemplosTemario;
import java.io.IOException;
import java.io.*;

public class EjemploAleatorio {

	public static void main(String[] args) {
		
		RandomAccessFile rf= null;
		
		
		try {
			// Calcular los cuadrados, guardarlos en un archivo de acceso aleatorio y cerrar el archivo.
			
			
			rf = new RandomAccessFile("dobles.dat","rw");
			for (int i =0;i<10;i++)
			{
				rf.writeDouble(Math.sqrt(i));
			}
			rf.close();
		}
		catch(IOException e)
		{
			System.out.println("Error E/S parte 1:\n"+e.getMessage());
		}
		try
		{
			// Abrir el archivo recién creado, desplazar el puntero 40 bytes (5 double de 8 bytes cada uno),

				rf = new RandomAccessFile("dobles.dat", "rw");
				
				rf.seek(5*8); //Avanza el puntero 5 registros * 8 bytes
				
				System.out.println("\nPuntero antes de lectura: "+ rf.getFilePointer());
				
				//Leer el registro ubicado a partir del byte 40 (raíz cuadrada del número 5: 2,23...),
				
				System.out.println("Valor: "+ rf.readDouble());
				
				//Verificar el avance del puntero a 48 (avanzó un double en la lectura),
				
				System.out.println("Puntero después de lectura: "+rf.getFilePointer());
				
				rf.seek(rf.getFilePointer()-8); // Restaura el puntero a registro 6
				
				System.out.println("\nPuntero restaurado: "+rf.getFilePointer()+ "\n");
				
				//cambiar su valor por el número arbitrario 333.0003 y cerrar el archivo.
				
				rf.writeDouble(333.0003); //Cambia el registro 6 y avanza el puntero
				
				rf.close();
				
			
		}
		catch(IOException e)
		{
			System.out.println("Error E/S parte 2:\n"+e.getMessage());
		}
		
		try
		{
			// Abrir nuevamente el archivo, ahora en sólo lectura, y mostrar punteros y valores.

			rf = new RandomAccessFile("dobles.dat", "r");
			
			for(int i =0; i<10;i++)
			{
				System.out.println("\nPuntero en: "+rf.getFilePointer());
				
				System.out.println("Valor: "+rf.readDouble());
			}
			
			// Intentar escribir en el archivo de sólo lectura, lanzando y capturando la excepción.

			
			rf.writeDouble(1.1111); // Intento de escribir en el archivo de solo lectura
			rf.close();
			
			
			
			
		}
		catch(IOException e)
		{
			System.out.println("Error E/S parte 3:\n"+e.getMessage());
		}
		

	}

}
