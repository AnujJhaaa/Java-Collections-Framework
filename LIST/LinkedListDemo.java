import java.util.Arrays;
import java.util.LinkedList;
import java.util.ArrayList;
import java.util.List;

public class LinkedListDemo {
    
    /* 1. Linked-list created using java collections is a Doubly Linked-List.
        2. Used when there are more Insertions and deletetions as no shifting of elements reqd.
        3. Random acess is time costly/slower as it traverses the list 
        from beginning to the reqd index.
        4. More memory reqd. for storing references
        */
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(1); //O(n)
        linkedList.add(2);
        linkedList.add(3);
        linkedList.add(4);
        linkedList.add(5);
        //System.out.println(linkedList);

        linkedList.add(3, 44);
        linkedList.addFirst(0); // 0(n)
        linkedList.addLast(5);
       // System.out.println(linkedList);

       /* funcs. performed on Linked-List
       
       boolean check = linkedList.contains(5) ;
       //System.out.println(check);

       int node  = linkedList.get(3); // O(n)
       //System.out.println(node);

        int size = linkedList.size();
        //System.out.println(size);

        linkedList.set(0,99);
        //System.out.println(linkedList);

        linkedList.remove(0); // O(1)
        linkedList.remove((new Integer(5)));
        //System.out.println(linkedList);

        linkedList.removeFirst();
        linkedList.removeLast();
        linkedList.removeFirstOccurrence((Integer)5);
        linkedList.removeIf(x -> x%2 == 0); // removes if the object is even

        linkedList.indexOf(2);
        linkedList.lastIndexOf(2);
        */

        /*Ways to create Linked-List
        
        ArrayList<Integer> list1 = new ArrayList<>(Arrays.asList(10,9,8,7,6,5)); 
        LinkedList<Integer> list2 = new LinkedList<>(list1);

        linkedList.addAll(list1);
        System.out.println(linkedList);

        linkedList.removeAll(list2);
        System.out.println(linkedList);

        List<String> list3 = List.of("string1","string2","string3");
        LinkedList<String> list4 = new LinkedList<>(list3);
        */

        Integer[] array  = linkedList.toArray(new Integer[0]);
        System.out.println(array[3]);
   
    }
}
