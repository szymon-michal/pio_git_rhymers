package edu.kis.vh.nursery.list;

public class IntLinkedList {

    Node Last;
    int i;

    public void push(int i) {
        if (Last == null)
            Last = new Node(i);
        else {
            Last.next = new Node(i);
            Last.next.prev = Last;
            Last = Last.next;
        }
    }

    public boolean isEmpty() {
        return Last == null;
    }

    public boolean isFull() {
        return false;
    }

    public int top() {
        if (isEmpty())
            return -1;
        return Last.Value;
    }

    public int pop() {
        if (isEmpty())
            return -1;
        int ret = Last.Value;
        Last = Last.prev;
        return ret;
    }

}
