package stack;

public class Stack {

    private static final int DEFAULT_SIZE = 10;
    private int[] stackArray;
    private int top = -1;

    public Stack(int arraySize) {
        stackArray = new int[arraySize];
    }

    public Stack() {
        this(DEFAULT_SIZE); // constructor chaining
    }

    /**
     * Check if the stack is empty or not
     *
     * @return true if no items added
     */
    public boolean isEmpty() {
        return top == -1;
    }

    /**
     * Check if the stack is fully or not
     *
     * @return true if the item at the top is equal to the last index
     */
    public boolean isFull() {
        return stackArray.length - 1 == top;
    }

    /**
     * Adds a new item to the top of the stack
     *
     * @param value (new value to add)
     * @return added item
     */
    public int push(int value) {

        top++;
        stackArray[top] = value;

        return value;
    }

    /**
     * Removes the top item of the stack
     *
     * @return removed item
     */
    public int pop() {

        int removed = stackArray[top];
        top--;

        return removed;
    }

    /**
     * Returns the top item of the stack without removing it
     *
     * @return top item
     */
    public int peek() {

        if (!isEmpty()) {
            return stackArray[top];
        }

        return -1;
    }

    /**
     * Returns current items number on the stack (It's a primitive operation? idk)
     *
     * @return number of items
     */
    public int getSize() {
        return top + 1;
    }

}
