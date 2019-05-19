import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class ReplaceArrayListElementTest {
    ReplaceArrayListElement ra;
    @Before
    public void setUp() throws Exception {
        ra=new ReplaceArrayListElement();
    }

    @After
    public void tearDown() throws Exception {
        ra=null;
    }
    @Test
    public void replaceElement()
    {
        ra=new ReplaceArrayListElement();
        List<String> fruits=new ArrayList<String>();
        fruits.add("apple");
        fruits.add("grape");
        fruits.add("berry");
        fruits.add("strawberry");
        List<String> str=ra.replaceItems(fruits);
        List<String> str2=new ArrayList<>();
        str2.add("green apple");
        str2.add("grape");
        str2.add("berry");
        str2.add("mango");
        assertEquals(str2,str);

    }
    @Test
    public void emptyArrayList()
    {
        ra=new ReplaceArrayListElement();
        List<String> fruits=new ArrayList<String>();
        fruits.add("apple");
        fruits.add("grape");
        fruits.add("berry");
        fruits.add("straw");
        fruits.add("10");
        String str=ra.clearArrayList(fruits);
        assertEquals("true","true");

    }
}