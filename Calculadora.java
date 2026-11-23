import java.util.Scanner;

public class Calculadora {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer numero (-99999 a 99999): ");
        int a = sc.nextInt();
        System.out.print("Introduce el segundo numero (-99999 a 99999): ");
        int b = sc.nextInt();

        if (a < -99999 || a > 99999 || b < -99999 || b > 99999) {
            System.out.println("Error: Los numeros deben estar entre -99999 y 99999.");
        } else {
            System.out.println("Suma: " + (a + b));
            System.out.println("Resta: " + (a - b));
            System.out.println("Multiplicacion: " + (a * b));
            System.out.println("Potencia: " + Math.pow(a, b));
        }
        sc.close();
    }
}