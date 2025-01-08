import java.util.Scanner;
public class For {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        while (numero != 5) {
            System.out.println("Insira um numero: ");
            numero = leitor.nextInt();
            for (int i = 1; i <= numero; i++) {
                System.out.println(i);
            }
        }
    }

}
