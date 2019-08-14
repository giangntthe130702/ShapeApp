package com.company;

import java.util.Scanner;

public class Circle extends  Shape{
    Scanner sc = new Scanner(System.in);
    private double radius;

    public Circle(){

    }

    public double validateCircle(){
        double radius;
        while(true){
            try{
                System.out.println("Radius: ");
                radius = Double.parseDouble(sc.next());

                if (radius < 0){
                    System.out.println("Radius must > 0");
                }

                else {
                    break;
                }
            }
            catch (NumberFormatException ex){
                System.out.println("Radius must be number !!!");
            }
        }
        return radius;
    }

    public Circle(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return radius;
    }

    @Override
    public void printResult(){
        System.out.println("--- Circle ---");
        System.out.println("Radius: " + getRadius());
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    @Override
    public double getArea(){
        return 2 * this.radius * Math.PI;
    }

    @Override
    public double getPerimeter(){
        return this.radius * this.radius * Math.PI;
    }

}
