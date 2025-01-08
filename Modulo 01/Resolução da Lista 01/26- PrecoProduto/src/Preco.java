import java.util.Scanner;
public class Preco {
    public static void main(String[] args){
        Scanner leitor  = new Scanner(System.in);
        float[] vetor = new float[2];

        System.out.println("Insira o valor do produto 01: ");
        vetor[0] = leitor.nextFloat();

        System.out.println("Insira o valor do produto 02: ");
        vetor[1] = leitor.nextFloat();

        float desconto = (vetor[0] + vetor[1]) * 10/100;
        float valorFinal  = (vetor[0] + vetor[1]) - desconto;
        System.out.println("O valor final com desconto é: " + valorFinal);
    }
}
