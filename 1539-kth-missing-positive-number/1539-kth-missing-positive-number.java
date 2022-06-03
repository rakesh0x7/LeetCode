class Solution {
    public int findKthPositive(int[] arr, int k) {
        int[] a = new int[10000];
        int ans =0;
        Arrays.fill(a,0);
        for(int i=0;i<arr.length;i++){
            a[arr[i]]++;
        }
        int s=0;
        int i=1;
        while(i<a.length){
            if(a[i]==0){
                s++;
                ans = i;
            }
            if(s==k) break;
            i++;
        }
        return ans;
    }
}