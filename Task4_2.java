import java.util.LinkedList;
import java.util.Scanner;

public class Task4_2 {
    public static LinkedList<Integer> Enqueue(LinkedList<Integer> ll) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number: ");
        String element = sc.nextLine();
        ll.addLast(Integer.parseInt(element));
        //sc.close();
        return ll;
    }

    public static LinkedList<Integer> Denqueue(LinkedList<Integer> ll) {

        System.out.println("The first item in the queue has been deleted" + "[" + ll.pollFirst() + "]");
        return ll;
    }

    public static int First(LinkedList<Integer> ll) {

        System.out.println("The first element " + "[" + ll.getFirst() + "]" + " queues");
        int element = ll.getFirst();
        return element;
    }

    public static void Menu(LinkedList<Integer> ll) {
        System.out.println("this program will help you edit the queue.");
        //Scanner cs = new Scanner(System.in);
        //String choice = "";
        menu: while (true) {
            System.out.println("Enter 1 - to put the item at the end of the queue");
            System.out.println("Enter 2 - to view and delete the first element");
            System.out.println("Enter 3 - to view the first element");
            System.out.println("Enter 4 - to view the queue");
            System.out.println("Enter 5 - to close the program");
            System.out.print("What do you want to do? -> ");
            Scanner cs = new Scanner(System.in);
            String choice = cs.nextLine();
            //cs.close();

            switch (choice) {
                case ("1"):
                    Enqueue(ll);
                    System.out.println();
                    break;

                case ("2"):
                    Denqueue(ll);
                    System.out.println();
                    break;

                case ("3"):
                    First(ll);
                    System.out.println();
                    break;

                case ("4"):
                    System.out.println("Queue -> " + ll);
                    System.out.println();
                    break;

                case ("5"):
                    System.out.println("Goodbye.");
                    break menu;
            }
        }
    }

    public static void main(String[] args) {
        LinkedList<Integer> ll = new LinkedList<Integer>();
        for (int i = 1; i < 10; i++) {
            ll.add(i);
        }

        Menu(ll);

    }
}