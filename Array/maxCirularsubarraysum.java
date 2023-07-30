/**
 * maxCirularsubarraysum
 */
public class maxCirularsubarraysum {

    /*
     * DRY RUN
     * 
     * for i=0;
     * - `j = 1`: Calculate `index` as `(0 + 1) % 4` which is 1. Access the element
     * at index 1 in `arr`, which is -2. Add -2 to `currsum`, making it -2. Update
     * `currmax` to -2 (maximum between 5 and -2).
     * - `j = 2`: Calculate `index` as `(0 + 2) % 4` which is 2. Access the element
     * at index 2 in `arr`, which is 3. Add 3 to `currsum`, making it 1. Update
     * `currmax` to 1 (maximum between -2 and 1).
     * - `j = 3`: Calculate `index` as `(0 + 3) % 4` which is 3. Access the element
     * at index 3 in `arr`, which is 4. Add 4 to `currsum`, making it 5. Update
     * `currmax` to 5 (maximum between 1 and 5).
     * 
     * for i=1;
     * - `j = 1`: Calculate `index` as `(1 + 1) % 4` which is 2. Access the element
     * at index 2 in `arr`, which is 3. Add 3 to `currsum`, making it 1. Update
     * `currmax` to 1 (maximum between -2 and 1).
     * - `j = 2`: Calculate `index` as `(1 + 2) % 4` which is 3. Access the element
     * at index 3 in `arr`, which is 4. Add 4 to `currsum`, making it 5. Update
     * `currmax` to 5 (maximum between 1 and 5).
     * - `j = 3`: Calculate `index` as `(1 + 3) % 4` which is 0. Access the element
     * at index 0 in `arr`, which is 5. Add 5 to `currsum`, making it 10. Update
     * `currmax` to 10 (maximum between 5 and 10).
     * 
     * 
     */
    public static int maxsum(int arr[]) {
        int res = arr[0];

        for (int i = 0; i < arr.length; i++) {
            int currmax = arr[i];
            int currsum = arr[i];

            for (int j = 1; j < arr.length; j++) {
                int index = (i + j) % arr.length;
                currsum += arr[index];
                currmax = Math.max(currmax, currsum);
            }

            res = Math.max(res, currsum);
        }
        System.out.println(res);
        return res;
    }

    public static void main(String[] args) {
        int arr[] = { 5, -2, 3, 4 };
        maxsum(arr);
    }

}