class Solution {
    public int uniqueMorseRepresentations(String[] a) {
        String[] w = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
        HashSet<String> set = new HashSet<>();
        for( String m : a ){
            set.add(convert(w,m));
        }
        return set.size();
    }

    public String convert(String w[], String a){
        StringBuilder sb = new StringBuilder();
        for(char c : a.toCharArray()){
            sb.append(w[(int)c-'a']);
        }
        return sb.toString();
    }
}