import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Ingresa tu nombre:");
        String nombre = scan.nextLine();

        int edad = 0;
        boolean edadInputFlag = false;
        int reintentos = 0;
        do {
            try {
                System.out.println("Ingresa tu edad:");
                String edadInput = scan.nextLine();
                edad = Integer.parseInt(edadInput);
                edadInputFlag = true;
            } catch (NumberFormatException exception) {
                System.out.println("Hay un error al leer la edad. Verifica que este en un formato correcto.");
            } catch (Exception exception) {
                System.out.println("Hay un error al leer la edad. Verifica que este en un formato correcto.");
                reintentos++;
                if (reintentos >= 5) {
                    edadInputFlag = true;
                }
            }finally{
                System.out.println("Entre al Finally");
            }
        } while (!edadInputFlag);

        if (edad == 0) {
            System.out.println("Ingresaste una edad erronea");
        } else {
            System.out.println("Tu nombre es: " + nombre + " y tu edad es: " + edad);
        }
    }
}
