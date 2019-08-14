package com.company;

import java.util.Scanner;

public class Rectangle extends Shape {
    private double width;
    private double length;
    Scanner sc = new Scanner(System.in);

    public double validateRect() {
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

    public Rectangle() {

    }

    public Rectangle(double width, double length) {
        this.length = length;
        this.width = width;
    }

    public double getWidth() {
        return width;
    }

    public double getLength() {
        return length;
    }

    public void setWidth() {
        this.width = width;
    }

    public void setLength() {
        this.length = length;
    }

    @Override
    public void printResult() {
        System.out.println("------ Rectangle ------");
        System.out.println("Width: " + getWidth());
        System.out.println("Length: " + getLength());
        System.out.println("Area: " + getArea());
        System.out.println("Perimeter: " + getPerimeter());
    }

    @Override
    public double getArea() {
        return this.length * this.width;
    }

    @Override
    public double getPerimeter() {
        return (this.length + this.width) * 2;
    }

}
