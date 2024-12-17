package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class ArrayListImplementation {
    public static void main(String[] args) {
        ArrayList<Integer> asList = new ArrayList<Integer>(Arrays.asList(1,2,3,4,5,6));
        System.out.println(asList);
        System.out.println(asList.get(3));

//        for (int i = 0; i < asList.size(); i++) {
//            System.out.print(asList.get(i) + ", ");
//        }

        for (Integer list: asList){
            System.out.print(list + ", ");
        }
        Iterator<Integer> iterator = asList.iterator();
        while (iterator.hasNext()) {
            Integer list = iterator.next();
            System.out.print(list);
        }
        int num = 3;
        for (Integer lis : asList) {
            if (asList.get(lis) == num) {
                System.out.println("Element is found at index" + lis);
                break;
            }
        }

    }
}
