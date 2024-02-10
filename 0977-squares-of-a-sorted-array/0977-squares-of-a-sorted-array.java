class Solution {
    public int[] sortedSquares(int[] nums) {
        
        //approch1
        //1)o to n
        //2)i=i*i;
        //3)sort
        
        /*for(int i=0;i<nums.length;i++){
            nums[i]=nums[i]*nums[i];
        }
        Arrays.sort(nums);
        
        return nums;
    }*/
        
        //approch2 
        
       /* int i=0;
        int j=nums.length-1;
        int k=nums.length-1;
        
        
        //not nums.length-1 here
        int res[]=new int[nums.length];
        
        while(i<=j){
            if(nums[i]>nums[j]){
                res[k]=nums[i]*nums[i];
                k--;
                i++;
            }
            else{
                res[k]=nums[j]*nums[j];
                k--;
                j--;
            }
        }
        return res;*/
   int i= 0;
    int j = nums.length - 1;
    int k= nums.length - 1;
        
        int[] ans = new int[nums.length];
        
        
        while (i <= j) {
            if (Math.abs(nums[i]) > Math.abs(nums[j]) ){
                ans[k--] = nums[i] * nums[i];
                i++;
            } else {
                ans[k--] = nums[j] * nums[j];
                j--;
            }
        }
        return ans;
    }
}