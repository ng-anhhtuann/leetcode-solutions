class Solution {
    public int maximumProduct(int[] nums) {
        int n = nums.length;

        // Find the three largest elements
        int max1 = Integer.MIN_VALUE;
        int max2 = Integer.MIN_VALUE;
        int max3 = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num > max1) {
                max3 = max2;
                max2 = max1;
                max1 = num;
            } else if (num > max2) {
                max3 = max2;
                max2 = num;
            } else if (num > max3) {
                max3 = num;
            }
        }

        // Find the two smallest elements
        int min1 = Integer.MAX_VALUE;
        int min2 = Integer.MAX_VALUE;
        for (int num : nums) {
            if (num < min1) {
                min2 = min1;
                min1 = num;
            } else if (num < min2) {
                min2 = num;
            }
        }

        // Return the maximum of the two products
        return Math.max(max1 * max2 * max3, min1 * min2 * max1);
    }
}


// class Solution {
//     public int maximumProduct(int[] n) {
//         int mul = Integer.MIN_VALUE;
//         int size = n.length;
//         if ( size == 3) return n[0]*n[1]*n[2];
//         for ( int i = 0; i < size-2; i++){
//             for ( int j = i+1; j < size-1; j++){
//                 for ( int k = j+1; k < size; k++){
//                     mul = mul > n[i]*n[j]*n[k] ? mul : n[i]*n[j]*n[k];
//                 }
//             }
//         }
//         return mul;
//     }
// }
