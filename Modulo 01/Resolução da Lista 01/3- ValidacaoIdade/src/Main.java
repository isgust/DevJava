import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
    Scanner leitor = new Scanner(System.in);
        System.out.println("Insira sua idade: ");
        int idade = leitor.nextInt();

        if (idade >= 18){
            System.out.println("Você pode dirigir!");
        } else{
            System.out.println("Você não pode dirigir!");
        }
    }
}
