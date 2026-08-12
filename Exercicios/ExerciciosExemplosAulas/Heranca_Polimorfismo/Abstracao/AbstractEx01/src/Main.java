import entities.Circle;
import entities.Rectangle;
import entities.Shape;
import entities.enums.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of shapes: ");
        int quantity = sc.nextInt();

        List<Shape> shapesList = new ArrayList<>();

        for (int i = 0; i < quantity; i++) {
            System.out.println("Shape #"+(i+1)+" data:");
            System.out.print("Rectangle or Circle (r/c) ?");
            char typeShape = sc.next().charAt(0);

            System.out.print("Color (BLACK/BLUE/RED): ");
            String color = sc.next();
            Color color1 = Color.valueOf(color);

            if (typeShape=='r'||typeShape=='R') {
                System.out.print("Width: ");
                Double width = sc.nextDouble();
                System.out.print("Height: ");
                Double height = sc.nextDouble();

                shapesList.add(new Rectangle(color1, width, height));
            }
            else if (typeShape=='c'||typeShape=='C'){
                System.out.print("Radius: ");
                Double radius = sc.nextDouble();
                shapesList.add(new Circle(color1, radius));
            }

        }
        System.out.println("SHAPE AREAS: ");
        for (Shape shape : shapesList){
            System.out.println(shape.area());
        }
        sc.close();
    }
}