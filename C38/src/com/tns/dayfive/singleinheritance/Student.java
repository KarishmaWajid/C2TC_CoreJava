package com.tns.dayfive.singleinheritance;
 public class Student extends Citizen {
private int rollNo;
private String collegeName;
public Student() {
super();
}
public Student(String name, String aadharNo, 
String address, long phno, int rollNo, String 
collegeName) {
super(name, aadharNo, address, phno); 
//accessing parent class constructor
this.rollNo = rollNo;
this.collegeName = collegeName;
}
public int getRollNo() {
return rollNo;
}
public void setRollNo(int rollNo) {
this.rollNo = rollNo;
}
public String getCollegeName() {
return collegeName;
}
public void setCollegeName(String 
collegeName) {
this.collegeName = collegeName;
}
@Override
public String toString() {
return "Student [rollNo=" + rollNo + ", collegeName=" + collegeName + ", Name=" + getName()+ ", AadharNo=" + getAadharNo() + ", Address=" + getAddress() + ", Phno=" + getPhno();
}
}
//Program to demonstrate Single Inheritance 
public class SLInheritanceDemo {
public static void main(String[] args) {
Student student = new Student("Gayatri", 
"8080808080", "Bangalore", 9888878787L, 10, 
"City College");
System.out.println(student);
}
}
