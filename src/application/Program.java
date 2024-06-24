package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import enums.Color;

public class Program {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    List<Shape> shapes = new ArrayList<>();

    System.out.print("Enter the number of shapes: ");
    int n = sc.nextInt();

    for (int i = 0; i  < n; i ++){
        System.out.println("Shape #" + (i + 1 ) + " data: ");
        System.out.print("Rectangle or Circle (r/c)? ");
        char rc = sc.next().toUpperCase().charAt(0);
        System.out.print("Color (BLACK/BLUE/RED): ");
        Color color = Color.valueOf(sc.next().toUpperCase());

        if(rc == 'R'){
            System.out.print("Width: ");
            double width = sc.nextDouble();
            System.out.print("Height: ");
            double height = sc.nextDouble();
            shapes.add(new Rectangle(color, width, height));

        } else {
            System.out.print("Radius: ");
            double radius = sc.nextDouble();
            shapes.add(new Circle(color, radius));
            }
        }

        System.out.println();
        System.out.println("Shape Areas:");

        for(Shape sh: shapes){
            System.out.println(sh);
        }
    
        sc.close();
    }
}
