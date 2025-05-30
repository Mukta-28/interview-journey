import java.util.Scanner;
import java.util.Stack;

public class ReverseStack {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int num = sc.nextInt();

        Stack<Integer> stack = new Stack<>();

        while (num != 0) {
			System.out.println("Pushed: " + (num % 10));
            stack.push(num % 10);
            num /= 10;
        }

       // System.out.print("Reverse: ");
        while (!stack.isEmpty()) {
            System.out.print(stack.pop());
        }

        sc.close();
    }
}
