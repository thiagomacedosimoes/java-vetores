package java_ativiades;

import java.util.Scanner;

public class ex5 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		String nomes[] = new String[5];
		
		for (int i = 0; i < nomes.length; i++) {
			
			System.out.print("Nome: ");
			nomes[i] = entrada.nextLine();
		}
		
		int x;
		
		System.out.println("Quer fazer uma consulta?: ");
		System.out.println("1 = Sim");
		System.out.println("2 = Não");
		x = entrada.nextInt();
		
		
		if(x == 1) {
			
			boolean aux = true;
			
			while(aux == true) {
				
				int y;
				
				for (int i = 0; i < nomes.length; i++) {
					System.out.println(nomes[i]);
				}
				
				System.out.println("Quer fazer a consulta denovo: ");
				System.out.println("1 = Sim");
				System.out.println("2 = Não");
				y = entrada.nextInt();
				
				if(y == 2) {
					System.out.println("Agradecemos a sua presença.");
					System.out.println("10 em pro kkk <3.");
					break;
				}	
				
			}
		
		}
		else {	
			System.out.println("Agradecemos a sua presença.");
		}
		
		
		
		

	}

}
