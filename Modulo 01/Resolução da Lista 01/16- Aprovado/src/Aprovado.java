import java.util.Scanner;
public class Aprovado {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira sua nota: ");
        float nota = leitor.nextFloat();

        if(nota >= 7){
            System.out.println("Aprovado");
        } else if (nota < 7) {
            System.out.println("Reprovado");
        }
    }
}
