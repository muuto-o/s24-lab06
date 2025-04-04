package edu.cmu.cs.cs214.rec04;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

/**
 * Tests for the InheritanceSortedIntList class.
 *
 * @author Nora Shoemaker
 *
 */
public class InheritanceSortedIntListTest {

    private InheritanceSortedIntList list1;
    private InheritanceSortedIntList list2;

    @Before
    public void setUp() {
        list1 = new InheritanceSortedIntList();
        list2 = new InheritanceSortedIntList();
    }

    @Test
    public void testAdd() {
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);

        assertEquals(5, list1.getTotalAdded());

        assertEquals(1, list1.get(0));
        assertEquals(2, list1.get(1));
        assertEquals(2, list1.get(2));
        assertEquals(3, list1.get(3));
        assertEquals(4, list1.get(4));
    }

    @Test
    public void testAddAll() {
        list1.add(1);
        list1.add(3);
        list1.add(2);
        list1.add(4);
        list1.add(2);

        assertEquals(5, list1.getTotalAdded());

        list2.add(3);
        list2.add(0);

        assertEquals(2, list2.getTotalAdded());

        list2.addAll(list1);

        assertEquals(7, list2.getTotalAdded());

        assertEquals(0, list2.get(0));
        assertEquals(1, list2.get(1));
        assertEquals(2, list2.get(2));
        assertEquals(2, list2.get(3));
        assertEquals(3, list2.get(4));
        assertEquals(3, list2.get(5));
        assertEquals(4, list2.get(6));
    }
    /**
     * Uncomment the following code to test your implementation
     * Select all and (CTRL + /) or (COMMAND + /)
     * Feel free to write more tests for your implementation.
     */

    // private InheritanceSortedIntList list1;
    // private InheritanceSortedIntList list2;

    // /**
    // * Called before each test.
    // */
    // @Before
    // public void setUp() {
    // list1 = new InheritanceSortedIntList();
    // list2 = new InheritanceSortedIntList();
    // }

    // /**
    // * Tests for the add() method.
    // */
    // @Test
    // public void testAdd() {
    // // add 5 elements to our list.
    // list1.add(1);
    // list1.add(3);
    // list1.add(2);
    // list1.add(4);
    // list1.add(2);
    // System.out.println(list1.getTotalAdded());
    // // check that the total number of elements added is 5.
    // assertTrue(list1.getTotalAdded() == 5);
    // printList(list1);
    // }

    // /**
    // * Tests for the addAll() method.
    // */
    // @Test
    // public void testAddAll() {
    // // add 5 elements to our first list.
    // list1.add(1);
    // list1.add(3);
    // list1.add(2);
    // list1.add(4);
    // list1.add(2);

    // // check that the total number of elements added is 5.
    // assertTrue(list1.getTotalAdded() == 5);

    // // add 2 elements to a second list.
    // list2.add(3);
    // list2.add(0);

    // // check that the total number of elements added is 2.
    // assertTrue(list2.getTotalAdded() == 2);

    // // add the first list (5 elements) to our second list (2 elements).
    // list2.addAll(list1);

    // // check that the total number of elements added to our second list is 7.
    // assertTrue(list2.getTotalAdded() == 7);
    // }

    // /**
    // * A helper function that prints out the contents of an IntegerList.
    // * @param list IntegerList to be printed out.
    // */
    // private void printList(IntegerList list) {
    // for (int i = 0; i < list.size(); i++) {
    // System.out.print(list.get(i));
    // System.out.print(", ");
    // }
    // System.out.println();
    // }
}