class Solution {
    public int removeDuplicates(int[] arr) {
       	int j=0;
		for(int i=1;i<arr.length;i++)
		{
		    if(arr[i]!=arr[j])
		    {
                j=j+1;
		        arr[j]=arr[i];
		    
		        
		    }
		}
        return j+1;
}
}