//j to keep track of the position where non-duplicate elements will be stored.
//Iterate through  array 
//find unique
//increment j then store   unique in that posn 
// Return the length of the modified array (number of non-duplicate elements), which is j + 1


class Solution {
    
    public int removeDuplicates(int[] nums) {
        int j=0;                           
        for(int i=0;i<nums.length;i++){     
            if(nums[i]!=nums[j])          
            nums[++j]=nums[i];             
            
        }
        return j+1;                         
    }
}

/*int [] arr= {1,1,2,2,2,3,3,4,4};
		
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[j]!=arr[i]) {
				arr[++j]=arr[i];
				
			}
		}
		
		
		
		System.out.println("duplicate");
		for(int i=0;i<j+1;i++) {
			System.out.print(arr[i]+" ");
		}*/