public class Main {
    public static void main(String[] args){
        Carro carro1 = new Carro();
        carro1.marca = "Toyota";
        carro1.modelo = "Etios";
        System.out.println("Marca: " + carro1.marca);
        System.out.println("Modelo: " + carro1.modelo);
        carro1.ligar();

    }
}
