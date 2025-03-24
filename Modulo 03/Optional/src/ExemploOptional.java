import java.util.Optional;

public class ExemploOptional {
    public static void main(String[] args) {
        String texto = null;
        Optional<String> optionalTexto = Optional.ofNullable(texto);

        String resultado = optionalTexto.orElse("Valor padrão");
        System.out.println("Resultado: " + resultado);
    }
}