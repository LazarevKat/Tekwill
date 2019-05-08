/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Kate
 */
public class Circle implements IMovable {
    
    private Point point;
    private double radius;
    
    public Circle(Point center, double radius) {
        this.point = center;
        this.radius = radius;
    }
    
    public Point getPoint() {
        return point;
    }
    
    public void setPoint(Point point) {
        this.point = point;
    }
    
    public double getRadius() {
        return radius;
    }
    
    public void setRadius(double radius) {
        this.radius = radius;
    }
    
    @Override
    public String toString() {
        return ("Circle with center " + this.point + " radius " + this.radius);
    }
    
    @Override
    public void moveUp(int distance) {
        this.point.setY(this.point.getY() + distance);
    }

    @Override
    public void moveDown(int distance) {
        this.point.setY(this.point.getY() - distance);
    }

    @Override
    public void moveLeft(int distance) {
        this.point.setX(this.point.getX() - distance);
    }

    @Override
    public void moveRight(int distance) {
        this.point.setX(this.point.getX() + distance);
    }
}
