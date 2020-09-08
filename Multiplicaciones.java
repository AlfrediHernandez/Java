import java.util.Scanner;
public class Multiplicaciones{
	public static void main(String [] ar){
		Scanner sc = new Scanner(System.in);
		int a,b,r;
		System.out.println("******************************************");
		System.out.println("*            MULTIPLICACIONES            *");
		System.out.println("******************************************");
		System.out.print("Ingrese a:	");
			a = sc.nextInt();
		System.out.print("Ingrese b:	");
			b = sc.nextInt();
			r = a * b;
		System.out.println("             --------");
		System.out.println("Resultado:	"+r);
			System.out.println("                                      ");
			System.out.println("**************************************");
			System.out.println("*    Alfredi Hernandez 8-sep-2020    *");
			System.out.println("**************************************");
	}
}