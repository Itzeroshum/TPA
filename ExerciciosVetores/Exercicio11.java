package vetoresTpa;

import java.util.Scanner;

public class Exercicio11 {

	public static void main(String[] args) {
		 Scanner ler = new Scanner(System.in);

	        int[] A = new int[10];

	        // ler os 10 valores
	        System.out.println("Digite 10 numeros para o vetor A:");
	        for (int i = 0; i < 10; i++) {
	            System.out.print("A[" + i + "]: ");
	            A[i] = ler.nextInt();
	        }

	        // perguntar o valor X
	        System.out.print("\nDigite o valor que deseja buscar: ");
	        int X = ler.nextInt();

	        // rotina de busca
	        boolean encontrado = false;
	        int posicao = -1;

	        for (int i = 0; i < 10; i++) {
	            if (A[i] == X) {
	                encontrado = true;
	                posicao = i;
	                break;
	            }
	        }

	        // resultado
	        if (encontrado) {
	            System.out.println("\nValor encontrado na posicao: " + posicao);
	        } else {
	            System.out.println("\nValor NAO encontrado no vetor.");
	        }

	        ler.close();
	    }
	}

