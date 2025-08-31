package example;

import java.util.*;

public class Practice5 {
    public static void main(String[] args) {
        //EnumMap
        EnumMap<Day , String> map = new EnumMap<>(Day.class);
        map.put(Day.MONDAY , "Study");
        map.put(Day.TUESDAY , "Study");
        map.put(Day.WEDNESDAY , "Practice");
        map.put(Day.THURSDAY , "Rest");
        map.put(Day.SATURDAY,"Rest");
       // System.out.println(map);
        for(Map.Entry<Day , String> data : map.entrySet()){
            System.out.println(data.getKey()+" -> "+ data.getValue());

        }
        List<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);
        for(Integer list : al){
            System.out.println(list);
        }

        //HashMap
        Map<Integer , String> hm = new HashMap<>();
        hm.put(1 , "One");
        hm.put(2, "Two");
        hm.put(3 , "Three");
        hm.put(4 , "Four");
        hm.put(10 , "Ten");
        hm.put(20, "Twenty");
        hm.put(7, "Seven");
        hm.put(5, "Five");
        System.out.println(hm);
        for(Map.Entry<Integer , String> data : hm.entrySet()){
            System.out.println(data.getKey()+" -> "+data.getValue());
        }
    }
}
