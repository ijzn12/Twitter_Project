import java.util.Scanner;
public class App {
    public static void main(String[] args) throws Exception {
        String k,j=" ",u;
        int edad;
        Scanner sc=new Scanner(System.in);
        System.out.println("Ingresar un nombre");
        k=sc.next();
        System.out.println("Ingresar edad ");
        edad=sc.nextInt();
        System.out.println("Ingresar una clave");
        u=sc.next();
        System.out.println("Presionar enter ");
        sc.nextLine();
        if (k.equalsIgnoreCase("Jklx")) {
            j="gay";
        }
        else{
          j="hombre";  
        }
        System.out.println("El nombre es: "+k);
        System.out.println(j);
        System.out.println("la clave"+u);
        System.out.println("la edad ingresada es: "+edad );
    }
}
