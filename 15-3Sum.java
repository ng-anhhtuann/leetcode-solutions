class Solution {
    public List<List<Integer>> threeSum(int[] num) {
        // List<List<Integer>> ll = new ArrayList<>();
        // int n = num.length;
        // if ( n < 3 ) {
        // return ll;
        // }
        // for ( int i = 0; i < n - 2; i++ ){
        // for ( int j = i+1; j < n - 1; j++ ){
        // for ( int k = j+1; k < n; k++ ){
        // if ( num[i] + num[j] + num[k] == 0 ){
        // List<Integer> list = new ArrayList<>();
        // list.add(num[i]);
        // list.add(num[j]);
        // list.add(num[k]);
        // Collections.sort(list);
        // if(!ll.contains(list)) ll.add(list);
        // }
        // }
        // }
        // }
        // return ll;

        Arrays.sort(num);
        List<List<Integer>> res = new ArrayList<>();
        for (int i = 0; i < num.length - 2; i++) {
            if (i > 0 && num[i] == num[i - 1])
                continue;
            int l = i + 1, r = num.length - 1;
            while (l < r) {
                int sum = num[i] + num[l] + num[r];
                if (sum == 0) {
                    res.add(Arrays.asList(num[i], num[l], num[r]));
                    while (l < r && num[l] == num[l + 1])
                        l++;
                    while (l < r && num[r] == num[r - 1])
                        r--;
                    l++;
                    r--;
                } else if (sum < 0)
                    l++;
                else
                    r--;
            }
        }
        return res;
    }
}