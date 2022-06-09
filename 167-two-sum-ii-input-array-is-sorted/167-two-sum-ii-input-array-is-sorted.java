class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int arr[] = new int[2];
        int start = 0;
        int end= numbers.length-1;
        for(int i=0;i<numbers.length;i++){
            int sum =0;
            sum = numbers[start]+numbers[end];
            if(sum==target){
                arr[0] = start+1;
                arr[1] = end+1;
                break;
            }
            else if(target>sum){
                start++;
            }
            else{
                end--;
            }
        }
        return arr;
    }
}