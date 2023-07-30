import java.util.*;

public class binary
{
    public static int binarysearch(int arr[],int key)
    {
        int si=0;
        int ei=arr.length-1;
        while(si<=ei)
        {
            int mid=(si+ei)/2;
            
            if(key==arr[mid])
            {
               System.out.println(mid);
                return mid;
            }
            else if(key<arr[mid])
            {
                ei=mid-1;
            }
            else
            {
               si=mid+1;
            }
        }
        
        return -1;
        
    }
	public static void main(String[] args) {
	    
		int arr[]={1,3,5,8,12,24,32,56,78};
		int key=24;
		
		binarysearch(arr,key);
	}
}