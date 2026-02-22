import java.util.LinkedList;
import java.util.Stack;

public class StackDemo {
    /* Subclass of Vector, therefore is synchronized and thread-safe 
    LIFO - Last in First Out
    funcs --> can use all the funcs.  of vector class as it is a subclass.
    */
    public static void main(String[] args) {
         Stack<Integer> stack  = new Stack<>();

         stack.push(1);// adds element to the top o the stack
         stack.push(2);
         stack.push(3);
         stack.push(4);
         stack.push(5);
         System.out.println(stack);

         int topElement = stack.pop(); // removes the top element from the Stack.
         System.out.println(stack);

         System.out.println(stack.peek());// peeks at the top element of the Stack without removing it.
        
         int search = stack.search(new Integer(4));
         // returns the first Index of the element in the stack else -1, 
         // counts from top and is 1 based index.
         System.out.println("Index : " + search);
         
         System.out.println(stack.size());
         System.out.println(stack.contains(new Integer(2)));

        //Linked-list can act as stack only because it is a Doubly - LinkedList
         LinkedList<Character> list = new LinkedList<>();
         list.addLast('a'); // same as push()
         list.addLast('b');
         list.addLast('c');
         list.addLast('d');
         list.addLast('e');

         System.out.println(list);

         list.removeLast(); // same as pop()
         
    }
}
