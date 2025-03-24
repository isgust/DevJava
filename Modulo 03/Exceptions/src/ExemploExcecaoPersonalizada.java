public class ExemploExcecaoPersonalizada {
    static class SaldoInsuficienteException extends Exception{
        public SaldoInsuficienteException(String mensagem){
            super(mensagem);
        }
    }
    public static void sacar(double saldo, double valor) throws  SaldoInsuficienteException{
        if (saldo<valor){
            throw new SaldoInsuficienteException("Saldo Insuficiente");
        }
        System.out.println("Saque realizado");
    }

    public static void main(String[] args){
        try {
            sacar(100,150);
        } catch(SaldoInsuficienteException e){
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
