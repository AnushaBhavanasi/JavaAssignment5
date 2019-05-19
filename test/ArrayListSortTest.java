import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

import static org.junit.Assert.*;

public class ArrayListSortTest {

    ArrayListSort al;
    @Before
    public void setUp() throws Exception {
        al=new ArrayListSort();
    }

    @After
    public void tearDown() throws Exception {
        al=null;
    }
    @Test
    public void sortArrayList(){
        al=new ArrayListSort();
        SortedSet<String> sort=new TreeSet<String>();
        sort.add("harry");
        sort.add("annie");
        sort.add("zenny");
        sort.add("potter");
        sort.add("bunny");
        ArrayList<String> result=al.sortList(sort);
        System.out.println(result);
        ArrayList<String> res1=new ArrayList<>();
        res1.add("annie");
        res1.add("bunny");
        res1.add("harry");
        res1.add("potter");
        res1.add("zenny");
        assertEquals(res1,result);
    }
}