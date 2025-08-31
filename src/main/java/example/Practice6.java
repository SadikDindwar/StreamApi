package example;

import java.util.HashMap;
import java.util.Map;
import java.util.WeakHashMap;

public class Practice6 {
    public static void main(String[] args) throws Exception {
        WeakHashMap<Object , String> map = new WeakHashMap<>();
        Object obj = new Object();
        map.put(obj , "Data");
        System.out.println("Before Garbage Collection :" + map);
        obj = null;
        System.gc();
        Thread.sleep(2000);
        System.out.println("After Garbage Collections :"+map);

    }
}
