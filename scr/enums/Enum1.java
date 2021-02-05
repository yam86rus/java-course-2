package enums;

import java.util.Arrays;

public class Enum1 {
    public static void main(String[] args) {
//        Today today = new Today(WeekDays.MONDAY);
//        today.daysInfo();
        for (WeekDays w : WeekDays.values()) {
            System.out.println(w);
        }
        WeekDays[] arrayWeekDays = WeekDays.values();
        System.out.println(Arrays.toString(arrayWeekDays));

        users[] usersArray = users.values();
        System.out.println(Arrays.toString(usersArray));
        for (users u: users.values()){
            System.out.print(u + " ");
        }
    }
}

enum WeekDays {
    MONDAY, TUESDAY, WEDNSDAY, THURSTDAY, FRIDAY, SATURDAY, SUNDAY;
}

enum users {
    level1, level2, level3;
}


class Today {
    WeekDays weekDay;

    public Today(WeekDays weekDay) {
        this.weekDay = weekDay;
    }

    void daysInfo() {
        switch (weekDay) {
            case MONDAY:
            case TUESDAY:
            case WEDNSDAY:
            case THURSTDAY:
            case FRIDAY:
                System.out.println("Иди на работу");
                break;
            case SATURDAY:
            case SUNDAY:
                System.out.println("Можно отдохнуть");
                break;
        }
    }
}
