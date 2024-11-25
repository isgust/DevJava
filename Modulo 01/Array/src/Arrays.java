//Objetivo: Entender o que são arrays
public class Arrays {
    int idade;
    public static void main(String[] args){
        //Declaração de array
        int[] numeros = {10, 20, 30, 40, 50};
        int[] numeroTamanho = new int[3]; //Aqui eu defini o tamanho do array

        //Acessando os elemntos do array
        System.out.println("Primeiro Elemento: " + numeros[0]);
        System.out.println("Segundo Elemento: " + numeros[1]);

        //Percorrendo o array com um loop for
        for(int i=0; i<numeros.length; i++){
            System.out.println(numeros[i]);
        }

        numeroTamanho[0] = 10;
        numeroTamanho[2] = 13;
        System.out.println("Numero 1 do vetor de tamanho 3: " + numeroTamanho[0]);
        System.out.println("Numero 2 do vetor de tamanho 3: " + numeroTamanho[1]);
        System.out.println("Numero 3 do vetor de tamanho 3: " + numeroTamanho[2]);

    }
}
