
 //5e. Write a program to sort a map by value.
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Map.Entry;
 
public class SortMapByValue {
 
    public static void main(String a[]){
        Map<String, Integer> map = new HashMap<String, Integer>();
        map.put("Ads", 20);
        map.put("Center", 45);
        map.put("Zulu", 2);
        map.put("Internet", 67);
        map.put("Windows", 26);
        map.put("This World", 93);
        Set<Entry<String, Integer>> set = map.entrySet();
        List<Entry<String, Integer>> list = new ArrayList<Entry<String, Integer>>(set);
        Collections.sort( list, new Comparator<Map.Entry<String, Integer>>()
        {
            public int compare( Map.Entry<String, Integer> o1, Map.Entry<String, Integer> o2 )
            {
                return (o2.getValue()).compareTo( o1.getValue() );
            }
        } );
        for(Map.Entry<String, Integer> entry:list){
            System.out.println(entry.getKey()+" ==== "+entry.getValue());
        }
    }
}