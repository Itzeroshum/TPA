package vetoresTpa;

import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);

	        int[] A = new int[10];
	        int[] B = new int[10];
	        int[] C = new int[10]; // diferença
	        int k = 0;

	        System.out.println("Digite os 10 elementos do vetor A:");
	        for (int i = 0; i < 10; i++) {
	            A[i] = ler.nextInt();
	        }

	        System.out.println("Digite os 10 elementos do vetor B:");
	        for (int i = 0; i < 10; i++) {
	            B[i] = ler.nextInt();
	        }

	        // Diferença A-B
	        for (int i = 0; i < 10; i++) {
	            boolean existe = false;

	            for (int j = 0; j < 10; j++) {
	                if (A[i] == B[j]) {
	                    existe = true;
	                    break;
	                }
	            }
	            if (!existe) {
	                C[k] = A[i];
	                k++;
	            }
	        }
	        System.out.print("\nDiferença (A - B): ");
	        for (int i = 0; i < k; i++) {
	            System.out.print(C[i] + " ");
	        }
	        ler.close();
	    }
	}


