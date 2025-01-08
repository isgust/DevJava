import java.util.Scanner;
public class Maioridade {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira sua idade: ");
        int idade = leitor.nextInt();

        if(idade >= 18){
            System.out.println("Maior idade");
        }else {
            System.out.println("Menor de idade");
        }
    }
}
