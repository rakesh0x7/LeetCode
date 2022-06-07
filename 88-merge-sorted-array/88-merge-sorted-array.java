class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
            int x1=m-1,x2=n-1,x=nums1.length-1;
        while(x1>=0 && x2>=0){
            if(nums2[x2]>nums1[x1]){
                nums1[x--]=nums2[x2--];
            }
            else{
                nums1[x--]=nums1[x1--];}
        }
        while(x2>=0){
            nums1[x--]=nums2[x2--];}
        while(x1>=0)
            nums1[x--]=nums1[x1--];
    }
}