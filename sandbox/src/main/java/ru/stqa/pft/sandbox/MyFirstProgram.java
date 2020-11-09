package ru.stqa.pft.sandbox;

import java.sql.SQLOutput;

public class MyFirstProgram {

    public static void main(String[] args) {
		hello("World");
		hello("User");
		hello("Andrey");

		Square s = new Square(5) ;
				System.out.println("Площадь квадрата со стороной " + s.l + " = " + s.area());

		Rectangle k = new Rectangle(5,6);
				System.out.println("Площадь со сторонами " + k.a + " и " + k.b + " = " + area(k));

		Point p = new Point(5,5,25,5);
		System.out.println("Растояние между точками А и В = " + p.distance());


    }
    public static void hello(String somebody){

		System.out.println("Hello, " + somebody + "!");
	}

	public static double area(Rectangle r){

    	return r.a * r.b;
	}


}