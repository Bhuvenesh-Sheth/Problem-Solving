
class Replace_Elements_with_Greatest_Element_on_Right_Side {
    public int[] replaceElements(int[] arr) {
        if (arr.length == 1) {
            return new int[] { -1 };
        }
        int maxright = Integer.MIN_VALUE;
        int[] right = new int[arr.length];
        right[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            int before = arr[i + 1];
            maxright = Math.max(maxright, before);
            right[i] = maxright;
        }

        return right;

    }
}
