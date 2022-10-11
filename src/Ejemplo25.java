import java.util.Scanner;
public class Ejemplo25 {
    public static void main(String[] args) {
        int numero;

        Scanner inputValue = new Scanner(System.in);
        System.out.println("Introduce un numero: ");
        numero = inputValue.nextInt();
        inputValue.close();

        for (int i = 1; i <= 10; i ++){
            System.out.println(numero + " * " + i + " = " + (i * numero));
        }
    }
}