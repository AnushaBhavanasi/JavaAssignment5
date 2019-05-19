import java.util.List;

public class ReplaceArrayListElement {
    public List<String> replaceItems(List<String> list){
        list.set(0,"green apple");
        list.set(3,"mango");
        return list;
    }
    public String clearArrayList(List<String> list){
        list.clear();
        String result="";
        if(list.isEmpty())
        {
            result="true";
        }
        else
            result="false";
        return result;

    }
}
