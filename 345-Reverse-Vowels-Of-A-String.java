// class Solution {
//     public String reverseVowels(String s) {
//         int n = s.length();
//         char[] a = new char[n];
//         int l = 0;
//         int r = n-1;
//         while ( l <= r ){
//             if (s.charAt(l) == 'e' || s.charAt(l) == 'a' || s.charAt(l) == 'i' || s.charAt(l) == 'o' || s.charAt(l) == 'u' || s.charAt(l) == 'E' || s.charAt(l) == 'A' || s.charAt(l) == 'I' || s.charAt(l) == 'O' || s.charAt(l) == 'U'){
//                 if (s.charAt(r) == 'e' || s.charAt(r) == 'a' || s.charAt(r) == 'i' || s.charAt(r) == 'o' || s.charAt(r) == 'u' || s.charAt(r) == 'E' || s.charAt(r) == 'A' || s.charAt(r) == 'I' || s.charAt(r) == 'O' || s.charAt(r) == 'U'){
//                     a[l] = s.charAt(r);
//                     a[r] = s.charAt(l);
//                     l++; r--;
//                 } else {
//                     a[r] = s.charAt(r);
//                     r--;
//                 }
//             } else {
//                 a[l] = s.charAt(l);
//                 l++;
//             }
//         }
//         return String.valueOf(a);
//     }
// }

class Solution {
    public String reverseVowels(String s) {
        int n = s.length();
        char[] a = s.toCharArray();
        int l = 0;
        int r = n - 1;
        while (l <= r) {
            if (isVowel(a[l]) && isVowel(a[r])) {
                swap(a, l, r);
                l++;
                r--;
            } else {
                if (!isVowel(a[l])) {
                    l++;
                }
                if (!isVowel(a[r])) {
                    r--;
                }
            }
        }
        return new String(a);
    }

    private boolean isVowel(char c) {
        return "aeiouAEIOU".indexOf(c) != -1;
    }

    private void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
