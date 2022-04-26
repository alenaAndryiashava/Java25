package com.company;
//1Implement MyDate class (int day, int month, int year). Implement two constructors (day,month,year),
// (day,month) in this case year is 2022.
//4. In MyDate class Implement method int dayBetween(MyDate,MyDate) that returns how many days between
// the two given MyDates
//5. Read about Integer.parseInt(String) method and implement the constructor
// MyDate(String s) which allows creating MyDate from string like “2022-10-21”
//6. In the Employee you need to implement new feature assign a Task(id, status, description)
// to each Employee. Think how you can implement it.
// NOTE each employee can solve more than one task, and each task can be solved by more than one employee.
public class MyDate {
    private int day;
    private int month;
    private int year;

    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public MyDate(int day, int month) {
        this.day = day;
        this.month = month;
        this.year = 2022;
    }

    //2.In MyDate class Implement method compareTo(MyDate) that compare the given MyDate with this MyDate
    public boolean compareTo(MyDate date){
        if(date==null)
            return false;
        return  date.day == this.day &&
                date.month == this.month &&
                date.year == this.year;
    }

    //3. In MyDate class Implement method int dayBetween(MyDate) that returns how many days between
    // given MyDate and this MyDate. Please, do not use any special Date java classes
    public int daysBetween(MyDate date) {
        return daysBetween(this, date);
    }

    public static int daysBetween(MyDate date1, MyDate date2){
        int counterOfDay = 0;



        return counterOfDay;
    }

    public static int getDaysElapsedInYear(MyDate myDate){
        int days = myDate.day;
        for (int i = 1; i < myDate.month; i++) {
            days += getDaysInMonth(myDate);
        }

        return days;
    }

    public static int getDaysInYearRange(int year1, int year2) {
        int days = 0;
        for (int year = Math.min(year1, year2) + 1; year < Math.max(year1, year2) - 1; year++) {
            days += getDaysInYear(year);
        }

        return days;
    }

    public static int getDaysInYear(int year){
        if (isLeapYear(year))
            return 366;
        else
            return 365;
    }

    public static int getDaysInMonth(MyDate myDate) {
        switch (myDate.month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
            case 2:
                if (isLeapYear(myDate.year)) {
                    return 29;
                } else {
                    return 28;
                }
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
            default:
                return 0;

        }
    }

    public static boolean isLeapYear(int year) {
        return year%4==0 && (year%100!=0 || year%400==0);
    }
    //5. Read about Integer.parseInt(String) method and implement the constructor
    // MyDate(String s) which allows creating MyDate from string like “2022-10-21”

    public MyDate(String str) {
        String[] words = str.split("-");
        this.year = Integer.parseInt(words[0]);
        this.month = Integer.parseInt(words[1]);
        this.day = Integer.parseInt(words[2]);

    }


}

