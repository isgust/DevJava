import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float[]  notas = new float[5];
        float soma = 0;
        for (int i = 0; i < notas.length ; i++) {
            System.out.println("Insira as notas: ");
            notas[i] = leitor.nextFloat();
            soma += notas[i];
        }
        System.out.println("A média das notas é: " + (soma/5));

    }
}