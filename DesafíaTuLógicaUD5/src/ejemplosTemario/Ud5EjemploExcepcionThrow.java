package ejemplosTemario;
public class Ud5EjemploExcepcionThrow {

     public static void main(String[] args) {



        try {

            int dividendo = 10;

            int divisor = 0;



           if (divisor == 0) {

              throw new ArithmeticException("No se puede dividir por cero.");

            }



            int resultado = dividendo / divisor;

            System.out.println("Resultado de la división: " +

 resultado);

          }catch (ArithmeticException e) {

             System.out.println("Error aritmético: " + e.getMessage());

          }

     }

}