import java.util.Scanner; //Importando a classe Scanner(Iremos fazer a entrada de dados com ela)
public class EntradaDados {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        //Ele oferece metodos diferentes para leitura de diferentes tipos de dados
        //Inteiro
        System.out.println("Digite um numero inteiro: ");
        int numero = leitor.nextInt();
        System.out.println("Você digitou o numero: " + numero);

        //Float
        System.out.println("Digite um numero decimal: ");
        float decimal = leitor.nextFloat();
        leitor.nextLine();
        System.out.println("Você digitou o numero: " +decimal);


        //String
        System.out.println("Digite seu nome: ");
        String nome = leitor.nextLine();
        System.out.println("Meu nome é " + nome + " e eu sou lindo");

        leitor.close();
    }
}
