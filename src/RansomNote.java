import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class RansomNote {

    public static boolean checkWords(String[] magazine,String ransom[]){
        Arrays.sort(magazine);
        Arrays.sort(ransom);
        List<String> magazineList=new ArrayList<>(Arrays.asList(magazine));
       // magazineList.addAll(Arrays.asList(magazine));
        for(String word:ransom){
            if(!magazineList.remove(word)){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String magazine[] = new String[m];
        for(int magazine_i=0; magazine_i < m; magazine_i++){
            magazine[magazine_i] = in.next();
        }
        String ransom[] = new String[n];
        for(int ransom_i=0; ransom_i < n; ransom_i++){
            ransom[ransom_i] = in.next();
        }
        //need to find all words from ransom in magazine
        if(checkWords(magazine,ransom)){
            System.out.print("Yes");
        }else{
            System.out.print("No");
        }

    }
}
