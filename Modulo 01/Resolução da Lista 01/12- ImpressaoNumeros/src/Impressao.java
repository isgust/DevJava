import java.util.Scanner;
public class Impressao {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int i = leitor.nextInt();
        int contador = 0;
        while ((i +1)  != contador){
            System.out.println(contador);
            contador++;
        }
    }
}
