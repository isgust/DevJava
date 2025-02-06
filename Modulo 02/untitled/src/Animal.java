abstract class Animal {
    String nome;

    public abstract void emitirSom();

    public void dormir(){
        System.out.println(nome + " está dormindo");
    }
}
