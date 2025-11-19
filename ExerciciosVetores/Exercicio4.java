package vetoresTpa;

public class Exercicio4 {

	public static void main(String[] args) {
		 int[] A = { 8, 5, 12, 3, 15, 7, 20, 11, 6, 9 };

	        for (int n : A) {
	            System.out.println("\nPares até " + n + ":");
	            for (int x = 0; x <= n; x++) {
	                if (x % 2 == 0) {
	                    System.out.print(x + " ");
	                }
	            }
	            System.out.println();
	        }
	    }
	}
