// Enum representing days of the week
enum Day {
    MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY;

    // Method inside enum
    public boolean isWeekend() {
        return this == SATURDAY || this == SUNDAY;
    }
}

public class enumExample {
    public static void main(String[] args) {
        // Using enum
        Day today = Day.SATURDAY;

        // Print value
        System.out.println("Today is: " + today);

        // Call method from enum
        if (today.isWeekend()) {
            System.out.println("It's weekend, relax!");
        } else {
            System.out.println("It's a weekday, keep working!");
        }

        // Switch with enum
        switch (today) {
            case MONDAY:
                System.out.println("Start of the week!");
                break;
            case FRIDAY:
                System.out.println("Almost weekend!");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Enjoy your weekend!");
                break;
            default:
                System.out.println("Midweek day.");
        }

        for(Day d : Day.values())
        {
            System.out.println(d);
        }
    }
}