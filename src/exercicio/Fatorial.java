package exercicio;

import java.util.Scanner;

public class Fatorial {
    public static void main(String[] args) {
        // N! = 1x2x3x4x5x...xN
        // Exemplo: 4! = 1x2x3x4 = 24
        Scanner entrada = new Scanner(System.in);
        System.out.println("Digite um número inteiro");
        int n = entrada.nextInt();
        int fatorial = 1;
        if (n < 0) {
            System.out.println("Não existe fatorial de número negativo");
        }
        else {
            // for (int i = 1; i <= n; i++) {
            //     fatorial = fatorial * i;
            //     // fatorial *= i;
            // }
            int i = 1;
            while (i <= n){
                fatorial = fatorial * i;
                i++;
            }
            System.out.println("O fatorial de " + n + " é " + fatorial);
        }
        entrada.close();
    }
}
