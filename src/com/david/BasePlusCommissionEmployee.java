package com.david;

import java.util.InputMismatchException;

public class BasePlusCommissionEmployee extends CommissionEmployee{

    float baseSalary;

    public BasePlusCommissionEmployee(String firstName, String lastName, int id, float grossSales, int commission, float baseSalary) {
        super(firstName, lastName, id, grossSales, commission);
        if(baseSalary<0)
            throw new InputMismatchException();
        this.baseSalary = baseSalary;
    }

    public float getBaseSalary() {
        return baseSalary;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof BasePlusCommissionEmployee)) return false;
        if (!super.equals(o)) return false;

        BasePlusCommissionEmployee that = (BasePlusCommissionEmployee) o;

        return Float.compare(that.baseSalary, baseSalary) == 0;
    }



    @Override
    public String toString() {
        return super.toString()+"BasePlusCommissionEmployee{" +
                "baseSalary=" + baseSalary +
                '}';
    }

    public void setBaseSalary(float baseSalary) {
        if(baseSalary<0)
            throw new InputMismatchException();
        this.baseSalary = baseSalary;
    }

    public BasePlusCommissionEmployee() {
        super();
        this.baseSalary = 0;
    }

    @Override
    public double earnings() {
        return baseSalary+super.earnings();
    }
}
