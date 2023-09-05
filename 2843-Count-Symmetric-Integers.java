class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for ( int i = low; i <= high ; i++){
            String num = Integer.toString(i);
            int len = num.length();
            int sum = 0;
            for ( int j = 0 ; j < len/2 ; j++){
                sum += num.charAt(j)-num.charAt(len-j-1);
            }
            count = len % 2 != 1 && sum == 0 ? count+1 : count;
        }
        return count;
    }

}