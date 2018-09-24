package pl.radox.homework2;

public class CharStack {
    private char[] charStack;
    private int stackPointer;


    public CharStack(int size) {
        this.charStack = new char[size];
        this.stackPointer = 0;
    }

    boolean isEmpty() {
        return stackPointer == 0;
    }

    boolean isFull() {
        return stackPointer == charStack.length;
    }

    char readCharFromStack() throws Exception {
        if (isEmpty()) {
            throw new Exception("Stack is Empty");
        }
        return charStack[stackPointer - 1];
    }

    void push(char c) throws Exception {
        if (isFull()) {
            throw new Exception("Stack is full");
        } else {
            charStack[stackPointer] = c;
            stackPointer++;
        }
    }

    void pop() {
        if (!isEmpty()) {
            stackPointer--;
        }
    }


}
