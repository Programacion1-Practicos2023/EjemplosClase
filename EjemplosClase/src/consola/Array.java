public class Array {

	public static void main(String[] args) {
		int arreglo[]=new int [10];
		int nro=1;
		
		//cargo el array con 1
		for(int i=0; i<10;i++) {
			arreglo[i]=nro;
		}
		
		//muestro el array
		for(int j=0; j<10;j++) {
			System.out.println(arreglo[j]);
		}
		
	}

}