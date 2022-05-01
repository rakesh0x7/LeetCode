// { Driver Code Starts
//Initial Template for Java

import java.util.*;
import java.io.*;

public class Main {

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int tc = Integer.parseInt(br.readLine().trim());
        while (tc-- > 0) {
            String[] inputLine;
            inputLine = br.readLine().trim().split(" ");
            int n = Integer.parseInt(inputLine[0]);
            int m = Integer.parseInt(inputLine[1]);
            int[][] arr = new int[n][m];
            inputLine = br.readLine().trim().split(" ");
        
            for (int i = 0; i < n; i++) {
                for (int j = 0; j < m; j++) {
                    arr[i][j] = Integer.parseInt(inputLine[i * m + j]);
                }
            }
            int ans = new Solution().rowWithMax1s(arr, n, m);
            System.out.println(ans);
        }
    }
}
// } Driver Code Ends


//User function Template for Java

class Solution {
    int rowWithMax1s(int arr[][], int n, int m) {
        // code here
        int max = 0;
        int rowid=-1;
        for(int i=0;i<arr.length;i++){
            int mm = 0;
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j]==1) mm++;
            }
            rowid = max<mm?i:rowid;
            max = Math.max(max,mm);
        }
        
        return rowid;
        // int left = 0 , right = arr[0].length-1;
        // int top = 0;
        // int down = arr.length-1;
        // while(top<down){
        //     int count=0;
        //     for(int i=left;i<=right;i++){
        //         count++;
        //     }
        //     rowid = max>count?top:rowid;
        //     max = Math.max(max,count);
        //     top++;
            
        // }
        // return rowid;
    }
}