/*
 * Given a binary sorted non-increasing array of 1s and 0s. You need to print
 * the count of 1s in the binary array.
 * 
 * Example 1:
 * 
 * Input:
 * N = 8
 * arr[] = {1,1,1,1,1,0,0,0}
 * Output: 5
 * Explanation: Number of 1's in given
 * binary array : 1 1 1 1 1 0 0 0 is 5.
 * Example 2:
 * 
 * Input:
 * N = 8
 * arr[] = {1,1,0,0,0,0,0,0}
 * Output: 2
 * Explanation: Number of 1's in given
 * binary array : 1 1 0 0 0 0 0 0 is 2.
 */
public class Count_ones_in_binary_array{
    public static int countOnes(int arr[], int N){
        
        // Your code here
         if(arr[0]==0)
            return 0;
        if(arr[N-1]==1)
            return N;
            
        int low =0,high = N-1;
        while(low<=high)
        {
            int mid = (low+high)/2;
            if(arr[mid]==1&&arr[mid+1]==0){
                return mid+1;
            }
            if(arr[mid]==1)
                low = mid+1;
            else
                high = mid-1;
        }
        return 0;
    
    }
}