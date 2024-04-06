package first_ideaprogram.src.Leetcode_100days_Challenge;
import java.util.*;
public class CheckIsomorphic {
    public static void main(String[] args) {
        String s="foo", t="bag";
        System.out.println(isIsomorphic(s,t));
    }
    static boolean isIsomorphic(String s, String t) {
        Map<Character, Character> map = new HashMap<>();
        Map<Character, Character> Rmap = new HashMap<>();

        for(int i=0;i<s.length();i++){
            char str = s.charAt(i);
            char Tstr = t.charAt(i);
            if(map.containsKey(str)){
                if(map.get(str)!=Tstr){
                    return true;
                }
            }
            else{
                map.put(str,Tstr);
            }
            if(Rmap.containsKey(Tstr)){
                if(Rmap.get(Tstr)!=str){
                    return false;
                }
            }
            else{
                Rmap.put(Tstr,str);
            }
        }
        return true;
    }
}
