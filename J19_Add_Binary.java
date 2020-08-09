class Solution {
    int c=0;
    public String addBinary(String a, String b) {
        int al=a.length()-1;
        int bl=b.length()-1;
        StringBuilder str=new StringBuilder();  
        int n1=al+1;
        int n2=bl+1;
        while(n1!=0 && n2!=0){
            if(c==1)
            {
                if(a.charAt(al)=='1' && b.charAt(bl)=='1')
                {
                    c=1;
                    str.append('1');
                }
                else if (a.charAt(al)=='1' || b.charAt(bl)=='1')
                {
                    c=1;
                    str.append('0');
                }
                else{
                    c=0;
                    str.append('1');
                }
            }
            else if(c==0)
            {
                if(a.charAt(al)=='1' && b.charAt(bl)=='1')
                {
                    c=1;
                    str.append('0');
                }
                else if (a.charAt(al)=='1' || b.charAt(bl)=='1')
                {
                    c=0;
                    str.append('1');
                }
                else{
                    c=0;
                    str.append('0');
                }
            }
            al--;
            bl--;
            n1--;
            n2--;
        }
        while(n1!=0){
                if(a.charAt(al)=='1' && c==1)
                {
                    c=1;
                    str.append('0');
                }
                else if (a.charAt(al)=='1' || c==1)
                {
                    c=0;
                    str.append('1');
                }
                else{
                    c=0;
                    str.append('0');
                }
            al--;
            n1--;
        }
        while(n2!=0){
            if(b.charAt(bl)=='1' && c==1)
                {
                    c=1;
                    str.append('0');
                }
                else if (b.charAt(bl)=='1' || c==1)
                {
                    c=0;
                    str.append('1');
                }
                else{
                    c=0;
                    str.append('0');
                }
            bl--;
            n2--;
        }
        if(c==1) str.append('1');
        
        StringBuilder res=new StringBuilder(str);  
         res.reverse();  
        return res.toString(); 
        // return res;
    }
}

/*

Add Binary

Solution
Given two binary strings, return their sum (also a binary string).

The input strings are both non-empty and contains only characters 1 or 0.

Example 1:

Input: a = "11", b = "1"
Output: "100"
Example 2:

Input: a = "1010", b = "1011"
Output: "10101"
 

Constraints:

Each string consists only of '0' or '1' characters.
1 <= a.length, b.length <= 10^4
Each string is either "0" or doesn't contain any leading zero.

*/
