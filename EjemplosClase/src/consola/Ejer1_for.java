package consola;
import java.util.Random;
import java.util.Scanner;

public class Ejer1_for {

	public static void main(String[] args) {
		Random azar=new Random();
		Scanner teclado=new Scanner(System.in);
		int ganaMaq=0;
		int ganaUsu=0;
		for (int i=0; i<10;i++) {
			int dado=azar.nextInt(6)+1;
			System.out.println("Ingrese su predicci�n:");
			int prediccion=teclado.nextInt();
			
			if (dado==prediccion) 
				System.out.println("Ganas t�");
				
			else
				System.out.println("Gana la maquina");
			System.out.println("El dado vale: "+dado);
		
		}
	}

}