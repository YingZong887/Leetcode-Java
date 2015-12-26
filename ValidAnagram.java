import java.util.Arrays;
import java.util.HashSet;

/**
 * Created by yingzong on 11/5/15.
 */
public class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if(s ==null || t == null || s.length() != t.length()){
            return false;
        }
        char[] sChar = s.toCharArray();
        char[] tChar = t.toCharArray();

        Arrays.sort(sChar);
        Arrays.sort(tChar);

        return Arrays.equals(sChar,tChar);

    }
}
