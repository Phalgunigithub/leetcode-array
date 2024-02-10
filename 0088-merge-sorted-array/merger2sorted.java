package array;

import java.util.Arrays;

public class merger2sorted {
	public static void main(String args[]) {
		
		int arr1[]= {1,2,3,0,0,0};
		int arr2[]= {5,6,7};
		
		int m=3;
		int n=3;
		
		
		merge1(arr1,arr2,m,n);
		
		//remember m+n not n
		for(int i=0;i<m+n;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println();
merge2(arr1,arr2,m,n);
		
		//remember m+n not n
		for(int i=0;i<m+n;i++) {
			System.out.print(arr1[i]+" ");
		}
		
	}
	
	//approch 1 
	
	//remember void not arr
	
	public static void merge1(int arr1[],int arr2[],int m,int n) {
		
		int i=m-1;
		int j=n-1;
		int k=m+n-1;
		
		//remember > not <
		while(j>=0) {
			
			
			if(i>=0 && arr1[i]>arr2[j]) {
				
				arr1[k]=arr1[i];
				k--;
				i--;
			}
			
			else {
				arr1[k]=arr2[j];
				k--;
				j--;
			}
		}
	}
	
	
	//approach 2
	
	public static void merge2(int arr1[],int arr2[],int m,int n) {
	
		for(int j=0,i=m;j<n;j++) {
			arr1[i]=arr2[j];
			i++;
		}
		Arrays.sort(arr1);
	}
	

}
