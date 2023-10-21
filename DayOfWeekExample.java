public class DayOfWeekExample {
    // Define an enum for the days of the week
    public enum Day {
        SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
    }

    public static void main(String[] args) {
        Day currentDay = Day.FRIDAY; // Change this to represent the current day

        switch (currentDay) {
            case MONDAY:
                System.out.println("It's Monday! Time to get ready for school.");
                break;
            case TUESDAY:
                System.out.println("It's Tuesday! I've survived Monday.");
                break;
            case WEDNESDAY:
                System.out.println("It's Wednesday! You're half-way to a weekend.");
                break;
            case THURSDAY:
                System.out.println("It's a weekday. Keep up the good work!");
                break;
            case FRIDAY:
                System.out.println("It's Friday! It's a must needed break, Thank God it's Friday.");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("It's the weekend. Enjoy your rest day and have fun!");
                break;
            default:
                System.out.println("Invalid day.");
        }
    }
}
