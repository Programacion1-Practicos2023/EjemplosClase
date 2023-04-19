package consola;
import java.util.Scanner;//esto es para usar Scanner
/*aqui puedo escribir comentarios de varios renglones*/
 
public class Principal {

	public static void main(String[] args) {
		String nombre;
		int edad;
		Scanner teclado=new Scanner(System.in); //esto tiene que ir para usar Scanner
		System.out.println("¿Cómo te llamas?:");
		nombre=teclado.next();
		System.out.println("Hola " + nombre);
		System.out.println("¿Cuál es tú edad: ?");
		edad=teclado.nextInt();
		System.out.println("Tú tienes "+edad +" años");
		

	}

}