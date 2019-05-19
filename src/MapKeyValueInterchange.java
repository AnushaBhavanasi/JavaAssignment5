import java.util.Map;

public class MapKeyValueInterchange {
    public Map<String,String> replaceKeyValuePairs(Map<String,String> map)
    {
        String value = map.get("value1");
        map.replace("value2", value);
        map.replace("value1", " ");
        return map;
    }
}
