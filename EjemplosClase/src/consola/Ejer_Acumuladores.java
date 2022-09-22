package consola;
import java.util.Scanner;

public class Ejer_Acumuladores {

	public static void main(String[] args) {
		Scanner teclado=new Scanner(System.in);
		double kilometros;
		double naftaTramo;
		double naftaGastada=0;
		
		System.out.println("Ingrese total de nafta en el tanque: ");
		double totalNafta=teclado.nextDouble();
		System.out.println("Ingrese rendimiento por litro de nafta: ");
		double rendimientoLitro=teclado.nextDouble();
		for(int i=1;i<=5;i++) {
			System.out.println("Ingrese  kilometros a pr�ximo destino: ");
			kilometros=teclado.nextDouble();
			naftaTramo=kilometros/rendimientoLitro;
			naftaGastada=naftaGastada+naftaTramo;
			System.out.println("Nafta gastada: "+naftaGastada);
			totalNafta=totalNafta-naftaGastada;
			System.out.println("Queda "+totalNafta+" litros de nafta");
		}
	
		
	}

}
