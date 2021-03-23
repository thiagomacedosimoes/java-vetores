package java_ativiades;

import java.util.Arrays;
import java.util.Scanner;

public class ex4 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String nomes[] = new String [5];
		
		for(int i = 0; i < nomes.length; i++) {
			System.out.print("Nome: ");
			nomes[i] = entrada.nextLine();
		}
		
		Arrays.sort(nomes); //método de ordenação de string
		
		for (int i = 0; i < nomes.length; i++) {
			System.out.print(nomes[i]);
		}
		

	}

}
