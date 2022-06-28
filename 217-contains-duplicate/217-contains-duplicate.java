class Solution {
    public boolean containsDuplicate(int[] nums) {
        
//         O(n^2)
        // int n=nums.length;
        // for(int i=0;i<n;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(nums[i]==nums[j])
        //             return true;
        //     }
        // }
        // return false;
        
        HashSet<Integer> num=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(num.contains(nums[i]))return true;
            num.add(nums[i]);
        }
        return false;
    }
}