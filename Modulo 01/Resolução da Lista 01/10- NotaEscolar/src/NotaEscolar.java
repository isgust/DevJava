import java.util.Scanner;
public class NotaEscolar {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        float notas[] = new float[3];
        for (int i = 0; i < notas.length; i++) {
            System.out.println("Insira nota " + (i + 1) + ":");
            notas[i] = leitor.nextFloat();
        }
        float media = (notas[0] + notas[1] + notas[2]) / 3;

        System.out.println("Media: " + media);

        if(media >= 7 ){
            System.out.println("Aprovado");
        } else if (media < 4) {
            System.out.println("Reprovado");
        } else if (media >= 4 && media< 7) {
            System.out.println("Recuperação");
        }
    }
}
