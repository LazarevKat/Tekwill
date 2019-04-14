/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg10.pkg5;

/**
 *
 * @author Kate
 */
public class Holiday {

    private String name;
    private int day;
    private String month;

    Holiday(String name, int day, String month) {
        this.name = name;
        this.day = day;
        this.month = month;

    }

    public boolean inSameMonth(Holiday day1, Holiday day2) {
        if (day1.month.equals(day2.month)) {
            return true;
        } else {
            return false;
        }
    }

    public double avgDate(Holiday days[]) {
        double sum = 0;
        for (int i = 0; i <= days.length; i++) {
            sum = sum + days[i].day;
        }
        return sum/days.length;
    }

}
