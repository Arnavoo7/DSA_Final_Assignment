import java.util.HashMap;
import java.util.Map;

class Two{
    public static void main(String[] args){

        String num = "69";
        Map<Character, Character> map = new HashMap<Character, Character>();
        map.put('6', '9');
        map.put('9', '6');
        map.put('0', '0');
        map.put('1', '1');
        map.put('8', '8');

        int l = 0, r = num.length() - 1;

        while (l <= r) {
            if (!map.containsKey(num.charAt(l))) System.out.println(false);
            if (map.get(num.charAt(l)) != num.charAt(r))
                System.out.println(false);
            l++;
            r--;
        }

        System.out.println(true);
    }
}