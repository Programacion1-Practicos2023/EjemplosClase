package consola;


public class Recursion2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(g(5));
		
		System.out.println(h(4));
		
		System.out.println(sumando(4));

	}
public static int g (int n) {
	if (n == 0) {
		return 0;
	}else {
		return n + g(n-1);
	}

}
public static int h (int n) {
	 if (n == 2) {
		 return 2;
	 }else {
		 return 2 * h(n-1);
	 }

             
}
public static int sumando (int n) {
	if (n == 1) {
		return 1;
	}else {
		return n + sumando(n-1);
	}
}
}
