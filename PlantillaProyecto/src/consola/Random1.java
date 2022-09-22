package consola;

import java.util.Random;

class Random1 {
	public static void main(String[] args) {
		Random azar = new Random();
		// 0 es cara y 1 es número
		int moneda = azar.nextInt(2);
		System.out.println("Tirada de la moneda: " + moneda);

		int dado = 1 + azar.nextInt(6);
		System.out.println("Tirada del dado: " + dado);

	}
}
