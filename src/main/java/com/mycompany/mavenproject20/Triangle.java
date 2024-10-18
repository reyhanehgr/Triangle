/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject20;

public class Triangle {
    private double a;
    private double b;
    public Triangle(double a1,double b1){
        set_a(a1);
        set_b(b1);
    }
    public double get_a(){
        return a;    
    }
    public void set_a(double value){
        a =Math.abs(value);
    }
    public double get_b(){
        return b;    
    }
    public void set_b(double value){
        b =Math.abs(value);
    }
    public double get_c(){
        double c = Math.sqrt(a*a + b*b);
        return c;
    }
    public double get_Area(){
        return(a*b)/2;
    }
    public double get_theta(){
        return Math.atan2(b, a)*180/Math.PI;
    }
    public double get_phi(){
        return Math.atan2(a, b)*180/Math.PI;
    }
    public void PrintInfo(){
        System.out.println("Triangle:");
        System.out.format("a = %f , b = %f , c =%f\n", a, b,get_c());
        System.out.format("s = %f\n", get_Area());
        System.out.format("theta = %f\n", get_theta());
        System.out.format("phi = %f\n", get_phi());
    }
    public Triangle copy(){
        return new Triangle(a,b);
    }
}
