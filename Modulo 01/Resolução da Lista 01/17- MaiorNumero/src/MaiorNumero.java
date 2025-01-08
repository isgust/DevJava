import java.util.Scanner;
public class MaiorNumero {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] numeros = new int[5];
        int soma = 0;
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Insira um valor: ");
            numeros[i] = leitor.nextInt();
            soma += numeros[i];
        }
        System.out.println(soma);
    }
}
