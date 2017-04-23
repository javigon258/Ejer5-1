/*
 * 
 */
import java.util.Scanner;
// TODO: Auto-generated Javadoc

/**
 * The Class StartApp.
 */
public class StartApp {

	/**
	 * The main method.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner input = new Scanner(System.in);
		int opcion = -1;
		
		Hipoteca h = new Hipoteca();
		do{
			System.out.println("1.Introducir datos");
			System.out.println("2.Mostrar cuota");
			System.out.println("3.Cuadro amortizacion");
			System.out.println("4.Viabilidad");
			System.out.println("0.Salir del programa");
			System.out.println("");

			System.out.print("Introduzca opcion: ");

			
			opcion = input.nextInt();
			
			switch(opcion){
			case 1:
				System.out.println("Datos de cuota");
				opcion = input.nextInt();
				break;
			case 2:
				System.out.println("Mostrar cuota");
				opcion = input.nextInt();
				break;
			case 3:
				System.out.println("Mostrar cuadro amortizacion");
				opcion = input.nextInt();
				break;
			case 4:
				System.out.println("Cuadro de viabilidad");
				opcion = input.nextInt();
				break;
			case 0:
				System.out.println("Ha cerrado el programa");
				opcion = input.nextInt();
				break;
			default:
				System.out.println("Opcion no valida");
				break;
			}
			
		}while(opcion!=0);
	
	}

}
