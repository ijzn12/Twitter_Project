import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        // Iniciar cronómetro
        long startTime = System.currentTimeMillis();

        String k, j = " ", u;
        int edad;
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingresar un nombre");
        k = sc.next();
        System.out.println("Ingresar edad ");
        edad = sc.nextInt();
        System.out.println("Ingresar una clave");
        u = sc.next();
        System.out.println("Presionar enter ");
        sc.nextLine();
        if (k.equalsIgnoreCase("Jklx")) {
            j = "gay";
        } else {
            j = "hombre";
        }
        System.out.println("El nombre es: " + k);
        System.out.println(j);
        System.out.println("la clave: " + u);
        System.out.println("la edad ingresada es: " + edad);

        // Detener cronómetro y calcular tiempo transcurrido
        long endTime = System.currentTimeMillis();
        long elapsedTime = endTime - startTime;

        // Mostrar mensaje con el tiempo usado
        System.out.println("Tiempo de ejecución: " + elapsedTime + " milisegundos.");
    }
}
