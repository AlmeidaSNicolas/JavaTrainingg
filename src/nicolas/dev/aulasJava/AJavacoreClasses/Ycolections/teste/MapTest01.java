package nicolas.dev.aulasJava.AJavacoreClasses.Ycolections.teste;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class MapTest01 {
    public static void main(String[] args) {

        Map<String, String> map = new HashMap<>();
        map.put("teklado", "teclado");
        map.put("mause", "mouse");
        map.put("vc", "você");
        map.putIfAbsent("vc1", "você");

        System.out.println(map);
        map.put("a", "1");
        map.put("a", "5");
        System.out.println(map.get("a"));
        System.out.println(map.get("z"));
        System.out.println(map.get("mause"));

        Set<String> java = new HashSet<>();
        java.add("java");
        java.add("java");

        System.out.println(java.size());



        for (Map.Entry<String, String>entry : map.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

    }


}
