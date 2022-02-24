package com.first.second;
import java.util.ArrayList;
import java.util.Scanner;

public class Empid {
    public static void main(String[] args) {

        Emplist E1 = new Emplist("Vamsi","Banka",25,343400);
        Emplist E2 = new Emplist("Rohith","Banka",22,354020);
        Emplist E3 = new Emplist("Manu","Pathrudu",22,365700);
        Emplist E4 = new Emplist("Tanu","Pathrudu",20,370800);
        Emplist E5 = new Emplist("Likitha","Malarouthu",19,380070);

        ArrayList<Emplist> employeelist = new ArrayList<>();

        employeelist.add(E1);
        employeelist.add(E2);
        employeelist.add(E3);
        employeelist.add(E4);
        employeelist.add(E5);
        Empid em=new Empid();

        em.employeedetails(employeelist);
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lastname of employee:");
        String lastname= sc.nextLine();
        em.empdetailsbylastname(employeelist,lastname);
        em.maxsalary(employeelist);
        em.avgagee(employeelist);


    }
    public void employeedetails(ArrayList<Emplist> employeelist){
        for (Emplist e : employeelist){
            System.out.println("First Name : " + e.firstname + " , Last Name : "+ e.lastname + " , Age : "+e.age+" , Salary : " + e.salary);
        }
    }
    public void empdetailsbylastname(ArrayList<Emplist> employeelist, String lastname){
        for(Emplist f: employeelist){
            if(lastname.equals(f.lastname)){
                System.out.println("Details of employee:"+"First Name : " + f.firstname + " , Last Name : "+ f.lastname + " , Age : "+f.age+" , Salary : " + f.salary);
            }
        }
    }
    public void maxsalary(ArrayList<Emplist> employeelist){
        double max=0;
        String mname="";
        for(Emplist s:employeelist){
            if(s.salary>max){
                max=s.salary;
                mname=s.firstname;
            }
        }
        System.out.println("Maximum salary of employees "+max+ " "+mname);
    }
    public void avgagee(ArrayList<Emplist> employeelist){
        int agee=0;
        int count=0;
        int old=0;

        String oname="";
        for(Emplist g:employeelist){
            agee=agee+g.age;
            count++;
            if(g.age>old){
                old=g.age;
                oname=g.firstname;
            }
        }
        System.out.println("Average age of employees: "+(agee/count));
        System.out.println("oldest employee: "+old+" "+ oname);
        int young=(agee/count);
        String yname="";
        for(Emplist h:employeelist){
            if(h.age<young){
                young=h.age;
                yname=h.firstname;
            }
        }
        System.out.println("Youngest employee: "+yname+" "+young);

    }
}
