import java.util.Scanner;
public class PesquisaLista {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        String[] nome = new String[3];
        for(int i = 0; i < nome.length; i++) {
            System.out.println("Insira os nomes: ");
            nome[i] = leitor.nextLine();
        }

        for(int i = 0; i < nome.length - 1; i++){
            for (int j = 0; j< nome.length - 1 - i; j++){
                if(nome[j].compareTo(nome[j+1]) > 0){
                    String temp = nome[j];
                    nome[j] = nome[j + 1];
                    nome[j + 1] = temp;
                }
            }
        }

        for(String nomes: nome){
            System.out.println(nomes);
        }
    }
}
