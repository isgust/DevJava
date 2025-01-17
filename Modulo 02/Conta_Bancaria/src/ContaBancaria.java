public class ContaBancaria {
    //Atributos privados
    private String numeroConta;
    private double saldo;

    //Setters
    public void setNumeroConta(String numeroConta){
        this.numeroConta = numeroConta;
    }

    public void setSaldo(double saldo){
        if (saldo >= 0 ){
            this.saldo = saldo;
        }else{
            System.out.println("Saldo negativo");
        }
    }

    //Getters
    public String getNumeroConta(){
        return numeroConta;
    }

    public  double getSaldo(){
        return saldo;
    }
}
