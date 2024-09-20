/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package firstjavaact;

/**
 *
 * @author SCC-COLLEGE
 */
public class Grades {
    int id;
    String name;
    double p, m , pre, fi;
    public void addGrades(int id , String name, double p , double m, double pr, double fi){
        this.id = id;
        this.name = name;
        this.p = p;
        this.m = m;
        this.pre = pr;
        this.fi = fi;
             
    }
    public void viewGrades(){
        double average = (this.p + this.m + this.pre + this.fi)  / 4;
        String status = ( average  > 3.0 ) ? "Failed " : "Passed";
        System.out.printf("%-10d %-10s %-10.2f %-10.2f %-10.2f %-10.2f %-10.2f %-10s %n ",this.id, this.name, this.p, this.m, this.pre, this.fi, average, status);
    }
}
