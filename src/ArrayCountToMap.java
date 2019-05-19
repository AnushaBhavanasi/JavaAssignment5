import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class ArrayCountToMap {
    public Map<String, Integer> countOccurances(String str) {
        String[] list= str.split("[\\W_]+");
        Map<String,Integer> count = new HashMap<String,Integer>();
        for (String s : list) {
            if (count.containsKey(s)) {
                count.replace(s, count.get(s) + 1);
            } else {
                count.put(s, 1);
            }
        }
        return count;
    }
}
