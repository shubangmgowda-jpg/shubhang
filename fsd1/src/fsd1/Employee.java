package fsd1;

import java.util.ArrayList;

class EmployeeData {
    int id;
    String name;
    double salary;

    EmployeeData(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display(ArrayList<EmployeeData> e2) {
    	 for (EmployeeData e : e2) {
             System.out.println("ID : " + e.id);
             System.out.println("Name : " + e.name);
             System.out.println("Salary : " + e.salary);
             System.out.println();
         }
       
    }
    void display1() {
        System.out.println("Employee ID : " + id);
        System.out.println("Employee Name : " + name);
        System.out.println("Salary : " + salary);
        System.out.println();
    }
   
}

public class Employee {
    public static void main(String[] args) {

        ArrayList<EmployeeData> employees = new ArrayList<>();

        employees.add(new EmployeeData(101, "Rahul", 35000));
        employees.add(new EmployeeData(102, "Anjali", 42000));
        employees.add(new EmployeeData(103, "Kiran", 39000));
        
        EmployeeData s1=new EmployeeData(541,"vinay",25.1478541);
        s1.display(employees);

        System.out.println("Employee Details:");

        for (EmployeeData emp : employees) {
            emp.display1();
        }
    }
}