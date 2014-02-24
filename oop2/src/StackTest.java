import org.junit.Test;

import static junit.framework.Assert.assertEquals;

/**
 * Created by ShawnyBunny on 24/02/14.
 */
public class StackTest {

    @Test
    public void testPushAndPop() throws Exception {
        Stack<String> s = new Stack<String>(3);
        s.push("First");
        s.push("Second");
        s.push("Third");

        assertEquals("Third",s.pop());
        assertEquals("Second",s.pop());
        assertEquals("First",s.pop());
    }

    @Test
    public void testIsEmpty() throws Exception {
        Stack<String> sE = new Stack(5);
        assertEquals("Newly created Stack should be empty", true, sE.isEmpty());
    }

    @Test
    public void testIsFull() throws Exception {
        Stack<String> sF = new Stack(0);
        assertEquals("Size Zero Stack should be always full", true, sF.isFull());
    }
}
