class Solution {
    public int findJudge(int n, int[][] a) {
        int m = a.length;
        if ( n == 1 ) return n;
        HashMap<Integer, Integer> map = new HashMap<>();
        HashMap<Integer, Integer> mapTrust = new HashMap<>();
        for ( int i = 0 ; i < m ; i++){
            int l = a[i][0];
            int r = a[i][1];
            map.put(r, map.getOrDefault(r, 0) + 1);
            mapTrust.put(l, mapTrust.getOrDefault(l, 0) + 1);
            // log(map);
        }
        return check(n, map, mapTrust);
    }
    public static int check(int n, HashMap<Integer, Integer> map, HashMap<Integer, Integer> mapTrust) {
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() == n - 1 && !mapTrust.containsKey(entry.getKey())) {
                return entry.getKey();
            }
        }
        return -1;
    }

    // public static void log(HashMap<Integer, Integer> map) {
    //     StringBuilder result = new StringBuilder("[ ");
    //     for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    //         result.append("[ ").append(entry.getKey()).append(" , ").append(entry.getValue()).append(" ]");
    //         if (entry.getKey() != map.size()) {
    //             result.append(" -> ");
    //         }
    //     }
    //     result.append(" ]");
    //     System.out.println(result.toString());
    // }
}