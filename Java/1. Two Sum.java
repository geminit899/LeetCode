/**
 * @author Geminit
 * @create 2018-2-6
 * @lastUpdate 2018-2-6
 */

/**
 *	Description:
 *		Given an array of integers, return indices of the two numbers such that they add up to a specific target.
 *		You may assume that each input would have exactly one solution, and you may not use the same element twice.
 */

class Solution {
	public int[] twoSum(int[] nums, int target) {
		int index[] = new int[2];
		for(int i=0; i<nums.length-1; i++){
			int other = target - nums[i];
			for(int j=i+1; j<nums.length; j++){
				if(nums[j] == other){
					index[0] = i;
					index[1] = j;
					j = nums.length;
					i = nums.length-1;
				}
			}
		}
		return index;
	}
}