public class App {
    public static void main(String[] args) throws Exception {
        int contador = 100;
        // while (contador < 10) {             // 1º verificar
        //     System.out.println(contador);   // 2º imprime
        //     contador++;                     // 3º mais um no contador
        // }
        // do {                            // atira primeiro e pergunta depois
        //     System.out.println(contador);       // 1º imprime
        //     contador++;                         // 2º mais um no contador
        // } while (contador < 10);                // 3º verificar

        // int senha = 123456;
        // int login = 00001;

        // System.out.println("Digite seu login e senha: ");

        // while (login != 00001 && senha != 123456) {
        //     //Scan
        //     continue;
        //     break;
        // }
        
        // do {
        //     // Scan
        // } while (login != 00001 && senha != 123456);
        
        int opcao = 1;
        switch (opcao) {
            case 1: {
                System.out.println("opção 1");
                break;
            }
            case 2: {
                System.out.println("opção 2");
                break;
            }
            default: {
                 break;
            }
        }
    }
}
