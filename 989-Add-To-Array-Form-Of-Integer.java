class Solution {
    public List<Integer> addToArrayForm(int[] a, int k) {
        int n = a.length;
        int cur = k;
        List<Integer> ans = new ArrayList();
        int i = n;
        while (--i >= 0 || cur > 0) {
            if (i >= 0)
                cur += a[i];
            ans.add(cur % 10);
            cur /= 10;
        }
        Collections.reverse(ans);
        return ans;
    }
}

// class Solution{
//     public List<Integer> addToArrayForm(int[] a, int k) {
//         List<Integer> res = new ArrayList<>();
//         int i = a.length - 1;
//         int c = 0;
//         while (i >= 0 || k > 0 || c > 0) {
//             int sum = c;
//             if (i >= 0) sum += a[i];
//             if (k > 0) sum += k % 10;
//             k /= 10;
//             c = sum / 10;
//             res.add(0, sum % 10);
//             i--;
//         }
//         return res;
//     }
// }