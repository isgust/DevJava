public class CartaoCredito implements Pagamento{
    @Override
    public void pagar(){
        System.out.println("Pagamento realizado com sucesso com cartão de credito!");
    }
}
