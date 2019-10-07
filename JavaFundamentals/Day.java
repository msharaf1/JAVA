public class Day{
    EnuWeekDays eDays;
    public Day(EnuWeekDays eDays){
        this.eDays = eDays;
    }
    public void getDays(){
        switch(eDays){
            case MONDAY:
                System.out.println("Mondays are boring days.");
                    break;
            case TUESDAY:
                System.out.println("Tuesdays are work days, but slow ones");
                    break;
            case FRIDAY:
                System.out.println("Fridays are happy days");
            case SATURDAY: case SUNDAY:
                System.out.println("Weekends are fun days!");
                    break;
            default:
                System.err.println("MidWeek days are work days to make money for weekends!");
        }

    }
}