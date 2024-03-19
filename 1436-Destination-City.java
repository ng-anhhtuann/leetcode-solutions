class Solution {
    public String destCity(List<List<String>> a) {
        int m = a.size();
        int n = a.get(0).size();
        if ( m == 1 ) return a.get(0).get(1);
        HashMap<String, Integer> map = new HashMap<>();
        for ( int i = 0 ; i < m; i++){
            String left = a.get(i).get(0);
            String right = a.get(i).get(1);
            map.put(left, map.getOrDefault(left, 1) + 1);
            map.put(right, map.getOrDefault(right, 0) + 1);
        }
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == 1) {
                return entry.getKey();
            }
        }
        return "";
    }
}