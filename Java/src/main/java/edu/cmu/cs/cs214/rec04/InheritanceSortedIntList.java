package edu.cmu.cs.cs214.rec04;

/**
 * InheritanceSortedIntList -- a variant of a SortedIntList that keeps
 * count of the number of attempted element insertions (not to be confused
 * with the current size, which goes down when an element is removed)
 * and exports an accessor (totalAdded) for this count.
 *
 * @author Nora Shoemaker
 *
 */

public class InheritanceSortedIntList extends SortedIntLinkedList {
    // Write your implementation below with API documentation
    private int totalAdded = 0;

    @Override
    public boolean add(int num) {
        totalAdded++;
        return super.add(num);
    }

    public int getTotalAdded() {
        return totalAdded;
    }
}