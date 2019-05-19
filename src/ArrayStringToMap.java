import java.util.HashMap;
import java.util.Map;

public class ArrayStringToMap {
    public Map<String,Boolean> arrayToMap(String[] str) {
        Map<String, Boolean> stringmap = new HashMap<>();
        for (String word : str) {
            if (stringmap.containsKey(word)) {
                stringmap.replace(word, true);
            } else {
                stringmap.put(word, false);
            }
        }
        return stringmap;
    }
}



