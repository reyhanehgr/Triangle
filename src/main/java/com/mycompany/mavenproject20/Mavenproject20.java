/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject20;

///Triangle
public class Mavenproject20 {

    public static void main(String[] args) {
        
        System.out.println("Triangle T1:");
        Triangle T1 = new Triangle(3,4);
        T1.PrintInfo();
        System.out.println("_____________________");
        System.out.println("Triangle T2:");
        Triangle T2 = new Triangle(6,-8);
        T2.PrintInfo();
        System.out.println("_____________________");
        Triangle T3=T2.copy();
        System.out.println("Triangle T3:");
        T3.PrintInfo();
    }
    
}
