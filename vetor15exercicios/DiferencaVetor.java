package listavetor;

import java.util.Scanner;
public class DiferencaVetor {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		int a[],b[],c[],i;
		final int TAM = 10;
		
		a = new int [TAM];
		b = new int [TAM];
		c = new int [TAM];
		
		for (i=0;i<TAM;i++){
			System.out.println("Escreva os n�meros do vetor A");
			a[i] = in.nextInt();
		}
		
		for (i=0;i<TAM;i++){
			System.out.println("\nEscreva os n�meros do vetor B");
			b[i] = in.nextInt();
			for (int g=0; g<TAM;g++){
				if (b[i]!=a[g]){
					c[i] = b[i];
				}
			}
		}
		System.out.print("Os valores de C vetor �: ");
		for (i=0;i<TAM;i++){
			if (c[i]==0){
				
			} else {
				System.out.print(c[i]+" ");
			}
		}
	}
}