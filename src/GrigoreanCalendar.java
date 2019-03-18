public class GrigoreanCalendar {
    public static void main(String[] args) {
        System.out.println(leapYearCount(1));
        System.out.println(leapYearCount(4));
        System.out.println(leapYearCount(100));


    }
    public static int leapYearCount(int year) {
        return (year/400+ year/4)-(year/100);
    }

}
