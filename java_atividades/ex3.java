package java_ativiades;

import java.util.Scanner;

public class ex3 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int vetorA[] = new int [5];
		int vetorB[] = new int [5];
		
		for(int i = 0; i < vetorA.length; i++) {
			System.out.print("Digite os valores do vetor A: ");
			vetorA[i] = entrada.nextInt();
		}
		
		for(int i = 0; i < vetorB.length; i++) {
			vetorB[i] = (int) Math.pow(vetorA[i], 2);
		}
		
		System.out.print("Os valores do vetor A elevado a 2 é: ");
		
		for(int i = 0; i < vetorB.length; i++) {
			System.out.print(vetorB[i] + " ");
		}
		

	}

}
