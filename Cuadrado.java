import java.util.Scanner;
public class Cuadrado{
	public static void main(String [] ar){
		Scanner sc = new Scanner(System.in);
		int tam;
		System.out.println("==============================================");
		System.out.println("=                  CUADRADOS                 =");
		System.out.println("==============================================");
		System.out.println("Ingrese un Numero para el tamano del Cuadrado:");
			tam = sc.nextInt();
			for(int a=1; a<=tam; a++){
				for(int b=1; b<=tam; b++){
					if(b==1|| b==tam|| a==1|| a==tam){
						System.out.print("P  ");
					}else{
						System.out.print("   ");
					}
				}
				System.out.println("");
			}
			System.out.println("                                         ");
			System.out.println("=========================================");
			System.out.println("=      Alfredi Hernandez 01-sep-2020    =");
			System.out.println("=========================================");
	}
}