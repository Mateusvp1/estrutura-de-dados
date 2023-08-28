import java.util.Stack;
public class pilhas1 {
    public static void main (String[] args){
        Stack<Integer> pilha01= new Stack<Integer>();
        Stack<Integer> pilha02= new Stack<Integer>();

        pilha01.push(1);
        pilha01.push(2);
        pilha01.push(3);

        System.out.println("P1:");
        System.out.println(pilha01);

        pilha02=pilha01;
        System.out.println("P2:");
        System.out.println(pilha02);

    }
}
