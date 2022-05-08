import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class NoOfOccurence {
    public static void main(String[] args) {
        String s="chethan";
        char[] t = s.toCharArray();
        Map <Character, Integer> map=new HashMap<>();

        for (char c:t) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c)+1);
            }else {
                map.put(c, 1);
            }
        }
        System.out.println(map);

        Set<Map.Entry<Character, Integer>> entry= map.entrySet();
        for (Map.Entry<Character, Integer> entrySet:entry) {
            if (entrySet.getValue()>1) {

                System.out.println();
                System.out.print(entrySet+" ");
            }
        }
    }
}
