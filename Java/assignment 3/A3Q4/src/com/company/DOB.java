package com.company;

import org.w3c.dom.ls.LSOutput;

import java.util.Objects;

public class DOB implements Comparable<DOB>  {
    int day, month, year;

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public DOB(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }



    @Override
    public String toString() {
        return "DOB{" +
                "day=" + day +
                ", month=" + month +
                ", year=" + year +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        DOB dob = (DOB) o;
        return this.getDay() == dob.getDay() && this.getMonth() == dob.getMonth() && getYear()!=dob.getYear();
    }
    @Override
    public int hashCode() {
        return Objects.hash(getDay(), getMonth());
    }

    @Override
    public int compareTo(DOB o) {
        if (this.day==o.day && this.month==o.month)
            return 0;
        else return 1;
    }
}
