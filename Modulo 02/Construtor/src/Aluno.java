public class Aluno {
    String nome;
    int idade;

    //Construtor com parâmetros
    Aluno(String nome, int idade){
        this.nome = nome; //Refere-se ao atributo da classe
        this.idade = idade;// Refere-se ao atributo da classe
    }

    void apresentar(){
        System.out.println("Nome: " + nome + ", Idade: " + idade);
    }
}
