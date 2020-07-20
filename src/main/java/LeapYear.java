public class LeapYear {
    public static void main(String args[]) {
        LeapYear leapYear = new LeapYear();
        boolean isleapYear= leapYear.isLeapYear(400);
        System.out.println("isLeapYear:"+isleapYear);
    }


    public  boolean isLeapYear(int year) {
        // If a year is multiple of 400,
        // then it is a leap year
        if (year % 400 == 0)
            return true;

        // Else If a year is muliplt of 100,
        // then it is not a leap year
        if (year % 100 == 0)
            return false;

        // Else If a year is muliplt of 4,
        // then it is a leap year
        if (year % 4 == 0)
            return true;
        return false;
    }
}