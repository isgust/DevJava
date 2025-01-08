import java.util.Scanner;

public class CadastroNotas {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float[] notas = new float[5];

        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira a nota do Aluno:");
            notas[i] = leitor.nextFloat();
        }
        for(int j=0; j<5; j++){
            System.out.println(notas[j]);
        }
    }
}