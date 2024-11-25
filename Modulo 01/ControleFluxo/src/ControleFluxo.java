public class ControleFluxo{
    public static void main(String[] args){
        int idade = 20;

        //if, else if, else
        if (idade>=18) {
            System.out.println("Maior de idade");
        } else if (idade>=16) {
            System.out.println("Pode votar, mas não pode dirigir");
        }else{
            System.out.println("Menor de idade");
        }

        //Switch
        int diaSemana = 3;
        switch (diaSemana){
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terça-Feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            default:
                System.out.println("Dia invalido");
                break;
        }
    }
}