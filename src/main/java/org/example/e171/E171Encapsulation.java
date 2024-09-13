package org.example.e171;

class  Employee{
    private String empName = "John";
    private int empAge = 30;

//Constructor
public Employee() {

}


//Getter methods
    public String getEmpName() {
        return empName;
    }

    public int getEmpAge() {

        return empAge;
    }
public void displayPrint(){
    System.out.println("Employee Name: "+empName);
    System.out.println("Employee Age: "+empAge);
    }
}


public class E171Encapsulation {
    public static void main(String[] args){
        Employee employee=new Employee();
        //employee.getEmpName();
      //  employee.getEmpAge();
employee.displayPrint();


    }

}



