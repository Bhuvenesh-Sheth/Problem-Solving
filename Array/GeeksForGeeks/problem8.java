/*
Rotate Array 
Input:
N = 5, D = 2
arr[] = {1,2,3,4,5}
Output: 3 4 5 1 2
Explanation: 1 2 3 4 5  when rotated
by 2 elements, it becomes 3 4 5 1 2.
*/public class problem8 {
    
    public static void  rotateArr(int arr[],int k)
    {
        for(int i=0;i<arr.length;i++)
        {
            int index=(i+k)%arr.length;
            System.out.print(arr[index]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={2,4,6,8,10,12,14,16,18,20};
        int k=3;
        rotateArr(arr, k);

    }
}
