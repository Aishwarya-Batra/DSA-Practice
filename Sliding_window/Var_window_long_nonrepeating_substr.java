import java.util.HashSet;

public class Var_window_long_nonrepeating_substr {
    public static void main(String[] args){
        String s = "aabcddababees";
        int l=0,maxlen=0;

        HashSet<Character> set = new HashSet<>();
        for(int r=0;r<s.length();r++){
            while(set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }

            set.add(s.charAt(r));
            maxlen=Math.max(maxlen,r-l+1);

        }

        System.out.println(maxlen);


    }
    
}
