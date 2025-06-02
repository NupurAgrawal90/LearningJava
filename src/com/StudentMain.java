package com;

public class StudentMain {

        public static void main(String[] args)
        {
        Student s1 = new Student();
        Student s2 = new Student();
        Student s3 = new Student();

        s1.setValue("Ritu","Science",9,10);
        s2.setValue("Kavita","Hindi",2,10);
        s3.setValue("vinod","Math",11,12);
        s1.display();
        s2.display();
        s3.display();
    }
}
