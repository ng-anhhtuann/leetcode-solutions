class Solution {

    private final String in = "Push";

    private final String out = "Pop";

    public List<String> buildArray(int[] a, int n) {
        List<String> res = new ArrayList<>();
        int step = 1;
        int size = a.length-1;
        int i = 0;
        while (i <= size){
            int tmp = a[i];
            if ( tmp != step ){
                res.add(in);
                res.add(out);
            } else {
                res.add(in);
                i++;
            }
            step++;
        }
        return res;
    }
}