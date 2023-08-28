import java.util.Stack;

public class pilhas3 {
    public static void main(String[] args) {
        Stack<Integer> p1 = new Stack<>();
        Stack<Integer> p2 = new Stack<>();

        p1.push(1);
        p1.push(2);
        p1.push(3);
        p1.push(4);
        p1.push(5);

        p2.push(1);
        p2.push(2);
        p2.push(3);
        p2.push(4);
        p2.push(5);

        boolean saoIguais = iguais(p1, p2);

        if (saoIguais) {
            System.out.println("As pilhas p1 e p2 são iguais.");
        } else {
            System.out.println("As pilhas p1 e p2 não são iguais.");
        }
    }

    public static boolean iguais(Stack<Integer> p1, Stack<Integer> p2) {
        if (p1.size() != p2.size()) {
            return false;
        }

        for (int i = 0; i < p1.size(); i++) {
            if (!p1.get(i).equals(p2.get(i))) {
                return false;
            }
        }

        return true;
    }
}










