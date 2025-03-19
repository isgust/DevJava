import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ExempleArraylist {
    public static void main(String[] args){
        //ArrayList
        List<String> nomeArrayList = new ArrayList<>();
        nomeArrayList.add("Andressa");
        nomeArrayList.add("Bob");
        nomeArrayList.add("Gustavo");
        System.out.println("ArrayList: " + nomeArrayList);

        //LinkedList
        List<String> nomeLinkedList = new LinkedList<>();
        nomeLinkedList.add("Pedro");
        nomeLinkedList.add("Carlos");
        nomeLinkedList.add("Wesley");


        System.out.println("LinkedList: " + nomeLinkedList);
    }
}
