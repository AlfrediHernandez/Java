import java.util.Scanner;
public class Tablas{
	public static void main(String [] ar){
		Scanner sc = new Scanner(System.in);
		int tab,r;

		system.out.println("Ingrese la tabla que desea ver:");
			tab = sc.nextInt();
			for(int a=1; a<=9; a++){
				r = tab * a;
				System.out.println(tab + " X " + a + " = "+r);
		}
		System.out.println("                                  ");
		System.out.println("**********************************");
		System.out.println("*  AlfrediHernandez 30-ago-2020  *");
		System.out.println("**********************************");
	}
}