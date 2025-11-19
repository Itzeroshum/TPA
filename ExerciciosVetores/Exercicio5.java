package vetoresTpa;

public class Exercicio5 {

	public static void main(String[] args) {
		 int[] A = { 6, 12, 15, 9, 20, 7, 18, 25, 10, 14 };

	        for (int n : A) {
	            System.out.println("\nDivisores de " + n + ":");
	            for (int x = 1; x <= n; x++) {
	                if (n % x == 0) {
	                    System.out.print(x + " ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}

