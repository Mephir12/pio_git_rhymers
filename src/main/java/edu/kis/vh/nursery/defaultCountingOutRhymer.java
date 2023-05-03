package edu.kis.vh.nursery;

public class defaultCountingOutRhymer {

    private static final int MAX_SIZE = 12;
    private static final int VALUE = -1;
    private final int[] numbers = new int[MAX_SIZE];

    private int total = VALUE;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == VALUE;
    }

    public boolean isFull() {
        return total == MAX_SIZE -1;
    }

    protected int peekaboo() {
        if (callCheck())
            return -1;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return -1;
        return numbers[total--];
    }

}
