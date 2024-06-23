package univasfEX5.primos;

import java.util.Scanner;

public class Ex1Primos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String resposta;

        do {
            System.out.print("Digite um número inteiro: ");
            int n = scanner.nextInt();
            
            if (n > 1 && ePrimo(n)) {
                System.out.println(n + " é primo");
            } else {
                System.out.println(n + " não é primo");
            }

            System.out.print("Deseja continuar [s/n]? ");
            resposta = scanner.next();

        } while (resposta.equalsIgnoreCase("s"));

        scanner.close();
    }

    // Método para verificar se um número é primo
    public static boolean ePrimo(int n) {
        if (n <= 1) return false;
        if (n == 2) return true; 
        if (n % 2 == 0) return false; 

        // verifica divisores de 3 até a raiz quadrada de n
        for (int i = 3; i <= Math.sqrt(n); i += 2) {
            if (n % i == 0) return false;
        }
        return true;
    }
}