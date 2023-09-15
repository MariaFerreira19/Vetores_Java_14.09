package POO;
import java.util.Scanner;
public class Vetor5 {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int v[] = new int[6];
		int i, contpar = 0, contimpar = 0;
		//Rotina de Leitura
		System.out.println("Carregando o vetor de 6 inteiros");
		for(i = 0;i < v.length;i++) {
			System.out.println("Digite v["+i+"]:");
			v[i] = ent.nextInt();
			if(v[i] % 2 == 0) { contpar++;}
			else { contimpar++; }
		}
		//Rotina de Impressão
		System.out.println("Impressão do vetor na tela....");
		for(i=0;i<v.length;i++) {
			System.out.printf("%4d",v[i]);
		}
		System.out.println("\n\nClassificação de Pares e Ímpares");
		if(contpar > 0) {
			System.out.println("\n\nExistem " + contpar + " pares, no vetor:");
			for(i = 0;i < v.length;i++) {
				if(v[i] % 2 == 0) { System.out.printf("%4d",v[i]);}
			}			
		}
		else { System.out.println("\nNão foram digitados pares!"); }
		if(contimpar > 0) {
			System.out.println("\nExistem " + contimpar + " ímpares, no vetor:");
			for(i = 0;i < v.length;i++) {
				if(v[i] % 2 == 1) { System.out.printf("%4d",v[i]);}
			}			
		}
		else { System.out.println("\nNão foram digitados ímpares!"); }
	}
}
