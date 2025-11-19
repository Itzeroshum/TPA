package vetoresTpa;

import java.util.Scanner;

public class Exercicio13 {

	public static void main(String[] args) {
	       Scanner ler = new Scanner(System.in);

	        int[] A = new int[10];

	        System.out.println("Digite 10 números:");
	        for (int i = 0; i < 10; i++) {
	            A[i] = ler.nextInt();
	        }

	        boolean palindromo = true;

	        int inicio = 0;
	        int fim = 9;

	        while (inicio < fim) {
	            if (A[inicio] != A[fim]) {
	                palindromo = false;
	                break;
	            }
	            inicio++;
	            fim--;
	        }

	        if (palindromo) {
	            System.out.println("O vetor é um palindromo.");
	        } else {
	            System.out.println("O vetor nao é um palindromo.");
	        }

	        ler.close();
	    }
	}
