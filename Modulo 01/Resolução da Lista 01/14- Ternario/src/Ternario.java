import java.util.Scanner;
public class Ternario {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int numero = leitor.nextInt();
        String resultado = (numero % 2 == 0) ?  "Par": "Impar";
        System.out.println(resultado);
    }
}
