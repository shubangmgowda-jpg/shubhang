package fsd1;

class emp1 {
    int id;
    String name;
    double salary;

    emp1(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    void display(emp1 emp) {   // Object passed as argument
        System.out.println("Employee Details");
        System.out.println("ID : " + emp.id);
        System.out.println("Name : " + emp.name);
        System.out.println("Salary : " + emp.salary);
    }

    public static void main(String[] args) {
        emp1 e1 = new emp1(101, "Rahul", 35000);
     

        e1.display(e1);  
        System.out.println("id inside void main:"+e1.id);
        System.out.println("name inside void main:"+e1.name);
        System.out.println("salary inside void main:"+e1.salary);
    }
}