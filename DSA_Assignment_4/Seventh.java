class Seventh {
    public static void main(String[] args) {

        int[][] ops = {{2,2}, {3,3}};

        int k=ops.length;
        int m=3,n=3;

        for (int i=0;i<k;i++)
        {
            int z=ops[i][0] ,x=ops[i][1];
            n=Math.min(n,x);
            m=Math.min(m,z);
        }
        System.out.println(m*n);
    }
}