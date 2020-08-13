class Solution {
    public int addDigits(int num) {
        // if(num==0) return 0;
        // else {
        //     return (num%9==0) ? 9 : num%9;
        // }
        int sum=0;
        while(num!=0){
            sum+=num%10;
            num/=10;
            if(num==0 && sum>9){
                num=sum;
                sum=0;
            }
        }
        return sum;
    }
}

/*
Add Digits

Solution
Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.

Example:

Input: 38
Output: 2 
Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2. 
             Since 2 has only one digit, return it.
Follow up:
Could you do it without any loop/recursion in O(1) runtime?
*/
