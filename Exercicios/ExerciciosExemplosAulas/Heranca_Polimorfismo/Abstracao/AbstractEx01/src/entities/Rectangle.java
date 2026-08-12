package entities;

import entities.enums.Color;

public class Rectangle extends Shape{

    private Double width;
    private Double height;


    public Rectangle() {
        super();
    }

    public Rectangle(Color color, Double width, Double height) {
        super(color);
        this.width = width;
        this.height = height;
    }

    @Override
    public Double area(){
        return width * height;
    }
}
