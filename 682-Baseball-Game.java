class Solution {
    public int calPoints(String[] a) {
        int n = a.length;
        List<Integer> continousList = new ArrayList<>();
        for ( int i = 0 ; i < n ;i++) {
            int size = continousList.size();
            if (!a[i].equals("C") && !a[i].equals("D") && !a[i].equals("+")){
                int curr = Integer.valueOf(a[i]);
                continousList.add(curr);
            }
            if ( a[i].equals("C") ){
                continousList.remove(size-1);
            }
            if ( a[i].equals("D") ){
                continousList.add(continousList.get(size-1)*2);
            }
            if ( a[i].equals("+") ){
                continousList.add( continousList.get(size-1) + continousList.get(size-2));
            }
        }
        return continousList.stream().reduce(0, Integer::sum);
    }
}