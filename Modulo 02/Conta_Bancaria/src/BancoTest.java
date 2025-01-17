
public class BancoTest {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();

        conta.setNumeroConta("12345-6");
        conta.setSaldo(1200);

        System.out.println("Conta: " + conta.getNumeroConta());
        System.out.println("Saldo: " + conta.getSaldo());

        conta.setSaldo(-500); //Tentando numero negativo
    }
}