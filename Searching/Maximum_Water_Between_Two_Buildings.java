/*
 *Given an integer array representing the heights of N buildings, the task is to delete N-2 buildings such that the water that can be trapped between the remaining two building is maximum.
Note: The total water trapped between two buildings is gap between them (number of buildings removed) multiplied by height of the smaller building.

Example 1:

Input:
N = 6
height[] = {2,1,3,4,6,5}
Output: 8
Explanation: The heights are 2 1 3 4 6 5.
So we choose the following buildings
2,5  and remove others. Now gap between 
two buildings is equal to 4, and the
height of smaller one is 2. So answer is
2 * gap = 2*4 = 8. There is
no answer greater than this.
Example 2:

Input:
N = 2
height[] = {2,1}
Output: 0
Explanation: The heights are 2 1.
But there is no other buildings to be 
removed so total removed= 0.  
Now the height of smaller one is 1.
So answer is 1 * removed buildings = 1*0
= 0.
 */
public class Maximum_Water_Between_Two_Buildings {
    static int maxWater(int height[], int n) {
        // Your code here
        int left = 0;
        int right = n - 1;

        int max = 0;

        while (left < right) {
            int ans = Math.min(height[left], height[right]) * (right - left - 1);

            if (ans > max) {
                max = ans;
            }

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }

        return max;

    }
}
