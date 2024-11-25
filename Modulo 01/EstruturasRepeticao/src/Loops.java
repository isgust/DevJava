public class Loops {
    public static void main(String[] args){
        //For loop
        System.out.println("For loop");
        for(int i=7; i>-1; i--){
            System.out.println("Contagem: " +i);
        }

        //While loop
        System.out.println("While loop");
        int contador = 0;
        while (contador<=10){
            System.out.println(contador);
            contador++;
        }

        //Do while loop
        System.out.println("Do-while loop");
        int contador2 = 0;
        do{
            System.out.println("Contagem: " +contador2);
            contador2++;
        }while (contador2<5);


    }
}
