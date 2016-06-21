package com.java.concepts;

class Shape {
    public Shape makeCopy() {
      return new Shape();
    }
}

class Circle extends Shape {
    @Override
    public Circle makeCopy() {
       return new Circle();
    }
}

public class Unbox {
    public static void main(String[] args) {
        Shape s = new Circle();
        Shape c = s.makeCopy();
    }
}