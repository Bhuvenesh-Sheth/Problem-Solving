
//Array insert at index
import java.util.*;

public class problem2 {

    public static void insert(int arr[], int ind, int key) {
        int newarr[] = new int[arr.length + 1];

        for(int i=0;i<ind;i++)
        {
            newarr[i]=arr[i];
        }

        newarr[ind]=key;

        for(int i=ind+1;i<newarr.length;i++)
        {
            newarr[i]=arr[i-1];
        }

        printarr(newarr);

    }

    public static void printarr(int newarr[])
    {
        for(int i=0;i<newarr.length;i++){
        System.out.print(newarr[i]+" ");
        }
    }
    

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        Scanner sc = new Scanner(System.in);
        System.out.print("Index: ");
        int a = sc.nextInt();
        System.out.print("key: ");
        int b = sc.nextInt();

        insert(arr, a, b);
    }

}
