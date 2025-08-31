package example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Practice2 {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        arrayList.add(10);
        arrayList.add(20);
        arrayList.add(30);
        arrayList.add(40);
        arrayList.add(50);
        arrayList.add(60);

        for(Integer item : arrayList){
            System.out.println(item);
           // arrayList.remove(item); will throw ConcurrentModification Exception
        }
        Iterator<Integer> iterator = arrayList.iterator();
        while(iterator.hasNext()){
            Integer item = iterator.next();
            if(item == 30){
                iterator.remove();
            }
        }
        System.out.println(arrayList);


    }
}
