class Solution{
    static int sumOfDigits(int n) {
        // code here
        int sum=0;
        while(n>0)
        {
            int digit=n%10;
            sum+=digit;
            n=n/10;
        }
        
        return sum;
    }
}
//https://www.geeksforgeeks.org/problems/sum-of-digits1742/1