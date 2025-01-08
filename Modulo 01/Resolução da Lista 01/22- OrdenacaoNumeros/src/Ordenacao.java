import java.util.Scanner;
public class Ordenacao {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        int[] numero = new int[5];

        for(int i = 0; i < numero.length; i++){
            System.out.println("Insira um valor: ");
            numero[i] = leitor.nextInt();
        }
        for (int i = 0; i<numero.length - 1; i++){
            for (int j=0; j<numero.length -1-i; j++){
                if (numero[j] > numero[j+1]){
                    int temp = numero[j];
                    numero[j] = numero[j+1];
                    numero[j+1] = temp;
                }
            }
        }
        for (int n: numero){
            System.out.println(n + "");
        }
    }
}
