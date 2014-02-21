/**
 * Created by tiesums on 21.02.14.
 */
public class ListNode<T> {

    private Konto konto; // Daten; hier ein String
    private ListNode<T> next; // Referenz zum nächsten ListNode-Objekt, rekursiv!

    public ListNode(ListNode<T> n, Konto k) {
        next = n;
        konto = k;
    }

    public Konto getKonto() {
        return konto;
    }

    public void setKonto(Konto konto) {
        this.konto = konto;
    }

    public void setNext(ListNode<T> n) {
        next = n;
    }

    public ListNode<T> getNext() {
        return next;
    }
}
