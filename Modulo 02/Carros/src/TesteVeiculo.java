public class TesteVeiculo {
    public static void main(String[] args){
        Veiculo carro = new Carro();
        carro.nome = "Toyota Etios";
        carro.abatecer();
        carro.mover();

        Veiculo moto = new Moto();
        moto.nome = "Kawasaki Versys 650";
        moto.abatecer();
        moto.mover();
    }
}
