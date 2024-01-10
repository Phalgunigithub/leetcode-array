//same as remove duplicate
//but  if(nums[i]!=val){
//     not ++j but j++ or else index out of bound exception
//       return j; not j+1
//
        
class Solution {
    public int removeElement(int[] nums, int val) {
        
        int j=0;
        
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[j++]=nums[i];
            }
        }
        return j;
        
    }
}

/*int[] arr= {1,2,3,3,4,5};
		
		int val=sc.nextInt();
		
		int j=0;
		for(int i=0;i<arr.length;i++) {
			if(arr[i]!=val) {
				arr[j++]=arr[i];
			}
		}
		
		for(int i=0;i<j;i++) {
			System.out.print(arr[i]+" ");
		}*/
