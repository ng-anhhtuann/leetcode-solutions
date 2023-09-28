class Solution {
    public int[] sortArrayByParity(int[] a) {
        int n = a.length;
        int i = 0, j = n-1;
        while ( i < j ){
            if (a[i] %  2 == 1 && a[j] % 2 == 0){
                swap(a, i, j);
                i++; j--;
            } else if (a[i] %  2 == 1 ){
                j--;
            } else if (a[i] %  2 == 0 ){
                i++;
            } else {
                i++; j--;
            }
        }
        return a;
    }

    private void swap(int[] a, int i, int j){
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }
}