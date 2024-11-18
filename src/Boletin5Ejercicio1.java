import java.util.Scanner;
public class Boletin5Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try ( // TODO code application logic here
              Scanner scanner = new Scanner(System.in)) {
            int cantidadNegativos = 0;
            int cantidadPositivos = 0;
            int cantidadCeros = 0;
            // Solicitar 10 números enteros al usuario
            System.out.println("Introduce 10 números enteros:");
            for (int i = 0; i < 10; i++) {
                int numero = scanner.nextInt();

                // Clasificar el número
                if (numero < 0)
                    cantidadNegativos++;
                if (numero > 0)
                    cantidadPositivos++;

                if ( numero==0) cantidadCeros++;

            }   // Mostrar los resultados
            System.out.println("Cantidad de números negativos: " + cantidadNegativos);
            System.out.println("Cantidad de números positivos: " + cantidadPositivos);
            System.out.println("Cantidad de ceros: " + cantidadCeros);
            // Cerrar el scanner
        }
    }
}