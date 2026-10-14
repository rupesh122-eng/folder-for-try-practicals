import java.util.Collections;

public class ArrayList {

    public static void main(String[] args) {

        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        // add element
        list.add(0);
        list.add(3);
        list.add(6);
        list.add(4);
        System.out.println(list);

        // get element
        int element = list.get(0);
        System.out.println(element);

        // add element in between
        list.add(1, 1);
        System.out.println(list);

        // set element
        list.set(0, 5);
        System.out.println(list);

        // delement element
        list.remove(0);
        System.out.println(list);

        // size
        int size = list.size();
        System.out.println(size);

        // loop
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }
        System.out.println();

        // sorting
        Collections.sort(list);
        System.out.println(list);
    }
}
