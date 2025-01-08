import java.util.Scanner;
public class ParImpar {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int numero = leitor.nextInt();

        if (numero % 2 == 0){
            System.out.println("Numero Par");
        }else{
            System.out.println("Numero Impar");
        }
    }
}
