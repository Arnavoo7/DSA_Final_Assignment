import java.util.Stack;

class Seventh{
    public static void main(String[] args) {

        Seventh se = new Seventh();
        String s = "ab#c", t = "ad#c";
        System.out.println(se.build(s).equals(se.build(t)));
    }

    public String build(String S) {
        Stack<Character> ans = new Stack();
        for (char c: S.toCharArray()) {
            if (c != '#')
                ans.push(c);
            else if (!ans.empty())
                ans.pop();
        }
        return String.valueOf(ans);
    }
}