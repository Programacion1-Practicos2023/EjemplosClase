/* Ejercicio propuesto en Métodos discretos para coordinar con programación Array y funciones y procedimientos.
  Link a la letra del ejercicio: https://drive.google.com/file/d/1n9JqNrYwIl2PGq4sEJdQ6h70e_XEdzxo/view?usp=sharing */


package consola;
import java.util.Random;

public class Ejer_Array {

	public static void main(String[] args) {
		int juego[]=new int[50];
		
		cargarJuego(juego);
		mostrarJuego(juego);
		contarTodas(juego);
	}
	
	//metodo tirarDado
	public static int tirarDado() {
		Random azar=new Random();
		
		int dado=1+azar.nextInt(6);
		return dado;	
	}
	
	//cargar el array con numeros al azar
	public static void cargarJuego(int array1[]) {
		
		for(int i=0; i<50; i++) {
			array1[i]=tirarDado();
		}
	}
		
	
	public static void mostrarJuego(int array1[]) {
			
		for(int i=0; i<50; i++) {
			System.out.println(array1[i]);			
		}
	}
	
	public static int contarRepeticiones(int array1[], int nro) {
		int total=0;
		
		for(int i=0; i<50; i++) {
			if(array1[i]==nro)
				total++;
		}
		return total;
	}
	
	public static void contarTodas(int array1[]) {
		int total1=0;
		int total2=0;
		int total3=0;
		int total4=0;
		int total5=0;
		int total6=0;
		
		for(int i=0; i<50;i++) {
			if(array1[i]==1)
				total1++;
			if(array1[i]==2)
				total2++;
			if(array1[i]==3)
				total3++;
			if(array1[i]==4)
				total4++;
			if(array1[i]==5)
				total5++;
			if(array1[i]==6)
				total6++;					
		}
		System.out.println("El 1 salió: "+total1);
		System.out.println("El 2 salió: "+total2);
		System.out.println("El 3 salió: "+total3);
		System.out.println("El 4 salió: "+total4);
		System.out.println("El 5 salió: "+total5);
		System.out.println("El 6 salió: "+total6);
		
	}
	
	
	
	

}
