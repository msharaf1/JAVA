public class TestDay{
    public static void main(String[] args) {
        Day firstDay = new Day(EnuWeekDays.MONDAY);
        Day secondDay = new Day(EnuWeekDays.FRIDAY);

        firstDay.getDays();
        secondDay.getDays();

    }
}