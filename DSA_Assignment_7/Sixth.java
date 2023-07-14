class Sixth {
    public static void main(String[] args)
    {
        String s = "abcde", goal = "cdeab";
        System.out.println(s.length()==goal.length() && (s+s).contains(goal));
    }
}