
package com.daysix_inheritance;

public class Student extends Citizen{

    private int rollno;
    private String collegeName;

    public Student(){
        super();
    }

    public Student(String collegeName, int rollno, String address, String name, String adhaar, long phnno){
        super(adhaar, name, address, phnno);
        System.out.println("This is student param constructor");
        this.rollno = rollno;
        this.collegeName = collegeName;
        System.out.println(this);
    }

    @Override
    public String toString() {
        return "Student [rollno=" + rollno + ", collegeName=" + collegeName + "]" + "name=" + name + ", address=" + address + ", phnno=" + phnno + ", adhaar=" + adhaar + "]";
    }
    
}

