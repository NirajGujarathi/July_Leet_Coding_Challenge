class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
     Arrays.sort(nums);
 
    ArrayList<List<Integer>> result = new ArrayList<>();
 
    for (int i = 0; i < nums.length; i++) {
        int l = i + 1;
        int r = nums.length - 1;
 
        if (i > 0 && nums[i] == nums[i - 1]) continue;
        
 
        while (l < r) {
            if (r < nums.length - 1 && nums[r] == nums[r + 1]) {
                r--;
                continue;
            }
 
            if (nums[i] + nums[l] + nums[r] > 0) {
                r--;
            } else if (nums[i] + nums[l] + nums[r] < 0) {
                l++;
            } else {
                ArrayList<Integer> list = new ArrayList<>();
                list.add(nums[i]);
                list.add(nums[l]);
                list.add(nums[r]);
                result.add(list);
                l++;
                r--;
            }
        }
    }
 
    return result;
}
}

/*
3Sum

Solution
Given an array nums of n integers, are there elements a, b, c in nums such that a + b + c = 0? Find all unique triplets in the array which gives the sum of zero.

Note:

The solution set must not contain duplicate triplets.

Example:

Given array nums = [-1, 0, 1, 2, -1, -4],

A solution set is:
[
  [-1, 0, 1],
  [-1, -1, 2]
]
*/
