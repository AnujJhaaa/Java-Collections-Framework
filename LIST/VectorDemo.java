import java.util.Vector;

public class VectorDemo {
    /* Vector class was present before collections,
     but now are added to collections framework and is known as legacy class.
     1. Dynamic Array.
     2. Thread- Safe as it is synchronized  i.e. only one thread can use it at a time.
     3. Performce overhead increases for synchronization locking and unlocking costs.

     funcs. --> same as all the List Classes.
     */
    public static void main(String[] args) {
        //Vector<Integer>  vector  = new Vector<>(10, 5); --> (10: intial capacity, 5: incrementcapacity)
        Vector<Integer>  vector  = new Vector<>();

        vector.add(1);
        vector.add(2);
        vector.add(3);
        vector.add(4);
        vector.add(4,5);
        System.out.println(vector);

        System.out.println(vector.get(3));

    }
}
