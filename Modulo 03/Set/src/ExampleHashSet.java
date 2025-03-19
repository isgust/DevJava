import java.util.HashSet;
import java.util.Set;

public class ExampleHashSet {
    public static void main(String[] args){
        Set<String> nomes = new HashSet<>();
        nomes.add("Paulo");
        nomes.add("Luiza");
        nomes.add("Abner");

        System.out.println("HashSet: " + nomes);
    }
}
