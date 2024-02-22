/*Problema "diagonal_negativos"
 * Fazer um programa para ler um número inteiro N(máximo = 10) e uma matriz quadrada
 * de ordem N contendo números inteiros. Em seguida, mostrar a diagonal principal e a 
 * quantidade de valores negativos da matriz. 
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int N, cont;
		
		System.out.print("Qual a ordem da matriz? ");
		N = sc.nextInt();
		
		//duas colchetes indicando que será uma matriz 
		//na frente da matriz eu nomeio com um nome. Usei "mat"
		
		int[][] mat = new int[N][N];
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				System.out.print("ELEMENTO [" + i+ "," + j + "]: ");
				mat[i][j] = sc.nextInt()
;			}
		}
			
		System.out.println("DIAGONAL PRINCIPAL:");
		for (int i = 0; i < N; i++) {
			System.out.print(mat[i][i] + " ");
		}
		
		System.out.println();
		
		cont = 0;
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if (mat[i][j] < 0) {
					cont = cont + 1; //ou cont ++;
				}
			}
		}	
				
		System.out.println("QUANTIDADE DE NEGATIVOS = " + cont);
		
		sc.close();
	}
}
