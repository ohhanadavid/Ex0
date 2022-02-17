package com.david;

public class Payroll {

    public static void main(String[] args) {

try {
    Employee[] employee;
    employee= new Employee[3];

    employee[0] = new HourlyEmployee("Yosi", "Cohen", 123, 25, (float) 26.4);

    employee[1] = new CommissionEmployee("Haiim", "Mordecay", 456, 850.65f, 25);

    employee[2] = new BasePlusCommissionEmployee("Roni", "Maclof", 789, 456.2f, 14, 8000);

    for (var i:employee)
    {

        System.out.println(i.toString());
        System.out.print("The selery is:");

        if (i.getClass().getName() ==  BasePlusCommissionEmployee.class.getName()) {

            var selery=((BasePlusCommissionEmployee)i).baseSalary*1.1;
            ((BasePlusCommissionEmployee)i).setBaseSalary((float) selery);
        }

            System.out.println(i.earnings());

    }
}catch (Exception ex){System.out.print(ex);}

    }

}
