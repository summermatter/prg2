/**
 * Created by tiesums on 21.02.14.
 */
public class LinkedList<T> {

    private ListNode<T> head;

    // Kopf bzw. Anfang der Liste
    public LinkedList() {
        head = null;
    }

    /**
     * Prüft, ob Liste leer ist.
     */
    public boolean isEmpty() {
        return (head == null);
    }

    /**
     * Fügt Konto k am Anfang in die Liste ein.
     */
    public void insert(Konto k) {
        head = new ListNode<T>(head, k);
    }

    /**
     * Prüft, ob ein gleiches Konto wie k in der Liste enthalten ist.
     */
    public boolean contains(Konto k){
        ListNode<T> actualNode = head;
        while ((actualNode != null) && !k.equals(actualNode.getKonto())){
            actualNode = actualNode.getNext();
        }
        if (actualNode == null){
            return false;
        } else {
            return true;
        }
    }

    /**
     * Entfernt aus der Liste das erste Konto gleich k
     */
    public void remove(Konto k){
        ListNode<T> actualNode = head;
        ListNode<T> prevNode = null;
        while ((actualNode != null) && !k.equals(actualNode.getKonto())){
            prevNode = actualNode;
            actualNode = prevNode.getNext();
        }
        // Liste wieder ordentlich zusammenhängen
        if (actualNode != null){
            if (actualNode == head){
                head = actualNode.getNext();
            } else {
                prevNode.setNext(actualNode.getNext());
            }
        }
    }

    /**
     * Gibt alle Konti der Reihe nach zeilenweise auf die Konsole aus.
     */
    public  void print(){
        ListNode<T> actualNode = head;
        System.out.println("----------");
        while (actualNode != null){
            System.out.println(actualNode.getKonto());
            actualNode = actualNode.getNext();
        }
    }

    // Test
    public static void main(String[] args){
        LinkedList<Konto> list = new LinkedList<Konto>();
        list.insert(new Konto(1000.0, 1.2));
        list.insert(new Konto(100.0, 1.0));
        list.insert(new Spar(200.0, 2.0, 50));
        list.print();
    }
}
