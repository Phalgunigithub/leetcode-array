//same as remove duplicate
//but in remove duplicate  we only print till elemnts we want here want to also prit  0 so use while loop to print that
//remaining positions in the array (from insertPos onwards) are filled with zeros using a while loop.


//if     nums[++j]=nums[i];  wrong
//o/p    Your input
/*[0,1,0,3,12]
Output
[0,1,3,0,0]
Expected
[1,3,12,0,0]*/




class Solution {
    public void moveZeroes(int[] nums) {
        
        int j=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=0){
                nums[j++]=nums[i];
            }
        }
        
        while(j<nums.length){
            nums[j++]=0;
        }
        
    }
}