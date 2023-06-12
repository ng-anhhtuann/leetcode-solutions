class Solution {
    public List<String> summaryRanges(int[] a) {
        List<String> res = new ArrayList<>();
        if (a.length == 0) return res;

        int start = a[0];
        int prev = a[0];

        for (int i = 1; i < a.length; i++) {
            if (a[i] == prev + 1) {
                prev = a[i];
            } else {
                res.add(getRange(start, prev));
                start = a[i];
                prev = a[i];
            }
        }

        res.add(getRange(start, prev));

        return res;
    }

    private String getRange(int start, int end) {
        return (start == end) ? String.valueOf(start) : start + "->" + end;
    }
}
