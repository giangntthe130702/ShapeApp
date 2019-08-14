package com.company;

import java.util.Scanner;

import static java.lang.StrictMath.sqrt;

public class Triangle extends  Shape{
    private double a, b, c;

    public double validateTriangle(){
        double side;
        while (true) {
            try {
                System.out.println("Enter side: ");
                side = Double.parseDouble(sc.next());

                if (side < 0) {
                    System.out.println("Side must > 0");
                } else {
                    break;
                }
            } catch (NumberFormatException ex) {
                System.out.println("Side must be a number !!!");
            }
        }
        return side;
    }

    Scanner sc = new Scanner(System.in);
    public Triangle(){

    }

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double getA() {
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    @Override
    public void printResult(){
        System.out.println("--- Triangle ---");
        System.out.println("Side a: " + getA());
        System.out.println("Side b: " + getB());
        System.out.println("Side c: " + getC());
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    @Override
    public double getPerimeter(){
        return this.a + this.b + this.c;
    }

    @Override
    public double getArea(){
        double result, p;
        p = getPerimeter() / 2;
        result = (double) p * (p - this.a) * (p - this.b) * (p-this.c);
        return sqrt(result);
    }


}
