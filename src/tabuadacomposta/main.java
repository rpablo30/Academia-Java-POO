package tabuadacomposta;

import java.util.Locale;
import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Locale.setDefault(Locale.US);
		
		int n1 , n2 , resultado,valor;
		System.out.println("Digite a taboada que você quer: ");
		valor=teclado.nextInt();
		for ( int i=0 ; i<11;i++) {
			int res = valor*i;
			System.out.printf("%s x %s = %s%n",valor,i,res);
			
		}
		
	}

}
