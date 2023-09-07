import java.time.LocalDate;

class Solution {
    public String dayOfTheWeek(int day, int month, int year) {
        LocalDate localDate = LocalDate.of(year, month, day);
        int dayOfWeek = localDate.getDayOfWeek().getValue();
        return switch (dayOfWeek) {
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> throw new IllegalStateException();
        };
    }
}