public class Main{
    public static void main(String[] args){
        Pessoa pessoa = new Pessoa();

        //Usando os Setters para definir os valores
        pessoa.setNome("Andressa");
        pessoa.setIdade(19);

        //Usando os getters para acessar os valores
        System.out.println("Nome: " + pessoa.getNome());
        System.out.println("Idade " + pessoa.getIdade());
    }
}