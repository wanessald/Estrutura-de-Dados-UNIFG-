import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.LinkedList;

public class Exercicio{
    
    public static void main (String[] args) {
        /* code */
        List<Integer>list = new ArrayList<>();
        for (int i = 1; i <= 5; i++) {
            list.add(i);
        }
        Stack<Integer> pilha = new Stack<>();
        for (int i = 1; i <= 5; i++) {
            pilha.push(list.get(0));
            list.remove(0);
        }
        LinkedList <Integer> fila = new LinkedList<>();
         for (int i = 1; i <= 5; i++) {
            fila.add(pilha.get(0));
            pilha.remove(0);
        }
        for (int i = 6; i <= 10; i++) {
            list.add(i);
        }
        for (int i = 1; i <= 5; i++) {
            pilha.push(list.get(0));
            list.remove(0);
        }
        for (int i = 1; i <= 5; i++) {
            fila.add(pilha.get(0));
            pilha.remove(0);
        }
        
        for (int i = 1; i <= fila.size(); i++) {
            System.out.println(i);
        }
        
    }
}