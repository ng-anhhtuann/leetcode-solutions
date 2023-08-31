class Solution {
    // public void sortColors(int[] a) {
    //     int n = a.length;
    //     int l = 0;
    //     int r = n-1;
    //     while (l < r){
    //         if ( n == 1) break;
    //         if ( a[r] == 2){
    //             r--;
    //         }
    //         if ( a[l] == 0){
    //             l++;
    //         }
    //         if ( a[l] == 1 && a[r] == 1){
    //             r--;
    //         }
    //         if (l >= r){
    //             break;
    //         }
    //         if ( a[l] > a[l+1] && a[l] != 1 && a[l+1] != 1){
    //             swap(a,l,l+1);
    //         }
    //         if (a[l] > a[r]){
    //             swap(a,l,r);
    //         }
    //     }
    // }
    public void sortColors(int[] a) {
        int n = a.length;
        int l = 0;
        int r = n - 1;
        int i = 0;

        while (i <= r) {
            if (a[i] == 0) {
                swap(a, i, l);
                l++;
                i++;
            } else if (a[i] == 2) {
                swap(a, i, r);
                r--;
            } else {
                i++;
            }
        }
    }

    public void swap(int[] a, int i, int j) {
        int tmp = a[i];
        a[i] = a[j];
        a[j] = tmp;
    }

    public void log(int[] a) {
        int n = a.length;
        for (int i : a) {
            System.out.print(i + " ");
        }
    }
}
