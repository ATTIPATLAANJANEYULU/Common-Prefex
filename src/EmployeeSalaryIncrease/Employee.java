package EmployeeSalaryIncrease;

import java.util.ArrayList;
import java.util.function.Function;
import java.util.function.Predicate;

public class Employee {

    String empName;
    double empSalary;

    public Employee(String empName, Double empSalary) {
        this.empName = empName;
        this.empSalary = empSalary;
    }

    public String toString() {
        return empName + " =" + empSalary;
    }


    public static void main(String[] args) {

        ArrayList<Employee> al = new ArrayList<Employee>();
       populate(al);
        System.out.println("Before increment");
        System.out.println(al);

        Predicate<Employee> p=e->e.empSalary<3500;
        Function<Employee,Employee> f=e->{
        e.empSalary=e.empSalary+1000;
            return e;
            };
        System.out.println("after increment");
        ArrayList<Employee>al2=new ArrayList<Employee>();
        for (Employee e:al){
            if(p.test(e)){
                al2.add(f.apply(e));
            }
        }
       System.out.println(al);
        System.out.println(al2);


/*
to check total employee salary
        Function<ArrayList<Employee>, Double> f = al1 -> {
            double total = 0;
            for (Employee e : al1) {
                total = total + e.empSalary;
            }

            return total;
        };
            System.out.println("toatal salary=" + f.apply(al));
*/
        }
public static void populate(ArrayList<Employee>al){
    al.add(new Employee("anji", 1000.00));
    al.add(new Employee("subbu", 2000.00));
    al.add(new Employee("narsi", 3000.00));
    al.add(new Employee("Ramu",4000.00));
}
    }
