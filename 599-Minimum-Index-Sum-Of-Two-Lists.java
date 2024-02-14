class Solution {
    public String[] findRestaurant(String[] a, String[] b) {
        List<String> lst = new ArrayList<>();
        int m = a.length; int n = b.length; int sum = -1;
        for ( int i = 0 ; i < m; i++ ){
            for ( int j = 0; j < n; j++){
                if ( a[i].equals(b[j]) ){
                    sum = sum < 0 ? i+j : sum;
                    if ( i+j == sum ){
                        lst.add(a[i]);
                    }
                    if ( i+j < sum ){
                        sum = i + j;
                        lst = new ArrayList<>();
                        lst.add(a[i]);
                    }
                }
            }
        }
        String[] res = new String[lst.size()];
        return lst.toArray(res);
    }
}