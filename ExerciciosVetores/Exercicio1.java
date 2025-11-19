package vetoresTpa;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);

        int[] A = new int[20];
        int[] B = new int[20];

        int p = 0;      // pares
        int i = 19;     // impares

        System.out.println("Digite 20 números:");
        for (int x = 0; x < 20; x++) {
            A[x] = ler.nextInt();

            if (A[x] % 2 == 0) {
                B[p] = A[x];
                p++;
            } else {
                B[i] = A[x];
                i--;
            }
        }

        System.out.print("Pares: ");
        for (int x = 0; x < p; x++) {
            System.out.print(B[x] + " ");
        }

        System.out.print("\nImpares: ");
        for (int x = 19; x > i; x--) {
            System.out.print(B[x] + " ");
        }

        ler.close();
    }
}
