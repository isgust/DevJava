import java.util.Scanner;
public class Temperatura {
    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);
        System.out.println("Insira a temperatura em celcius: ");
        int celcius = leitor.nextInt();

        float fahrenheit = (float) (celcius * 1.8 + 32);
        System.out.println(fahrenheit);
    }
}
