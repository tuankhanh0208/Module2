import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {

    Map<String , Integer> map = new HashMap<>();
    map.put("Khanh",30);
    map.put("Khanh1",30);
    map.put("Khanh2",30);
    map.put("Khanh3",30);
        System.out.println(map);
        Map<String , Integer> mapTree = new TreeMap<>(map);
        System.out.println(mapTree);

        Map<String, Integer> linkedHashMap = new LinkedHashMap<>(16, 0.75f, true);
        linkedHashMap.put("Smith", 30);
        linkedHashMap.put("Anderson", 31);
        linkedHashMap.put("Lewis", 29);
        linkedHashMap.put("Cook", 29);
        System.out.println("\nThe age for " + "Lewis is " + linkedHashMap.get("Lewis"));
    }

}
