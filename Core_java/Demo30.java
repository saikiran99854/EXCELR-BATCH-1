package Core_java;

import java.util.ArrayList;
import java.util.Iterator;

public class Demo30 {
    void arrayListMethod() {
        ArrayList<Integer> arraylist1 = new ArrayList<>();
        arraylist1.add(100);
        arraylist1.add(200);
        arraylist1.add(100);
        arraylist1.add(0);
        arraylist1.add(900);
        arraylist1.add(600);
        System.out.println("Elements of the list: ");

        Iterator<Integer> iterate = arraylist1.iterator();

        while (iterate.hasNext()) {
            System.out.println(iterate.next());
        }

    }

    public class Demo030 {

        public static void main(String[] args) {
            Demo30 obj = new Demo30();
            obj.arrayListMethod();

        }
    }
}
