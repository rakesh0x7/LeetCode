// { Driver Code Starts
import java.io.*;
import java.util.*;

class GFG {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            int n = sc.nextInt();
            int[] a = new int[n];
            for (int i = 0; i < n; i++) a[i] = sc.nextInt();
            Solution g = new Solution();
            ArrayList<Integer> ans = g.duplicates(a, n);
            for (Integer val : ans) System.out.print(val + " ");
            System.out.println();
        }
    }
}
// } Driver Code Ends


class Solution {
    public static ArrayList<Integer> duplicates(int nums[], int n) {
        // code here4
         int[] arr = new int[nums.length+1];
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
           arr[nums[i]]++;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]>1) ans.add(i);
        }
        // return ans;
    
        Collections.sort(ans);
        if(ans.isEmpty())  ans.add(-1);
        return ans;
    }
}
