import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ArrayCountToMapTest {
ArrayCountToMap ac;
    @Before
    public void setUp() throws Exception {
        ac=new ArrayCountToMap();
    }

    @After
    public void tearDown() throws Exception {
        ac=null;
    }
    @Test
    public void occurranceCount(){
        ac=new ArrayCountToMap();
        String str="one__ two,one two three,four";
        Map<String,Integer> result=ac.countOccurances(str);
        Map<String,Integer> map=new HashMap<>();
        map.put("one",2);
        map.put("two",2);
        map.put("three",1);
        map.put("four",1);
        assertEquals(map,result);
    }
    @Test
    public void occurranceCountTest(){
        ac=new ArrayCountToMap();
        String str="1 ? 1 .,2";
        Map<String,Integer> result=ac.countOccurances(str);
        Map<String,Integer> map=new HashMap<>();
        map.put("1",2);
        map.put("2",1);
        assertEquals(map,result);


    }
}