package ejemplosTemario;

import java.io.File;

public class Dir {

	public static void main(String[] args) {
		
		
		System.out.println("Archivos en el directorio actual: ");
		File ficheros = new File("/Users/yummy/desktop");
		String[] archivos = ficheros.list();
		for(int i=0; i<archivos.length; i++)
		{
			System.out.println(archivos[i]);
		}
		
		
	}

}
