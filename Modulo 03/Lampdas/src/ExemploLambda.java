import java.util.Arrays;
import java.util.List;

public class ExemploLambda {
    public static void main(String[] args) {
        List<String> nomes = Arrays.asList("Alice", "Bob", "Charlie");
        nomes.forEach(nome -> System.out.println("Olá, " + nome));
    }
}