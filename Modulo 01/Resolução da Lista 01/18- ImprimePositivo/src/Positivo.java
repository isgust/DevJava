import java.util.Scanner;
public class Positivo {
    public static void main(String[] args){
        int[] numeros = new int[10];
        Scanner leitor = new Scanner(System.in);
        for(int i = 0; i < numeros.length; i++){
            System.out.println("Insira um numero: ");
            numeros[i] = leitor.nextInt();
        }
        for (int j = 0; j < numeros.length; j++){
            if(numeros[j] >0) {
                System.out.println(numeros[j]);
            }else{

            }

        }
    }
}
