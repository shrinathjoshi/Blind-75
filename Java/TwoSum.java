import java.util.HashMap;
import java.util.Map;

public class TwoSum {
	
	//One Pass Hashmap solution
	//Time complexity :- O(n)
	//Space complexity :- O(n)
	
	 public int[] twoSum(int[] nums, int target) {
	        
	        Map<Integer,Integer> cache = new HashMap<Integer,Integer>();
	        
	        for(int i =0;i<nums.length;i++){
	            if(cache.containsKey(target - nums[i])){
	                return new int[]{cache.get(target-nums[i]),i};
	            }
	            else
	                cache.put(nums[i],i);
	        }
	        
	        return new int[]{};
	    }
}
