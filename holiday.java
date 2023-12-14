public class holiday {
    static String dayStr;
    static String intro = "On the twelfth day of Christmas, my true love gave to me ";
    static String day1 = "a partridge in a pear tree.";
    static String day2 = "two turtle doves, and ";
    static String day3 = "three French hens, ";
    static String day4 = "four calling birds, ";
    static String day5 = "five golden rings, ";
    static String day6 = "six geese a-laying, ";
    static String day7 = "seven swans a-swimming, ";
    static String day8 = "eight maids a-milking, ";
    static String day9 = "nine ladies dancing, ";
    static String day10 = "ten lords a-leaping, ";
    static String day11 = "eleven pipers piping, ";
    static String day12 = "twelve drummers drumming, ";

    public static void main(String[] args) {
        System.out.println();
        System.out.println();
        for (int i = 1; i <= 12; i++) {
            whatDay(i);
            System.out.println(day(i));
            System.out.println();
        }
    }
    public static String day(int day) {
        switch (day) {
            case 1:
                return day1;
            case 2:
                return day2 + day1;
            case 3:
                return day3 + day2 + day1;
            case 4:
                return day4 + day3 + day2 + day1;
            case 5:
                return day5 + day4 + day3 + day2 + day1;
            case 6:
                return day6 + day5 + day4 + day3 + day2 + day1;
            case 7:
                return day7 + day6 + day5 + day4 + day3 + day2 + day1;
            case 8:
                return day8 + day7 + day6 + day5 + day4 + day3 + day2 + day1;
            case 9:
                return day9 + day8 + day7 + day6 + day5 + day4 + day3 + day2 + day1;
            case 10:
                return day10 + day9 + day8 + day7 + day6 + day5 + day4 + day3 + day2 + day1;
            case 11:
                return day11 + day10 + day9 + day8 + day7 + day6 + day5 + day4 + day3 + day2 + day1;
            case 12:
                return day12 + day11 + day10 + day9 + day8 + day7 + day6 + day5 + day4 + day3 + day2 + day1;
            default:
                break;
        }
        return "Error";
    }

    public static void whatDay(int day) {
        switch (day) {
            case 1:
                dayStr = "first";
                break;
            case 2:
                dayStr = "second";
                break;
            case 3:
                dayStr = "third";
                break;
            case 4:
                dayStr = "fourth";
                break;
            case 5:
                dayStr = "fifth";
                break;
            case 6:
                dayStr = "sixth";
                break;
            case 7:
                dayStr = "seventh";
                break;
            case 8:
                dayStr = "eighth";
                break;
            case 9:
                dayStr = "ninth";
                break;
            case 10:
                dayStr = "tenth";
                break;
            case 11:
                dayStr = "eleventh";
                break;
            case 12:
                dayStr = "twelfth";
                break;
        }
        System.out.print("On the " + dayStr + " day of Christmas, my true love gave to me ");
    }
}