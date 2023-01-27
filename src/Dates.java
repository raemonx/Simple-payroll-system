
//............................................................
// Assignment 1 , SOEN 6441
// ©Himangshu Shekhar Baruah
// Written by: Himangshu Shekhar BARUAH , Student ID 40229774
//............................................................
/***
 * @author Himangshu Shekhar Baruah
 * Dates class to store the date
 */
public class Dates {
    // attributes of dates class
    private final int day;
    private final String month;
    private final int year;
    // parameterized constructor to fill the day, month and year
    Dates(int day, String month, int year) {
        this.month = month;
        this.day = day;
        this.year = year;
    }

    /***
     * getter method for month
     * @return month
     */
    public String getMonth() {
        return month;
    }
    /***
     * getter method for day
     * @return day
     */
    public int getDay() {
        return day;
    }
    /***
     * getter method for year
     * @return year
     */
    public int getYear() {
        return year;
    }
}

