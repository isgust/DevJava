import java.util.Scanner;
public class Produto {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);

        System.out.println("Insira o nome do produto: ");
        String nome = leitor.nextLine();

        System.out.println("Insira o valor do produto: ");
        float valor = leitor.nextFloat();

        System.out.print("O produto " + nome + " custa " + valor);
    }

}
