import java.util.Scanner;
public class Calculadora {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira o valor 01: ");
        int n1 = leitor.nextInt();

        System.out.println("Insira o valor 02: ");
        int n2 = leitor.nextInt();

        System.out.println("O valor da soma dos dois numeros é: " + (n1 + n2));
        System.out.println("O valor da subtração dos dois numeros é: " + (n1 - n2));
        System.out.println("O valor da Multiplicação dos dois numeros é : " + (n1 * n2));
        System.out.println("O valor da divisão dos dois numeros é: " + (n1 / n2));
    }
}
