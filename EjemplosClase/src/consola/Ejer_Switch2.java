package consola;

import java.util.Scanner;

public class Ejer_Switch2 {
//Mundiales_de_futbol
	
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int year;
        
        do {
            System.out.println("Ingrese un a�o de mundial, para visualizar"
                    + " el año donde se realizó. Ingrese 0 para salir");
            year = teclado.nextInt();
            if (year != 0) {
                switch (year) {
                    case 1930:
                        System.out.println("Uruguay");
                        break;
                    case 1934:
                            System.out.println("Italia");
                    		break;
                    case 1998:
                        System.out.println("Francia");
                    	break;
                    case 2014:
                        System.out.println("Brasil");
                    	break;
                    case 1954:
                        System.out.println("Suiza");
                        break;   
                    case 1958:
                        System.out.println("Suecia");
                        break; 
                    case 1962:
                        System.out.println("Chile");
                        break;  
                    case 1966:
                        System.out.println("Inglaterra");
                        break; 
                    case 1986:
                        System.out.println("México");
                    	break;
                    case  2006:
                        System.out.println("Alemania");
                    	break;
                    case 1978:
                        System.out.println("Argentina");
                        break;
                    case 1982:
                        System.out.println("España");
                        break; 
                    case 1994:
                        System.out.println("Estados Unidos");
                        break;
                    case 2002:
                        System.out.println("Corea/Japón");
                        break;
                    case 2010:
                        System.out.println("Sudáfrica");
                        break;
                    default:
                        System.out.println("No fue año de mundial, ingrese"
                        		+ " un año válido");
                    	if(year<1930 || year>2014)
                    		System.out.println("El rango de mundiales para "
                    				+ "esta versión es de 1930 a 2014");
                }
           }
        } 
        while (year != 0);
        teclado.close();
    }
}