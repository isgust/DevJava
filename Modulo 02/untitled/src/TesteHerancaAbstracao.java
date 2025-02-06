public class TesteHerancaAbstracao {
    public static void main(String[] args){
        Animal cachorro = new Cachorro();
        cachorro.nome = "Rex";
        cachorro.dormir();
        cachorro.emitirSom();

        Animal gato = new Gato();
        gato.nome = "Mia";
        gato.emitirSom();
        gato.dormir();
    }
}
