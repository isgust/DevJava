import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int contador = 6; // Valor inicial de contador (usado apenas para iniciar o loop)
        int soma = 0;

        while (contador != 0) { // O loop vai rodar enquanto o valor de contador não for 0
            System.out.println("Digite um número (digite 0 para encerrar): ");
            contador = leitor.nextInt(); // Lê o número digitado pelo usuário

            // Se o número digitado for diferente de 0, soma ele à variável soma
            if (contador != 0) {
                soma += contador;
            }
        }

        System.out.println("A soma final dos números digitados é: " + soma);
    }
}
