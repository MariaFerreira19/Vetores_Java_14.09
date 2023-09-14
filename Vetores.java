package poo;
import java.util.Scanner;
public class Vetores {

	public static void main(String[] args) {
//Declaração de um vetor "V" como objeto
		Scanner ent = new Scanner(System.in);
		int v[] = new int[10];
		int i;
		System.out.println("Vetor de dez inteiros");
//Rotina de leitura
		System.out.println("Carregando o vetor...");
		for(i=0; i<v.length; i++) {
			System.out.println("Digite V[" +i+ "]:");
			v[i] = ent.nextInt();
		}
		//Rotina de impressão
		System.out.println("Impressão de vetor na tela:");
	for(i=0; i<v.length; i++) {
		System.out.printf("%4d", v[i]);
		}

	}

}
