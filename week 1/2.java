class Solution {

    void printTriangle(int n) {
        // code here
        
        for(int i=0;i<n-1;i++)
        {
            for(int j=n;j>i;j--)
            {
                System.out.print(" ");
            }
            for(int j=1;j<(i*2);j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//https://www.geeksforgeeks.org/problems/triangle-pattern-1661492263/1