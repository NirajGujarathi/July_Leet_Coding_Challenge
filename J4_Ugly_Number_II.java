class Solution {
    public int nthUglyNumber(int n) {
        if(n<=6) return n;
        else if(n>1690) return 0;
        else{
            int nugly[]=new int[n]; 
            int i2 = 0, i3 = 0, i5 = 0; 
            int next_i2 = 2; 
            int next_i3 = 3; 
            int next_i5 = 5; 
            int  temp = 1; 

            nugly[0] = 1; 
                for (int i=1; i<n; i++) 
                { 
                    nugly[i] = Math.min(next_i2, 
                                        Math.min(next_i3,next_i5)); 
                    // nugly[i] = temp; 
                    if (nugly[i] == next_i2) 
                    { i2++;
                    next_i2 = nugly[i2]*2; 
                    } 
                    if (nugly[i] == next_i3) 
                    { i3++; 
                    next_i3 = nugly[i3]*3; 
                    } 
                    if (nugly[i] == next_i5) 
                    { i5++; 
                    next_i5 = nugly[i5]*5; 
                    } 
                } 
            return nugly[n-1]; 
            }
        }
}







/*
Ugly Number II

Statement -
Write a program to find the n-th ugly number.

Ugly numbers are positive numbers whose prime factors only include 2, 3, 5. 

Example:

Input: n = 10
Output: 12
Explanation: 1, 2, 3, 4, 5, 6, 8, 9, 10, 12 is the sequence of the first 10 ugly numbers.
Note:  

1 is typically treated as an ugly number.
n does not exceed 1690.

*/
