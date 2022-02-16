package com.david;

import java.util.InputMismatchException;

public class CommissionEmployee extends Employee{

float grossSales;
int commission;

    public CommissionEmployee(String firstName, String lastName, int id, float grossSales, int commission) {
        super(firstName, lastName, id);
        if(grossSales<0||commission<0)
            throw new InputMismatchException();
        this.grossSales = grossSales;
        this.commission = commission;
    }

    public CommissionEmployee() {
        super();
        this.commission =0;
        this.grossSales=0;
    }

    public float getGrossSales() {
        return grossSales;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof CommissionEmployee)) return false;
        if (!super.equals(o)) return false;

        CommissionEmployee that = (CommissionEmployee) o;

        if (Float.compare(that.grossSales, grossSales) != 0) return false;
        return commission == that.commission;
    }



    public void setGrossSales(float grossSales) {
        if(grossSales<0)
            throw new InputMismatchException();
        this.grossSales = grossSales;
    }

    public int getCommission() {
        return commission;
    }

    public void setCommission(int commission) {
        if(commission<0)
            throw new InputMismatchException();
        this.commission = commission;
    }

    @Override
    public String toString() {
        return super.toString()+
                "CommissionEmployee{" +
                "grossSales=" + grossSales +
                ", commission=" + commission +
                '}';
    }

    @Override
    public double earnings() {
        return grossSales*commission/100;
    }
}