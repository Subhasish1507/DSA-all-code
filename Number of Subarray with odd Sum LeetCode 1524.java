class Solution {
    public int numOfSubarrays(int[] arr) 
    {
        int oddCount = 0; // Count no of odd sum
        int evenCount = 0;  //Count no of even sum
        int sum = 0;
        long ans = 0;  //no of odd subarray
        for(int i = 0 ; i<arr.length;i++)
        {
            int val = arr[i];
            sum += val;
            if(sum %2 == 0)  // If sum is even 
            {
                evenCount++;
                ans += oddCount; // if we deduct the previous odd sum we can get odd sum , so added to it in ans
            }
            else
            {
                oddCount++;  // if sum is odd , then if we deduct previous even sum then this will be odd result , so added to the ans
                ans += evenCount+1;
            }
        }
        return (int) (ans%(1000000007));
    }
}
