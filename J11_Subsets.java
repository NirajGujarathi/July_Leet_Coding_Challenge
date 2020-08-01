class Solution {
    List<List<Integer>> sol=new ArrayList();

    public List<List<Integer>> subsets(int[] nums) {
        generate_subset(0,nums,new ArrayList<Integer>());
        return sol;
    }
    public void generate_subset(int j,int [] nums,List<Integer> list){
        sol.add(new ArrayList<>(list));
        for(int i=j;i<nums.length;i++){
            list.add(nums[i]);
            generate_subset(i+1,nums,list); 
            list.remove(list.size()-1); // remove last duplicate one 
        }
    }
}



/*
Subsets

Given a set of distinct integers, nums, return all possible subsets (the power set).

Note: The solution set must not contain duplicate subsets.

Example:

Input: nums = [1,2,3]
Output:
[
  [3],
  [1],
  [2],
  [1,2,3],
  [1,3],
  [2,3],
  [1,2],
  []
]
*/
