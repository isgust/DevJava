import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
          Scanner leitor = new Scanner(System.in);
        System.out.println("Insira um valor decimal: ");
        float decimal = leitor.nextFloat();
        int inteiro = (int) decimal;
        System.out.println(inteiro);
    }
}