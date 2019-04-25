package com.kgisl.qs1;
import java.util.Scanner;
 
 class Employe {
 
 int empid;
 String name;
 float salary;
public int id;

 
 public Employe(int i, String string, String string2) {
}

public Employe(String string, String string2, int i) {
}

    public Employe() {
    }

    public void getInput() {
 
  Scanner in = new Scanner(System.in);
  System.out.print("Enter the empid : ");
  empid = in.nextInt();
  System.out.print("Enter the name : ");
  name = in.next();
  System.out.print("Enter the salary : ");
  salary = in.nextFloat();
 }
 
 public void display() {
  
  System.out.println("Employe id = " + empid);
  System.out.println("Employe name = " + name);
  System.out.println("Employe salary = " + salary);
 }
 
 public static void main(String[] args) {
 
  Employe e[] = new Employe[2];
  
  for(int i=0; i<2; i++) {
   
   e[i] = new Employe();
   e[i].getInput();
  }
  
  System.out.println("**** Data Entered as below ****");
  
  for(int i=0; i<2; i++) {
   
   e[i].display();
  }
 }

public Employe getDetails(int i) {
	return null;
}

public void getDetails(Employe e1) {
}

public int getSalary() {
	return 0;
}
}