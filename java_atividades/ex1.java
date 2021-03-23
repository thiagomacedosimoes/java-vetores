package java_ativiades;

import java.util.Scanner;

public class ex1 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner (System.in);
		
		int[] vetorA = { 8, 10, 2, 6, 15};
		
		int x;
		
		for(int i = 0; i < vetorA.length; i++) {
			
			for(int j = 0; j < vetorA.length - 1; j++) {
				
				if(vetorA[j] > vetorA[j+1]){
					
					x = vetorA[j];
					vetorA[j] = vetorA[j+1];
					vetorA[j+1] = x;
				}
			}
				
		}
		
		int r = 0;
		
		while(r < vetorA.length) {
			
		System.out.print(vetorA[r] + ", ");
		r++;
		
		}
		
		
	}

}
