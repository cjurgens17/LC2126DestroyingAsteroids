import static org.junit.Assert.*;

public class LC2126Test {

    @org.junit.Test
    public void canDestroy() {

        boolean actual1 = LC2126.canDestroy(10, new int[] {3,9,19,5,21});
        boolean actual2 = LC2126.canDestroy(5,new int[] {4,9,23,4});

        assertTrue(actual1);
        assertFalse(actual2);
    }
}