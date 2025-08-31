package example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice7 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
       // list.add(50);

        for (Integer i : list) {
            if (i == 30) {
                list.remove(i); // ❌ Unsafe modification during iteration
            }
        }
//        List<String> list1 = new ArrayList<>();
//        list1.add("A");
//        list1.add("B");
//        list1.add("C");
//        list1.add("S");
//        for(String s : list1){
//            if(s.equals("C")){
//                list1.remove();
//            }
//        }
    }
}
