import java.util.Scanner;
public class PositivoNegativo {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira um numero: ");
        int numero = leitor.nextInt();

        if(numero > 0){
            System.out.println("Numero Positivo");
        } else if (numero == 0) {
            System.out.println("Numero nulo");
        }else{
            System.out.println("Numero Negativo");
        }
    }
}
