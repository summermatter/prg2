/**
 * Created by Shawn Summermatter on 24/02/14.
 */
public class Ringbuffer {

    private static int size = 5;
    private String[] queue = new String[size];
    private int head = 0;
    private int tail = 0;
    private int no = 0;

    public void enqueue(String x) {
        // Fügt x am Ende in die Warteschlange ein,
        // falls die Warteschlange nicht voll ist;

        if (!isFull()) {
            queue[tail % size] = x;
            tail++;
            no++;
        }
    }

    public void dequeue() {
        // Entfernt das erste Element aus der Warteschlange,

        if (!isEmpty()) {
            queue[head % size] = null;
            head++;
            no--;
        }

    }

    public boolean isEmpty() {
        //liefert true genau dann, wenn die Warteschlange kein Element enthält
        Boolean isEmpty = true;
        for (int i = 0; i < queue.length; i++) {
            if (!(queue[i] == null)) {
                isEmpty = false;
            }
        }

        //isEmpty = no == 0;

        return isEmpty;
    }

    public boolean isFull() {
        //liefert true genau dann, wenn die Warteschlange voll ist
        Boolean isFull = true;
        for (int i = 0; i < queue.length; i++) {
            if (queue[i] == null) {
                isFull = false;
            }
        }

        //isFull = no > 0;

        return isFull;
    }

    public void print() {
        System.out.println("-----");
        System.out.println(queue[0]);
        System.out.println(queue[1]);
        System.out.println(queue[2]);
        System.out.println(queue[3]);
        System.out.println(queue[4]);
        System.out.println("Head = " + head + " Tail = " + tail);
    }

    public static void main(String[] args) {
        Ringbuffer r = new Ringbuffer();

        r.enqueue("A");
        r.enqueue("B");
        r.enqueue("C");
        r.enqueue("D");
        r.enqueue("E");
        r.enqueue("F");

        r.print();

        r.dequeue();
        r.dequeue();

        r.print();

        r.enqueue("F");

        r.print();
    }

}
