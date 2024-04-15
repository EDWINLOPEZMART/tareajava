import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner lector = new Scanner(System.in);
        String nombre = lector.nextLine();

        System.out.println("Hola, " + nombre);
        
        lector.close();
    }
}
