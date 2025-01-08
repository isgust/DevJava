import java.util.Scanner;
public class BuscaElemento {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        int[] n = new int[5];

        for (int i = 0; i <n.length; i++) {
            System.out.println("Insira o valor: ");
            n[i] = leitor.nextInt();

        }
        for (int j=0; j < n.length; j++){
            if (n[j]  == 10){
                System.out.println("O numero 10 está presente!");
            }else {
                System.out.println("O numero 10 não está presente");
            }
        }
    }
}