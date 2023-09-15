package POO;

import java.util.Scanner;
public class Vetor6 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		//Declaração de um vetor v, como objeto
		int v[] = new int[10];
		int i;
		System.out.println("Vetor de 10 inteiros");
		//Rotina de Leitura
		System.out.println("Carregando o vetor....");
		for(i=0;i<v.length;i++) {
			System.out.println("Digite v["+i+"]:");
			v[i] = ent.nextInt();
		}
		//Rotina de Impressão
		System.out.println("Impressão do vetor na tela....");
		for(i=0;i<v.length;i++) {
			System.out.printf("%4d",v[i]);
		}
		System.out.println("\n\nImpressão do vetor invertido, na tela....");
		for(i = v.length - 1; i >= 0; i--) {
			System.out.printf("%4d",v[i]);
		}
	}
}
