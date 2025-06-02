package com;

public class Student {
    String studName,stuDept;
    int rollNumber,age;

    public void setValue(String studName, String stuDept, int rollNumber, int age)
    {   this.studName = studName;
        this.stuDept = stuDept;
        this.rollNumber = rollNumber;
        this.age = age;

    }

    public void display()
    {
        //System.out.println("Student of the year is" +studName);
        System.out.println("age of "+studName+" is "+age);
    }
}
