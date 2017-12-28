import java.util.*;

public class Main3 {
    public static void main(String[] args) {
        Map map =new HashMap();
        map.put("name","张三");
        map.put("age","12");
        map.put("gender","男");
        for (Object o:map.keySet()
             ) {
            System.out.println("key为"+o+"value"+map.get(o));
        }
        Set set =  map.entrySet();
        for (Object o:set
             ) {Map.Entry entry= (Map.Entry)o;
            System.out.println("key为"+entry.getKey()+"value为"+entry.getValue());
        }
        for (Object o:map.values()
             ) {
            System.out.println("value为"+o);
        }
        Iterator iterator = map.entrySet().iterator();
        while (iterator.hasNext()){
            Object next = iterator.next();
            Map.Entry entry = (Map.Entry)next;
            System.out.println("key为"+entry.getKey()+"value为"+entry.getValue());
        }
}
}
