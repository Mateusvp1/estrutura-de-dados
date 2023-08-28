import java.util.Scanner;
import java.util.Stack;

public class pilhas2 {
    public static void main(String[] args) {
        Stack<Integer> pilha01 = new Stack<>();
        Stack<Integer> aux1 = new Stack<>();
        Stack<Integer> aux2 = new Stack<>();

        Scanner scan = new Scanner(System.in);
        for (int i = 0; i < 5; i++) {
            System.out.println("Digite o número " + (i + 1) + ":");
            int num = scan.nextInt();
            pilha01.push(num);

        }

        while (!pilha01.isEmpty()) {
            aux1.push(pilha01.pop());
        }

        while (!aux1.isEmpty()) {
            aux2.push(aux1.pop());
        }

        while (!aux2.isEmpty()) {
            pilha01.push(aux2.pop());
        }

        System.out.println("Pilha Invertida: " + pilha01);
    }
}
