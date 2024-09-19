package TreeMap;

import java.util.Locale;
import java.util.Map;
import java.util.StringTokenizer;
import java.util.TreeMap;

public class WordCount {
    public static void main(String[] args) {
    String text = "Hello world this is a simple example, and this is a test. Hello again!";
        text = text.toLowerCase(Locale.ROOT);
        TreeMap<String,Integer> stringIntegerTreeMap = new TreeMap<>();
        StringTokenizer st = new StringTokenizer(text , " .,!?");
        while (st.hasMoreElements()){
            String words = st.nextToken();
            if (stringIntegerTreeMap.containsKey(words)){
                stringIntegerTreeMap.put(words,stringIntegerTreeMap.get(words) + 1);
            }else {
                stringIntegerTreeMap.put(words,1);
            }
        }
        for (Map.Entry<String , Integer> entry : stringIntegerTreeMap.entrySet() ){
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }

}
