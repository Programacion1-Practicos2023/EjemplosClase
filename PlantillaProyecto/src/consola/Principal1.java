package consola;
import java.util.Scanner;

public class Principal1 {


	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		double a, area;

		System.out.println("Ingrese el lado:");
		a = teclado.nextInt();
		area = a * a;
		System.out.println("El área del cuadrado es: " + area);
	}// fin del main
}// fin de la clase
