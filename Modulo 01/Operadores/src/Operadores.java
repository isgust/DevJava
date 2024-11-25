//Objetivo: Aprender a usar operadores aritmeticos, comparação e logicos
public class Operadores {
    public static void main(String[] args){
    //Operadores Aritméticos
        int a = 10;
        int b = 5;
        System.out.println("Soma: " + (a + b));
        System.out.println("Subtração: " + (a-b));
        System.out.println("Multiplicação: " + (a*b));
        System.out.println("Divisão: " + (a/b));
    //Operadores de comparação
        System.out.println("a é igual a b? " + (a==b));
        System.out.println("a é maior que b? " + (a>b));
        System.out.println("a é menor que b? " + (a<b));
        System.out.println("a é diferente de b? " + (a!=b));

    //Operadores Logicos
        boolean condicao1 = true;
        boolean condicao2 = false;

        System.out.println("Condição1 E Condição2: " + (condicao1 && condicao2));
        System.out.println("Condição1 OU Condição2: " + (condicao1 || condicao2));
    }
}
