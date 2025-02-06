abstract class Veiculo {
    String nome;

    public abstract void mover();

    public void abatecer(){
        System.out.println(nome + " está abastecendo...");
        System.out.println(nome + " abastecido");
    }

}
