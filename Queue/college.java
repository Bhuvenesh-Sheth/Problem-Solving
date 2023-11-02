public class college {
    public static int trap(int[] height){
    //base condition
    if(height.length == 0){
        return 0;
    }
    
    int volume = 0;
    int[] maxLeft = new int[height.length];
    int[] maxRight = new int[height.length];

    maxLeft = createMaxLeft(height.length);
    maxRight = createMaxRight(height,maxRight);

    //calculate volume at each bar 
    for(int i = 1; i<height.length; i++){
        int barvolume = Math.min(maxLeft[i],maxRight[i]) - height[i];
        if(barvolume > 0){
            volume
        }
    }
    }
}
