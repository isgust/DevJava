import java.util.Arrays;
import java.util.List;

public class ExemploStream {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);
        double media = numeros.stream()
                .filter(n -> n % 2 != 0) // Filtra ímpares
                .mapToInt(Integer::intValue) // Converte para int
                .average() // Calcula média
                .orElse(0); // Valor padrão se vazio
        System.out.println("Média dos ímpares: " + media);
    }
}