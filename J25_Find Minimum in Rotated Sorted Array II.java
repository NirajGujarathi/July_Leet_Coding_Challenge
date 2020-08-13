class Solution {
    public int findMin(int[] nums) {
        int l=0; int h=nums.length-1;
        // if(nums.length==0) return -1;
        if(nums.length==1 || nums[h]>nums[l]) return nums[0];
        while(l<h){
            int mid=l+(h-l)/2;
            if(nums[mid]==nums[h])
                h--;
            else if(nums[mid]<nums[h])
                h=mid;
            else
                l=mid+1;
        }return nums[l];
        
            
//         Arrays.sort(nums);
//         return nums[0];
        }
    
    }


/*
Find Minimum in Rotated Sorted Array II

Solution
Suppose an array sorted in ascending order is rotated at some pivot unknown to you beforehand.

(i.e.,  [0,1,2,4,5,6,7] might become  [4,5,6,7,0,1,2]).

Find the minimum element.

The array may contain duplicates.

Example 1:

Input: [1,3,5]
Output: 1
Example 2:

Input: [2,2,2,0,1]
Output: 0
Note:

This is a follow up problem to Find Minimum in Rotated Sorted Array.
Would allow duplicates affect the run-time complexity? How and why?
*/
