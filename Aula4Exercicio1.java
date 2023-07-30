package aulaDeJava

import java.util.*;

public class Aula4Exercicio1 {
        
    public static void main(String[] args, int n) {

        Scanner ENTRADA = new Scanner(System.in);

        System.out.print("Digite um valor inteiro que terá seu fatorial calculado: ");		
		int a = ENTRADA.nextInt();
        int fatorial = 1;

        // Não existe fatorial negativo

        if( a<0){
            System.out.println("Não existe fatorial de número negativo");
        }
       
        
    }       
  }
