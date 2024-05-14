package Arrays.Collections.Stacks;

import java.util.Stack;

public class StackExaple {
    public static Stack<String> createStack(Stack<String> books){
        return books;
    }

    public static void main(String[] args) {
        Stack<String> books = new Stack<>();
        books.push("Core Java");//adding elements into the stack
        books.push("Advance Java");
        books.push("SBMS");
        System.out.println(books);
        books.peek();//get the top element
        books.pop();//remove the last element
        books.empty();//check if stack is empty or not

    }
}
