import java.util.LinkedList;

/**
 * Created by Shawn Summermatter on 04/03/14.
 */
public class ListTwo implements IList {

    LinkedList<Integer> list = new LinkedList<Integer>();

    public ListTwo(){

    }

    @Override
    public void add(Integer i) {
        list.add(i);
    }

    @Override
    public boolean remove(Integer i) {
        boolean removed = false;

        if (exits(i)) {
            list.remove(i);
            removed = true;
        }

        return removed;
    }

    @Override
    public boolean removeValues(int value) {
        Integer i = new Integer(value);
        boolean removed = false;
        if (list.contains(i)) {
            while (list.contains(i)) {
                removed = remove(i);
            }
        }

        return removed;
    }

    @Override
    public int size() {
        return list.size();
    }

    @Override
    public boolean exits(Integer i) {
        return list.contains(i);
    }

    @Override
    public void print() {
        System.out.println("------");

        for (int i = 0; i < size(); i++) {
            System.out.println("Index: " + i + " Value: " + list.get(i));
        }
        System.out.println("------");
    }

    public static void main (String args[]){
        ListOne l = new ListOne();
        l.add(20);
        l.add(10);
        l.add(5);
        l.add(20);
        l.print();
        l.remove(5);
        l.removeValues(20);
        l.print();
    }
}
