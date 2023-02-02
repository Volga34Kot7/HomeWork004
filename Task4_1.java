import java.util.LinkedList;
import java.util.List;

public class Task4_1 {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(getRandomNumber());
        }
        System.out.println(list);
        System.out.println(revers(list));
    }


    private static List<Integer> revers(LinkedList<Integer> list) {
        List<Integer> revers = new LinkedList<>();
        for (int i = list.size() - 1; i >= 0; i--) {
            revers.add(list.get(i));
        }
        return revers;
    }


    public static int getRandomNumber() {
        double x = (Math.random() * 100);
        int num = (int) x;
        return num;
    }
}
