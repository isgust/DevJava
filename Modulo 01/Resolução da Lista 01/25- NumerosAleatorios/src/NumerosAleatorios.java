import java.util.Random;
public class NumerosAleatorios {
    public static void main(String[] args){
        Random numberRandon = new Random();
        int[] vetor = new int[10];

        for(int i = 0; i < vetor.length; i++){
            vetor[i] = numberRandon.nextInt(100);
        }

        for (int i = 0; i< vetor.length; i++){
            System.out.print(vetor[i] + "\n");
        }
    }

}
