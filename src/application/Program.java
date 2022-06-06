package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("INFORME O TAMANHO DA SUA MATRIZ");
		int m = sc.nextInt();
		int n = sc.nextInt();
		int[][] mat = new int[m][n];
		System.out.println("AGORA INFORME OS VALORES PARA PREENCHER A MATRIZ");
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}
		System.out.println("INFORME O NÚMERO QUE DESEJA BUSCAR DENTRO DA MATRIZ");
		int x = sc.nextInt();
		
		for (int i=0; i<mat.length; i++) {
			for (int j=0; j<mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("POSIÇÃO DO NÚMERO SOLICITADO " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Nº ESQUERDA: " + mat[i][j-1]);
					}
					if (i > 0) {
						System.out.println("Nº ACIMA: " + mat[i-1][j]);
					}
					if (j < mat[i].length-1) {
						System.out.println("Nº  DIREITA: " + mat[i][j+1]);
					}
					if (i < mat.length-1) {
						System.out.println("Nº ABAIXO: " + mat[i+1][j]);
					}
				}
			}
		}
		
		sc.close();
	}
}
