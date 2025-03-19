public class TesteInteface {
    public static void main(String[] args){
        Pagamento meuPagamento;

        meuPagamento = new CartaoCredito();
        meuPagamento.pagar();  //Pagamento com o cartão de credito

        meuPagamento = new Pix();
        meuPagamento.pagar(); //Pagamento via pix
    }
}
