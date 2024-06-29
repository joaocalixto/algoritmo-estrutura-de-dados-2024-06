import java.util.PriorityQueue;

public class FilePrioridade {

    public static void main(String[] args) {
        String[] chars = {"p", "r",  "i", "o", "*", "r", "*", "*", "i", "*", "t", "*", "y", "*", "*", "*", "q", "u", "e", "*", "*", "*", "u", "*", "e"};

        PriorityQueue<Character> pq = new PriorityQueue<>();

        for (String c : chars) {
            if (c.equals("*")) {
                pq.remove();
                System.out.println(pq);
            } else {
                pq.add(c.charAt(0));
                System.out.println(pq);
            }
        }
    }
}
