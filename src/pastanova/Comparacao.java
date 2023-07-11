package pastanova;

import java.util.Scanner;

public class Comparacao {
	private static final Scanner ENTRADA = new Scanner(System.in);
	public static void main(String[] args) {
		System.out.println("Digite os três números");
		int x = ENTRADA.nextInt();
		int y = ENTRADA.nextInt();
		int z = ENTRADA.nextInt();
		int menor;
		int meio;
		int maior; 
		// x, y, z
		if (x < y && y < z && x < z) {
			menor = x;
			meio = y;
			maior = z;
		// y, x, z
		} else if (y < x && x < z && y < z) {
			menor = y;
			meio = x;
			maior = z;
		// y, z, x	
		} else if (y < z && z < x && y < x) {
			menor = y;
			meio = z;
			maior = x;
		// x, z, y	
		} else if (x < z && z < y && x < y) {
			menor = x;
			meio = z;
			maior = y;
		// z, x, y
		} else if (z < x && x < y && z < y) {
			menor = z;
			meio = x;
			maior = y;			
		// z, y, x
		} else {
			menor = z;
			meio = y;
			maior = x;			
		}
		System.out.println(menor);
		System.out.println(meio);
		System.out.println(maior);
	}

}