//Objetivo: Entender os tipos de dados em Java e aprender a declarar variáveis.

public class TiposdeDados {
    public static void main(String[] args){
        //Inteiros
        int idade = 25;
        byte menorValor = -128;
        long populacaoMundial = 7800000000L;

        //Decimais
        float altura = 1.80f;
        double preco = 19.99;

        //Caracter,Booleano e String
        char inicial = 'J';
        boolean ativo = true;
        String nome = "Gustavo";

        System.out.println("Idade: " + idade);
        System.out.println("Menor Valor: " + menorValor);
        System.out.println("População: "+ populacaoMundial);
        System.out.println("Altura: " + altura);
        System.out.println("Preço: " + preco);
        System.out.println("Inicial: " + inicial);
        System.out.println("Ativo: " + ativo);
        System.out.println("Nome: " + nome);
    }
}
