package com.david;

import java.util.InputMismatchException;

public abstract class Employee
{
    private String firstName;
    private  String lastName;
    private  int id;

    public Employee(String firstName, String lastName, int id) {
        if(id<0)
            throw new InputMismatchException();
       var check= firstName.toCharArray();
      /** for(int i :check)
       {
           if(check[i]>'0'&&check[i]<'9')
               throw new InputMismatchException();
       }
        check=lastName.toCharArray();
        for(int i :check)
        {
            if(check[i]>'0'&&check[i]<'9')
                throw new InputMismatchException();
        }*/
        this.firstName = firstName;
        this.lastName = lastName;
        this.id = id;
    }

    public Employee() {
        this.firstName = "plony";
        this.lastName = "almony";
        this.id = 0;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        var check= firstName.toCharArray();
        for(int i :check)
        {
            if(check[i]>'0'&&check[i]<'9')
                throw new InputMismatchException();
        }
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
      /**  var check= lastName.toCharArray();
        for(int i :check)
        {
            if(check[i]>'0'&&check[i]<'9')
                throw new InputMismatchException();
        }*/
        this.lastName = lastName;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        if(id<0)
            throw new InputMismatchException();
        this.id = id;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", id=" + id +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Employee employee = (Employee) o;

        return id == employee.id;
    }

    /**
     * calculate salary for employee
     */

   public  abstract  double earnings();
}
