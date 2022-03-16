import java.util.ArrayList;

public class _28_ImplementStrStr {
    public static void main(String[] args) {
        String haystack = "mississippi";
        String needle = "issip";
        System.out.println(strStr(haystack,needle));
    }

    public static int strStr(String haystack, String needle) {
        if(needle.equals("")){
            return 0;
        }
        if(!haystack.contains(needle)){
            return -1;
        }else{
            return haystack.indexOf(needle);
        }
    }
}
