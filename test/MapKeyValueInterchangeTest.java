import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class MapKeyValueInterchangeTest {
    MapKeyValueInterchange kv;
    @Before
    public void setUp() throws Exception {
        kv=new MapKeyValueInterchange();
    }

    @After
    public void tearDown() throws Exception {
        kv=null;
    }
    @Test
    public void interchangeValues(){
        kv=new MapKeyValueInterchange();
        Map<String,String> map=new HashMap<String,String>();
        map.put("value1","val123");
        map.put("value2","val456");
        Map<String,String> resultmap=kv.replaceKeyValuePairs(map);
        Map<String,String> mapresult=new HashMap<String,String>();
        mapresult.put("value1"," ");
        mapresult.put("value2","val123");
        assertEquals(mapresult,resultmap);



    }
}