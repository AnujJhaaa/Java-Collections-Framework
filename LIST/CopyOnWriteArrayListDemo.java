import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;

public class CopyOnWriteArrayListDemo {
    /*1. CopyonWriteArrayList is used when there are more read operations
    then write operations in a list. Is an alternative to Vector<> which is synchronized.
    --> Read Operations are faster as they are direct and do not stop for write operations.
    
    2. Memory overhead is more as a copy is created everytime a write 
    like add or remove operations happens to avoid ConcurrentModificationException.

    3.The new copy's reference is then passed to the list.
     */
    public static void main(String[] args) {
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        //System.out.println(list);

        /*ConcurrentModificationException

        ArrayList<Integer> list2 = new ArrayList<>(list);
        for(int element : list2){ 
            System.out.println(element);

            if(element == 3){
                System.out.println("Adding 0 after 3");
                list2.add(0);
            }
        }
        System.out.println(list2);
        */
        
        for(int element : list){ 
            System.out.println(element);

            if(element == 3){
                System.out.println("Adding 0 after 3");
                list.add(0);
            }
        }
        System.out.println(list);
    }
}
