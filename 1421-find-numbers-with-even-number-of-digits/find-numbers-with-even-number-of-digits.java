class Solution {
    public int findNumbers(int[] nums) {
        int count=0;
    
        for(int i=0;i<nums.length;i++)
        {
        
            if(nums[i]>9)
            {
                int  a=(int)Math.log10(nums[i])+1;

                if(a%2==0)
                    {
                     count=count+1;
                    }
            }
        }
         return count;   
    }
}