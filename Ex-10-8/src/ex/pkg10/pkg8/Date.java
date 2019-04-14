/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex.pkg10.pkg8;

/**
 *
 * @author Kate
 */
public class Date {
    private int month;
    private int day;
    private int year;
 
    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        if (month>=1 && month<=12)
        this.month = month;
        else System.out.println("month value is illigal");
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        if(day>=1 && day <=31)
        this.day = day;
        else System.out.println("day value is illigal");
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year >0)
        this.year = year;
        else System.out.println("year value is illigal");
    }
    public void displayDate(){
        System.out.println(month +"/"+day+"/"+year);
    }
}
