import java.util.*;

class College { // Class name should start with a capital letter
    public static int trap(int[] height) {
        // Base condition
        if (height.length == 0) {
            return 0;
        }

        int volume = 0;
        int[] maxLeft = new int[height.length];
        int[] maxRight = new int[height.length];

        maxLeft = createMaxLeft(height, maxLeft);
        maxRight = createMaxRight(height, maxRight);

        // Calculate volume at each bar
        for (int i = 1; i < height.length - 1; i++) {
            int barVolume = Math.min(maxLeft[i], maxRight[i]) - height[i];
            if (barVolume > 0) {
                volume += barVolume;
            }
        }

        return volume;
    }

    private static int[] createMaxLeft(int[] height, int[] maxLeft) {
        maxLeft[0] = 0;
        for (int i = 1; i < height.length; i++) {
            maxLeft[i] = Math.max(height[i - 1], maxLeft[i - 1]);
        }

        return maxLeft;
    }

    private static int[] createMaxRight(int[] height, int[] maxRight) {
        int n = height.length - 1;
        maxRight[n] = 0;
        for (int i = n - 1; i >= 0; i--) {
            maxRight[i] = Math.max(height[i + 1], maxRight[i + 1]);
        }

        return maxRight;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of bars"); // Use System.out.println instead of System.err.println
        int bars = input.nextInt();
        int[] height = new int[bars]; // Corrected array initialization
        System.out.println("Enter the height of bars");
        for (int i = 0; i < bars; i++) {
            height[i] = input.nextInt(); // Use height[i] to assign the input value to the array
        }

        System.out.println("Number of units of trapped rainwater is " + trap(height));
    }
}
