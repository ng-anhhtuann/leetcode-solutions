class Solution {
    public int numWaterBottles(int bottles, int ex) {
        int num = bottles;
        while (bottles / ex != 0) {
            num += bottles/ex;
            bottles = bottles/ex + bottles%ex;
        }
        return num;
    }
}