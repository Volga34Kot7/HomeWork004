import java.util.Scanner;
import java.util.Stack;

public class Task4_3 {

    public static void Calcul(Stack<Integer> st, String choice) {
        int number2 = st.pop();
        int number1 = st.peek();

        int result = 0;

        switch (choice) {
            case ("+"):
                result = number1 + number2;
                break;

            case ("-"):
                result = number1 - number2;
                break;

            case ("*"):
                result = number1 * number2;
                break;

            case ("/"):
                result = number1 / number2;
                break;

            default:
                break;
        }
        System.out.println(number1 + " " + choice + " " + number2 + " = " + result);
    }

    public static String UserChoiseOperation() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter +, -, * or /");
        System.out.print(": ");
        String choice = sc.next();
        return choice;
    }

    public static void main(String[] args) {
        System.out.println("The calculator program is running.");
        Stack<Integer> st = new Stack<>();
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.printf("Enter the first number: ");
            st.push(scan.nextInt());
            System.out.printf("Enter the second number: ");
            st.push(scan.nextInt());
            String choice = UserChoiseOperation();
            Calcul(st, choice);
            System.out.println("The first number: " + st.peek());
            System.out.println("Do you want to cancel the operation?\nEnter 'y'\nEnter 'n' resume\nEnter 'q' exit");
            System.out.print(": ");
            choice = scan.next();
            if (choice.equals("y")) {
                System.out.println("The first number: " + st.peek());
                System.out.printf("Enter the second number: ");
                st.push(scan.nextInt());
                choice = UserChoiseOperation();
                Calcul(st, choice);
            }
            if (choice.equals("n")) {
                continue;
            }
            if (choice.equals("q")) {
                System.out.println("Goodbye.");
                break;
            }
        }
    }
}
