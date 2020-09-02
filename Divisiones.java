import java.util.Scanner;
public class Divisiones{
	public static void main(String [] ar){
		Scanner sc = new Scanner(System.in);
		int a,b,r;
		System.out.println("====================================");
		System.out.println("=            DIVISIONES            =");
		System.out.println("====================================");
		System.out.print("Ingrese a:	");
			a = sc.nextInt();
		System.out.print("Ingrese b:	");
			b = sc.nextInt();
			r = a / b;
		System.out.println("            ----------");
		System.out.println("Resultado:	"+r);
		System.out.println("                                    ");
		System.out.println("====================================");
		System.out.println("=   AlfrediHernandez 02-sep-2020   =");
		System.out.println("====================================");
	}
}