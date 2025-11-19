package vetoresTpa;

public class Exercicio2 {

	public static void main(String[] args) {
		 int[] A = { 15, 55, 70, 300, 90 };

	        for (int n : A) {
	            System.out.println("\nTabuada de " + n + ":");
	            for (int x = 1; x <= 10; x++) {
	                System.out.println(n + " x " + x + " = " + (n * x));
	            }
	        }
	    }
	}

