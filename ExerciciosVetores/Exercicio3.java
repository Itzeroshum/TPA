package vetoresTpa;

public class Exercicio3 {

	public static boolean primo(int n) {
        if (n <= 1) return false;
        for (int x = 2; x * x <= n; x++) {
            if (n % x == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        int[] A = { 3, 4, 5, 10, 11, 12, 7, 9, 13, 15 };

        for (int n : A) {
            if (primo(n)) {
                System.out.println(n + " é primo");
            } else {
                System.out.println(n + " não é primo");
            }
        }
    }
}