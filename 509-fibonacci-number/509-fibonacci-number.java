class Solution {
    public int fib(int n) {

        int a =0,b=1,c=0;
        int i=0;
        if(n==0||n==1)
        {
            return n;
        }
        while(i<n-1){
            c= a+b;
            a=b;
            b=c;
            i++;
        }
        return c;
    }
}