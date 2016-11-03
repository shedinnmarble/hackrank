import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;
import java.util.stream.IntStream;

public class MakingAnagrams {
    public static int numberNeeded2(String first, String second) {
        Map<Character,Integer> aList=new HashMap<Character,Integer>();
        Map<Character,Integer> bList=new HashMap<Character,Integer>();
        int removeCount=0;
        fillList(aList,first);
        fillList(bList,second);
        for(Character key : aList.keySet()){
            if(bList.containsKey(key)){
                removeCount+=Math.abs(aList.get(key)-bList.get(key));
                bList.remove(key);
            }else{
                removeCount+=aList.get(key);
                // aList.remove(key);
            }
        }
        for(Character bKey:bList.keySet()){
            removeCount+=bList.get(bKey);
        }
        return removeCount;
    }
    public static int numberNeeded(String first, String second) {
        int[] freq=new int[26]; //O(1)
        first.chars().forEach(c->freq[c-'a']++);//O(lengthA)
        second.chars().forEach(c->freq[c-'a']--);//O(lengthB)
        return IntStream.of(freq).map(Math::abs).sum();//O(1)
        //In total is O(1)
    }
    public static void fillList(Map<Character,Integer> map,String str){
        for(int i=0;i<str.length();i++){
            char key=str.charAt(i);
            if(map.containsKey(key)){
                map.put(key, map.get(key)+1);
            }else{
                map.put(key, 1);
            }
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String a = in.next();
        String b = in.next();
        System.out.println(numberNeeded(a, b));
    }
}
