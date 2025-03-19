import java.util.HashMap;
import java.util.Map;

public class ExampleMaps {
    public static void main(String[] args){
        Map<String, Integer> pessoa = new HashMap<>();
        pessoa.put("Alice", 13);
        pessoa.put("Andressa", 43);
        pessoa.put("Paula", 33);

        System.out.println("Maps: " + pessoa);
    }
}
