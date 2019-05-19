import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

public class ArrayStringToMapTest {
    ArrayStringToMap as;
    @Before
    public void setUp() throws Exception {
        as=new ArrayStringToMap();
    }
    @After
    public void tearDown() throws Exception {
        as=null;
    }
    @Test
    public void convertArrayToMap(){
        as=new ArrayStringToMap();
        String[] arr={"a","b","a","a","c","c","d"};
        Map<String,Boolean> res=as.arrayToMap(arr);
        Map<String,Boolean> result=new HashMap<String,Boolean>();
        result.put("a",true);
        result.put("b",false);
        result.put("c",true);
        result.put("d",false);
        assertEquals(result,res);
    }
   @Test
   public void GivenStringArray_SameItemsAreAlsoSent_ShouldReturnTrueOrFalseCorresponding() {
       as = new ArrayStringToMap();
       String[] str = {"one", "two", "three", "one", "two"};
       Map<String,Boolean> res= as.arrayToMap(str);
       Map<String,Boolean> result=new HashMap<String,Boolean>();
       result.put("one",true);
       result.put("two",true);
       result.put("three",false);
       assertEquals(result,res);
   }

}