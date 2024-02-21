package ejemplosTemario;

/**
 * BuffStdin.java
 *
 * Ejemplo de la lectura de la entrada estándar utilizando la clase java.io.BufferedReader, se realizan
 * algunas operaciones aritméticas sencillas con los valores introducidos por el usuario.
 */
 
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
 
/**
 *
 * @author Dark[byte]
 */
class BuffStdin {
 
    private static InputStreamReader isr;
    private static BufferedReader br;
 
    /**
     * Punto de entrada del programa.
     *
     * Se construyen los recursos necesarios para leer desde la entrada estándar, se muestra
     * el menú de opciones y se inicia el bucle del programa.
     *
     * @param args argumentos de la linea de comandos.
     * @throws IOException si hay un fallo en la entrada\salida del flujo de datos.
     */
    public static void main(String[] args) throws IOException {
        isr = new InputStreamReader(System.in);
 
        br = new BufferedReader(isr);
 
        menu();
 
        loop();
    }
 
    /**
     * Muestra el menú de opciones
     */
    private static void menu() {
        System.out.println("-------------------------\n"
                + "Elige una opcion:\n"
                + "[a]- SUMAR\n"
                + "[b]- RESTAR\n"
                + "[c]- MULTIPLICAR\n"
                + "[d]- DIVIDIR\n"
                + "-\n"
                + "[m]- Muestra este menu\n"
                + "[x]- Sale del programa\n");
    }
 
    /**
     * Bucle del programa. Se mantiene en espera de la introducción de datos
     * desde la entrada estándar. Finaliza si se detecta "x".
     *
     * @throws IOException si hay un fallo en la entrada\salida del flujo de datos.
     */
    private static void loop() throws IOException {
        String s = "";
 
        while (true) {
            s = br.readLine();
 
            try {
                if (s.equalsIgnoreCase("a") == true) {
                    suma();
                } else if (s.equalsIgnoreCase("b") == true) {
                    resta();
                } else if (s.equalsIgnoreCase("c") == true) {
                    multiplica();
                } else if (s.equalsIgnoreCase("d") == true) {
                    divide();
                } else if (s.equalsIgnoreCase("m") == true) {
                    menu();
                } else if (s.equalsIgnoreCase("x") == true) {
                    break;
                } else {
                    System.out.println("Opcion desconocida. Escribe \"m\" para ver el menu de opciones");
                }
            } catch (NumberFormatException nfe) {
                System.out.println("Valor invalido: " + nfe.getLocalizedMessage() + "\n-------------------------\n");
            }
        }
    }
 
    /**
     * Realiza la suma de dos valores.
     *
     * @throws IOException si hay un fallo en la entrada\salida del flujo de datos.
     * @throws NumberFormatException si se introduce un valor invalido.
     */
    private static void suma() throws IOException, NumberFormatException {
        int i1, i2, res;
 
        System.out.println("Introduce un valor:");
        i1 = Integer.parseInt(br.readLine());
 
        System.out.println("Introduce otro valor:");
        i2 = Integer.parseInt(br.readLine());
 
        res = i1 + i2;
        System.out.println("Resultado de la suma: " + res + "\n-------------------------\n");
    }
 
    /**
     * Realiza la resta de dos valores.
     *
     * @throws IOException si hay un fallo en la entrada\salida del flujo de datos.
     * @throws NumberFormatException si se introduce un valor invalido.
     */
    private static void resta() throws IOException, NumberFormatException {
        int i1, i2, res;
 
        System.out.println("Introduce un valor:");
        i1 = Integer.parseInt(br.readLine());
 
        System.out.println("Introduce otro valor:");
        i2 = Integer.parseInt(br.readLine());
 
        res = i1 - i2;
        System.out.println("Resultado de la resta: " + res + "\n-------------------------\n");
    }
 
    /**
     * Realiza la multiplicación de dos valores.
     *
     * @throws IOException si hay un fallo en la entrada\salida del flujo de datos.
     * @throws NumberFormatException si se introduce un valor invalido.
     */
    private static void multiplica() throws IOException, NumberFormatException {
        int i1, i2, res;
 
        System.out.println("Introduce un valor:");
        i1 = Integer.parseInt(br.readLine());
 
        System.out.println("Introduce otro valor:");
        i2 = Integer.parseInt(br.readLine());
 
        res = i1 * i2;
        System.out.println("Resultado de la multiplicacion: " + res + "\n-------------------------\n");
    }
 
    /**
     * Realiza la división de dos valores.
     *
     * @throws IOException si hay un fallo en la entrada\salida del flujo de datos.
     * @throws NumberFormatException si se introduce un valor invalido.
     */
    private static void divide() throws IOException, NumberFormatException {
        float i1, i2, res;
 
        System.out.println("Introduce un valor:");
        i1 = Float.parseFloat(br.readLine());
 
        System.out.println("Introduce otro valor:");
        i2 = Float.parseFloat(br.readLine());
 
        res = i1 / i2;
        System.out.println("Resultado de la division: " + res + "\n-------------------------\n");
    }
}