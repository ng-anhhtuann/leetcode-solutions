class Solution {
    public String toGoatLatin(String s) {
        String[] w = s.split(" ");
        List<String> a = Arrays.asList(w);
        int n = a.size();
        for ( int i = 0 ; i < n; i++) {
            if (a.get(i).charAt(0) == 'u' || a.get(i).charAt(0) == 'e' || a.get(i).charAt(0) == 'o' || a.get(i).charAt(0) == 'a' || a.get(i).charAt(0) == 'i' || a.get(i).charAt(0) == 'U' || a.get(i).charAt(0) == 'E' || a.get(i).charAt(0) == 'O' || a.get(i).charAt(0) == 'A' || a.get(i).charAt(0) == 'I'){
            } else {
                a.set(i, replaceFirst(a.get(i)));
            }
            a.set(i, appendTail(a.get(i)));
            a.set(i, appendFreq(a.get(i), i+1));
        }
        return String.join(" ", a);
    }

    public static String replaceFirst(String s) {
        if (s.length() < 2) {
            return s;
        }

        char[] chars = s.toCharArray();
        char firstChar = chars[0];
        for (int i = 1; i < chars.length; i++) {
            chars[i - 1] = chars[i];
        }
        chars[chars.length - 1] = firstChar;

        return new String(chars);
    }

    public static String appendTail(String s) {
        return s + "ma";
    }

    public static String appendFreq(String s, int n) {
        StringBuilder builder = new StringBuilder(s);

        for (int i = 0; i < n; i++) {
            builder.append('a');
        }

        return builder.toString();
    }
}