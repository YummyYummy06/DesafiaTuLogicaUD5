package ejemplosTemario;

import java.io.File;
import java.io.IOException;

public class EjemploFichero1 {

	public static void main(String[] args) throws IOException  {
		
		File fichero = new File("ArchivoApp1.java");
		
		
		if(fichero.exists()){
		        System.out.println("Nombre del archivo "+fichero.getName());
		        System.out.println("Camino             "+fichero.getPath());
		        System.out.println("Camino absoluto    "+fichero.getAbsolutePath());
		        System.out.println("Se puede escribir  "+fichero.canRead());
		        System.out.println("Se puede leer      "+fichero.canWrite());
		        System.out.println("Tamaño             "+fichero.length());
		   }
		else
		{
			fichero.createNewFile();
		}
		fichero.delete(); // Esto lo pongo para que se borre y pueda ver el ejemplo de nuevo

	}

}
