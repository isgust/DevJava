import java.util.Scanner;
public class BoasVindas {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Insira sua cidade: ");
        String cidade = leitor.nextLine();
        System.out.print("Seja bem-vindo " + nome + " de " + cidade);
        leitor.close();
    }
}
