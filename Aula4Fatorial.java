

import java.util.*;

public class Aula4Fatorial {

    public static void main(String[] args) {
         Scanner ENTRADA = new Scanner(System.in);
         System.out.print("Digite um valor inteiro que terá seu fatorial calculado: ");		
		int a = ENTRADA.nextInt();
        int fatorial = 1;
        // Não existe fatorial negativo

        if( a<0){
            System.out.println("Não existe fatorial de número negativo");
        }
        else{
            for (int contador = 1; contador <= a; contador++);
            int contador;
            fatorial *= contador;  //fatorial = fatorial*contador
            
            System.out.println("O fatorial de " + a + " é " + fatorial)

    }
}
