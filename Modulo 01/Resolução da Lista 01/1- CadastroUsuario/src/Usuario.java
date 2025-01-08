import java.util.Scanner;
//Exercicio 01 da Lista de exercicios do modulo 01
public class Usuario {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();

        System.out.println("Digite sua idade: ");
        int idade = leitor. nextInt();

        System.out.print("Olá," + nome + ". Você tem " + idade +" anos.");
        leitor.close();
    }
}