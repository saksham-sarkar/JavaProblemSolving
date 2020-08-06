package Top100;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedCharacter {
    public static void main(String args[]){
        String str = "aaabbbccaabddefghj";
        getFirstNonRepeated(str);
    }

    private static void getFirstNonRepeated(String str) {
        Map<Character, Integer> lhm = new LinkedHashMap<>();
        for(int i =0;i<str.length();i++){
            if(!lhm.containsKey(str.charAt(i))) {
                lhm.put(str.charAt(i),1);
            }
            else {
                lhm.put(str.charAt(i),lhm.get(str.charAt(i))+1);
            }
        }

        lhm.entrySet().stream().filter(e->e.getValue()==1).limit(1).forEach(
                x-> System.out.println("First Non repeated character  = "+x.getKey()));
    }
}
