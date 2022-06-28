class Solution {
    public int[] productExceptSelf(int[] nums) {
        int n=nums.length;
        int[] leftP=new int[n];  /* initialize prefix*/
        int[] rightP=new int[n];    /* initialize suffix*/
        int[] finalArray = new int[n];  /* initialize  final O/P array*/
        
        leftP[0] = 1;
        rightP[n-1]=1;
        
        for(int i=1;i<n;i++){
            leftP[i] = nums[i-1]*leftP[i-1]; /*multiply to the right most*/
        }
        for(int i=n-2;i>=0;i--){
            rightP[i] = nums[i+1]*rightP[i+1]; /*multiply to the left most*/
        }
        for(int i=0;i<n;i++){
            finalArray[i] = leftP[i]*rightP[i];
        }
        return finalArray;
    }
}