package poo;
import java.util.Scanner;
public class Vetor3 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		float sal[] = new float[8];
		float sal_reaj[] = new float[8];
		int i;
		
	//Rotina de leitura
		System.out.println("Carregando o vetor de oito salários");
		for (i=0; i < sal.length; i++) {
			System.out.println("Digite o salário: ["+i+"]:");
			sal[i] = ent.nextFloat();
		}
		//Rotina de impressão
		System.out.println("Impressão salários originais:\n");
		for(i = 0; i < sal.length; i++) {
			System.out.printf("%.2f\n", sal[i]);
		}
		System.out.println("\nSalários reajustados em 12%:\n");
		for(i = 0; i < sal.length; i++) {
			System.out.printf("%.2f\n", sal[i] * 1.12);
		}
	}
}
