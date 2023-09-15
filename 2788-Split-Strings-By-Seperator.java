class Solution {
    public List<String> splitWordsBySeparator(List<String> w, char s) {
        List<String> res = new ArrayList<>();
        for (int i = 0 ; i < w.size(); i++ ){
            String[] tmp = w.get(i).split("\\"+String.valueOf(s));
            for ( String j : tmp ){
                if ( j.length() != 0) res.add(j);
            }
        }
        // System.gc();
        return res;
    }
}