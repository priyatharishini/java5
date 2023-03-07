package javachallenge5;

public class Majority1 
{
	 public  static int majorityElement(int[] nums)
	{
	    int count = 0;
	    Integer candidate = null;
	    
	    for (int num : nums) {
	        if (count == 0) {
	            candidate = num;
	        }
	        count += (num == candidate) ? 1 : -1;
	    }
	    
	    return candidate;
	}
	public static void main(String[] args) 
	{
		int[] nums = {2,2,1,1,1,2,2};
		int majority = majorityElement(nums);
		System.out.println(majority); 

	}

}
