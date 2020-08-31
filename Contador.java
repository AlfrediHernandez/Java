import java.util.*;
public class Contador{
	public static void main(String [] ar){
		Scanner sc = new Scanner(System.in);
		int cont;
		System.out.println("======================================");
		System.out.println("=              CONTADORES            =");
		System.out.println("======================================");
		System.out.println("Ingrese un Numero para el Contador:");
			cont = sc.nextInt();
			for(int a=1; a<=cont; a++){
				System.out.println("Contando...  "+a);
		}
		System.out.println("                                       ");
		System.out.println("=======================================");
		System.out.println("=     AlfrediHernandez 31-ago-2020    =");
		System.out.println("=======================================");
	}
}