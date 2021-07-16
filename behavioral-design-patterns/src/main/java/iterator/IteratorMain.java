package iterator;

import java.util.Iterator;
import java.util.List;

public class IteratorMain {

    public static void main(String[] args) {

        /**
         * Данный паттерн уже встроен в Java в пакете util и работает с большинством коллекций
         */

        List<Integer> nums = List.of(0, 1, 2, 3, 4, 5, 6, 7, 8, 9);
        Iterator<Integer> numsIter = nums.iterator();

        while (numsIter.hasNext()) {
            System.out.println(numsIter.next() + 1);
        }

    }

}
