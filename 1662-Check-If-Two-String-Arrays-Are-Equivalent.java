class Solution {
    public boolean arrayStringsAreEqual(String[] w1, String[] w2) {
        StringBuilder a = new StringBuilder();
        StringBuilder b = new StringBuilder();
        for ( String i : w1 ){
            a.append(i);
        }
        for ( String i : w2 ){
            b.append(i);
        }
        return a.toString().equals(b.toString());
    }
}

// class Solution {
//     public boolean arrayStringsAreEqual(String[] w1, String[] w2) {
//         return String.join("", w1).equals(String.join("", w2));
//     }
// }