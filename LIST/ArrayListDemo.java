import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);
        arrayList.add(0,0);
        
        /* ways to iterate over a list 
        for(Integer obj : arrayList) {
            System.out.print(obj+ ", ");
        }
        System.out.println();

        for(int i = 0; i<arrayList.size(); i++) {
            System.out.print(arrayList.get(i)+", ");
        }
        System.out.println();
        */

        /* contains(), remove(), indexOf() func. of lists
        System.out.println(arrayList.contains(10));
        System.out.println(arrayList.contains(1));

        arrayList.set(1, 0);

        arrayList.remove(0);
        arrayList.remove(Integer.valueOf(5));
        arrayList.remove((Integer)0);
        arrayList.removeIf(x-> Math.sqrt(x)%1 ==0 );
        System.out.println(list);

        arrayList.indexOf(2);
        arrayList.lastIndexOf(2);
        
        System.out.println(arrayList);*/

        /* creating list, arraylist diff. process
        List<Character> list1= Arrays.asList('a','e','i','o');
        //list1.add('u'); --> list1 is immutable list created using asList()
        list1.set(0,'A'); // replacing is allowed
        System.out.println(list1);
        
        String[] days = {"Monday","Tuesday","Wednesday"};
        List<String> list2 = Arrays.asList(days);
        //list2.add(0, "Sunday"); --> list2 is immutable list created using asList()
        list2.set(0,"Mon"); // replacing is allowed
        //System.out.println(list2);

        List<Integer> list3 = List.of(10, 20, 30, 40, 50);
        //list3 is immutable and irreplcacable.
        //System.out.println(list3);

        
        ArrayList<Character> arrayList1 = new ArrayList<>(list1);
        arrayList1.add('u');
        System.out.println(arrayList1);
        
        ArrayList<Integer> arrayList3 = new ArrayList<>(list3);
        arrayList3.add(0,0);
        System.out.println(arrayList3);
        */

        List<Integer> list4 = List.of(9,8,7,6);
        arrayList.addAll(list4);
        //arrayList.addAll(0,list4);
        System.out.println(arrayList);

        arrayList.removeAll(list4);
        System.out.println(arrayList);

        /* list to an array
        Integer[] arr = arrayList.toArray(new Integer[0]);
        for( int i : arr) {
            System.out.print(i + ", ");
        }
        */

        arrayList.replaceAll(x -> x*x);
        System.out.println(arrayList);

        System.out.println(arrayList.isEmpty());
        arrayList.clear();
        System.out.println(arrayList.isEmpty());

      
    }
}
