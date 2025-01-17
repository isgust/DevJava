public class Pessoa {
    //  Atributos privados
    private String nome;
    private int idade;

    //Getter para nome
    public String getNome(){
        return nome;
    }

    //Setter para nome
    public void setNome(String nome){
        this.nome = nome;
    }

    //Getter para idade
    public int getIdade(){
        return idade;
    }

    //Setter para idade(Com validação)
    public void setIdade(int idade){
        if (idade >= 0){
            this.idade = idade;
        }else{
            System.out.println("Idade Invalida!");
        }
    }
}
