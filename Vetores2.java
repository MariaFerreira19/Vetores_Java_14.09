package poo;

import java.util.Scanner;
public class Vetores2 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int v[] = new int[12];
		int i;
		
	//Rotina de leitura
		System.out.println("Carregando o vetor de doze inteiros");
				for(i=0; i< v.length; i++) {
		System.out.println("Digite V[" +i+ "]:");
				v[i] = ent.nextInt();
				}		
	//Rotina de impressão
		System.out.println("Impressão de vetor na tela:");
		for(i=0; i<v.length; i++) {
			System.out.printf("%4d", v[i]);
		}
		System.out.println("\nClassificação de pares e ímpares:");
		for(i=0; i < v.length; i++) {
			if(v[i] % 2 == 0) {
				System.out.println(v[i] + " é par!");
			}
			else {
			System.out.println(v[i] + " é ímpar!");
			}
		}
	}
}

