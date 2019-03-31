<<<<<<< HEAD
package twoSum;
=======
package algorithm.twoSum;
>>>>>>> 39ec558ee67e1c0019dcadb02616c68da63ed7ac

public class Solution {

	
	 public int[] twoSum(int[] nums, int target) {
	        
	       int[] ret = new int[2];
			
			for(int i=0;i<nums.length;i++) {
				
				for(int j=i+1;j<nums.length;j++) {
					
					if(target == nums[i]+nums[j]) {
						ret[0] = i;
						ret[1] = j;
						return ret;
						
					}
				}
				
			}
			return ret;    
	    }
}
