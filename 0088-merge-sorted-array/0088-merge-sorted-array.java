class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
     //approach 1 
    //1)for loop for nums array from j=0 to n
    //2) also initialize i=m(so that we add from second array afted  //valid first array elem)
    //3)put elem form num2 to num1
    //4)go to nexrt ith elem (i++)
    //5)now as all elem added sort num1
        
        /*for(int j=0,i=m;j<n;j++){
            nums1[i]=nums2[j];
            i++;
        }
        Arrays.sort(nums1);
        
    }*/
        
        
        //2 approach 2 pinters
        //
        
       /* int i=m-1;
        int j=n-1;
        int k=m+n-1;
        
        while(j>=0){
            if(i>=0 && nums1[i]>nums2[j]){
                nums1[k]=nums1[i];
                k--;
                i--;
            }
            else{
                nums1[k]=nums2[j];
                k--;
                j--;
            }
        }
        */
        
        List<Integer> arrayList=new ArrayList<>();
        
        for(int i=0;i<m;i++){
        arrayList.add(nums1[i]);
        }
        
        for(int i=0;i<nums2.length;i++){
        arrayList.add(nums2[i]);
        }
        
        Collections.sort(arrayList);
        
        for(int i=0;i<m+n;i++){
            nums1[i]=arrayList.get(i);
        }
    }
        
}