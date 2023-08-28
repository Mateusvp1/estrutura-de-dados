import java.util.Scanner;
import java.util.Stack;

public class pilhas4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Stack<Character> pilha1 = new Stack<>();

        System.out.print("Informe uma frase terminada por ponto final: ");
        String frase = scanner.nextLine();

        char[] caracteres = frase.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            char c = caracteres[i];
            if (c != '.') {
                pilha1.push(c);
            }
        }

        System.out.print("Frase invertida: ");
        while (!pilha1.isEmpty()) {
            System.out.print(pilha1.pop());
        }

    }
}
