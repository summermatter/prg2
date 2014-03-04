/**
 * Created by Shawn Summermatter on 25/02/14.
 */
public class ListNode<E>
{
    private E data;
    private ListNode<E> next;
    private ListNode<E> prev;


    public void add(ListNode<E> newNode, ListNode<E> current){
        newNode.next = current;
        newNode.prev = current.prev;
        current.prev.next = newNode;
        current.prev = newNode;
    }

    public void remove(ListNode<E> current){
        current.prev.next = current.next;
        current.next.prev = current.prev;
        current = null;
    }
}
