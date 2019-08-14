package com.company;

import org.w3c.dom.css.Rect;

import java.util.Scanner;

public class Main {


    public static void main(String[] args) {
	// write your code here
        Scanner sc = new Scanner(System.in);
        Shape r = new Rectangle();
        Shape t = new Triangle();
        Shape c = new Circle();

        Circle c2 = new Circle();
        Rectangle r2 = new Rectangle();


        Triangle t2 = new Triangle();

        System.out.println("------ Calculator Shape ------");
        double l, w, radius, a, b, d;

        radius = c2.validateCircle();
        c = new Circle(radius);
        c.printResult();

        l = r2.validateRect();
        w = r2.validateRect();
        r = new Rectangle(l,w);
        r.printResult();

        a = t2.validateTriangle();
        b = t2.validateTriangle();
        d = t2.validateTriangle();
        t = new Triangle(a,b,d);
        t.printResult();

    }
}
