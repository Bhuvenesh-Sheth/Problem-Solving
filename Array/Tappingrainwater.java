//Given n non-negative integers representing an elevation map where the width of each bar is 1, 
//compute how much water it can trap after raining
// Height=[4,2,0,6,3,2,5]

import java.util.*;
import java.lang.Math;

public static int trap_water(int height[]) {
    int res = 0; // Initialize a variable to accumulate the trapped water
    for (int i = 1; i < height.length - 1; i++) { // Iterate through each bar except the first and last
        int lmax = height[i]; // Initialize the left maximum as the current bar's height
        for (int j = 0; j < i; j++) { // Iterate through all bars to the left of the current bar
            lmax = Math.max(lmax, height[j]); // Update the left maximum if a higher bar is found
        }
        int rmax = height[i]; // Initialize the right maximum as the current bar's height
        for (int j = i + 1; j < height.length; j++) { // Iterate through all bars to the right of the current bar
            rmax = Math.max(rmax, height[j]); // Update the right maximum if a higher bar is found
        }

        res = res + (Math.min(lmax, rmax) - height[i]); // Calculate the trapped water at this position and add it to the result
    }
    System.out.println(res); // Print the final result
    return res; // Return the trapped water as an integer
}


public static int trap_water2(int height[]) {
    int res = 0; // Initialize a variable to accumulate the trapped water
    int lmax[] = new int[height.length]; // Initialize an array to store the left maxima for each bar
    int rmax[] = new int[height.length]; // Initialize an array to store the right maxima for each bar

    lmax[0] = height[0]; // Set the left maximum of the first bar as its height
    for (int i = 1; i < height.length; i++) { // Iterate through all bars except the first
        lmax[i] = Math.max(height[i], lmax[i - 1]); // Compute the left maximum for the current bar as the maximum of the current bar's height and the left maximum of the previous bar
    }

    rmax[height.length - 1] = height[height.length - 1]; // Set the right maximum of the last bar as its height
    for (int i = height.length - 2; i >= 0; i--) { // Iterate through all bars except the last
        rmax[i] = Math.max(height[i], rmax[i + 1]); // Compute the right maximum for the current bar as the maximum of the current bar's height and the right maximum of the next bar
    }

    for (int i = 1; i < height.length - 1; i++) { // Iterate through all bars except the first and last
        res = res + (Math.min(lmax[i], rmax[i]) - height[i]); // Calculate the trapped water at this position and add it to the result
    }

    System.out.println(res); // Print the final result
    return res; // Return the trapped water as an integer
}


    public static void main(String[] args) {

        int[] height = { 4, 2, 0, 6, 3, 2, 5 };

        trap_water2(height);

    }

}
