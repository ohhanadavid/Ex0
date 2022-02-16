package com.david;

import java.util.InputMismatchException;

public class HourlyEmployee extends Employee {
    private  int hours;
    private  float wage;

    public HourlyEmployee(String firstName, String lastName, int id, int hours, float wage) {
        super(firstName, lastName, id);
        if(hours<0||wage<0)
            throw new InputMismatchException();
        this.hours = hours;
        this.wage = wage;
    }

    public HourlyEmployee() {
        super();
        this.hours=0;
        this.wage=0;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        if(hours<0)
            throw new InputMismatchException();
        this.hours = hours;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        if(wage<0)
            throw new InputMismatchException();
        this.wage = wage;
    }

    @Override
    public String toString() {
        return super.toString()+ "HourlyEmployee{" +
                "hours=" + hours +
                ", wage=" + wage +
                "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof HourlyEmployee)) return false;
        if (!super.equals(o)) return false;

        HourlyEmployee that = (HourlyEmployee) o;

        if (hours != that.hours) return false;
        return Float.compare(that.wage, wage) == 0;
    }



    @Override
    public double earnings()
    {
        return  this.wage*this.hours;
    }

}
